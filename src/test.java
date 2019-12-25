import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import com.otracking.bean.DZPTH;
import com.otracking.bean.MOTable;
import com.otracking.webservice.GetDZPInfoByAOPService;
import com.otracking.webservice.GetDZPInfoByAOPServiceProxy;
import com.otracking.webservice.GetMOInfoByIDService;
import com.otracking.webservice.GetMOInfoByIDServiceProxy;

public class test {

	@Test
	public void print() {
		try {
			// ZplPrinter.Print("127469589");
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	@Test
	public void getMOInfo() {
		// 换成对应的proxy类
		GetMOInfoByIDServiceProxy proxy = new GetMOInfoByIDServiceProxy();
		proxy.setEndpoint("http://10.177.118.249:8888/Otracking/services/GetMOInfoByIDService?wsdl");
		// 换成获取对应的serice
		GetMOInfoByIDService service = proxy.getGetMOInfoByIDService();
		// 调用web service提供的方法
		MOTable result;
		try {
			result = service.getMOByID(7012);
			System.out.println(result.getName());
			DZPTH[] dzpths = getDZPInfo(result.getDms_id(), result.getOrder_id());
			ZplPrinter.Print(result, getDZPInfo(result.getDms_id(), result.getOrder_id()));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<String> getLabelList() throws EncryptedDocumentException, IOException {
		// 方法一：使用WorkbookFactory
		List<String> PrintLabels = new ArrayList<String>();
		FileInputStream in = null;
		Workbook wb = null;
		File file = new File("C:\\Users\\sesa511463\\Desktop\\新建 Microsoft Excel 工作表 (4).xlsx");
		in = new FileInputStream(file);
		wb = WorkbookFactory.create(in);
		for (int numSheet = 0; numSheet < wb.getNumberOfSheets(); numSheet++) {
			Sheet sheet = wb.getSheetAt(numSheet);
			if (sheet == null) {
				continue;
			} else {
				for (int i = 1; i <= sheet.getLastRowNum(); i++) {
					Row row = sheet.getRow(i);
					if (row != null) {
						Cell cell0 = row.getCell(2);
						System.out.println(cell0.getStringCellValue());
						// ZplPrinter.Print(cell0.getStringCellValue());
					}
				}
			}
		}
		return PrintLabels;
	}

	public DZPTH[] getDZPInfo(String dms_id, int order_id) {
		// 换成对应的proxy类
		GetDZPInfoByAOPServiceProxy proxy = new GetDZPInfoByAOPServiceProxy();
		proxy.setEndpoint("http://10.177.118.249:8888/Otracking/services/GetDZPInfoByAOPService?wsdl");
		// 换成获取对应的serice
		GetDZPInfoByAOPService service = proxy.getGetDZPInfoByAOPService();
		// 调用web service提供的方法
		DZPTH[] result;
		try {
			result = service.getDZPInfoByAOP(dms_id, order_id);
			return result;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
