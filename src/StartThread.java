import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class StartThread extends Thread {
	public void run() {
		int GPSport = 55668;
		try {
			ServerSocket serverSocket = new ServerSocket(GPSport);
			// 轮流等待请求
			while (true) {
				// 等待客户端请求,无请求则闲置;有请求到来时,返回一个对该请求的socket连接
				Socket clientSocket = serverSocket.accept();
				// 创建zithread对象,通过socket连接通信
				Thread t = new Thread(new SocketData(clientSocket, serverSocket));
				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}