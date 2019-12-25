import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.RemoteException;
import java.util.Date;

import com.otracking.bean.DZPTH;
import com.otracking.bean.MOTable;
import com.otracking.webservice.GetDZPInfoByAOPService;
import com.otracking.webservice.GetDZPInfoByAOPServiceProxy;
import com.otracking.webservice.GetMOInfoByIDService;
import com.otracking.webservice.GetMOInfoByIDServiceProxy;

public class SocketData implements Runnable {
	private ServerSocket serverSocket;
	private Socket socket;
	private InputStream in;
	private OutputStream out;

	public SocketData(Socket clientSocket, ServerSocket clientserverSocket) {
		try {
			serverSocket = clientserverSocket;
			// 得到socket连接
			socket = clientSocket;
			// 得到客户端发来的消息
			in = socket.getInputStream();
			// 返回报文
			out = socket.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		try {
			String tem = null;
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, "utf-8"));
			tem = bufferedReader.readLine();
			tem = tem.substring(5).trim();// 去掉头部的 GET /
			tem = tem.substring(0, tem.length() - 9).trim();// 去掉尾部的 HTTP/1.1
			// MyPrintService.LogText.setText(new Date() + "order:" + tem + "\n" +
			// MyPrintService.LogText.getText());
			if (!tem.equals("favicon.ico")) {
				MOTable mo = getMOInfo(Integer.parseInt(tem));
				MyPrintService.LogText
				        .setText(new Date() + "MO:" + mo.getName() + "\n" + MyPrintService.LogText.getText());
				ZplPrinter.Print(mo, getDZPInfo(mo.getDms_id(), mo.getOrder_id()));
			}
			PrintWriter pw = new PrintWriter(out, true);
			pw.write("HTTP/1.1 200 OK");
			pw.write("Content-Type: text/html;charset=UTF-8");
			pw.write(("Date: " + new Date().toString()));
			pw.write("Content-Length: 10");
			pw.write("");
			pw.write("已打印");
			pw.flush();
			// pw.flush();
			// pw.close();
			// out.close();
			socket.shutdownOutput();
			socket.close();
			// serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 7012
	public MOTable getMOInfo(int mo_id) {
		// 换成对应的proxy类
		GetMOInfoByIDServiceProxy proxy = new GetMOInfoByIDServiceProxy();
		proxy.setEndpoint("http://10.177.118.249:8888/Otracking/services/GetMOInfoByIDService?wsdl");
		// 换成获取对应的serice
		GetMOInfoByIDService service = proxy.getGetMOInfoByIDService();
		// 调用web service提供的方法
		MOTable result = null;
		try {
			result = service.getMOByID(mo_id);
			return result;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//
	public DZPTH[] getDZPInfo(String dms_id, int order_id) {
		// 换成对应的proxy类
		GetDZPInfoByAOPServiceProxy proxy = new GetDZPInfoByAOPServiceProxy();
		proxy.setEndpoint("http://10.177.118.249:8888/Otracking/services/GetDZPInfoByAOPService?wsdl");
		// 换成获取对应的serice
		GetDZPInfoByAOPService service = proxy.getGetDZPInfoByAOPService();
		// 调用web service提供的方法
		DZPTH[] result;
		try {
			MyPrintService.LogText.setText(new Date() + "获取数据" + "\n" + MyPrintService.LogText.getText());
			result = service.getDZPInfoByAOP(dms_id, order_id);
			MyPrintService.LogText.setText(new Date() + "返回数据" + "\n" + MyPrintService.LogText.getText());
			return result;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			MyPrintService.LogText.setText(new Date() + e.getMessage() + "\n" + MyPrintService.LogText.getText());
			e.printStackTrace();
		}
		return null;
	}

	public static final String bytesToHexString(byte[] bArray) {
		StringBuffer sb = new StringBuffer(bArray.length);
		String sTemp;
		for (int i = 0; i < bArray.length; i++) {
			sTemp = Integer.toHexString(0xFF & bArray[i]);
			if (sTemp.length() < 2)
				sb.append(0);
			sb.append(sTemp.toUpperCase());
		}
		return sb.toString();
	}
}
