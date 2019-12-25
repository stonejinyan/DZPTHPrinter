import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.standard.PrinterName;

import com.otracking.bean.DZPTH;
import com.otracking.bean.MOTable;

public class ZplPrinter {
	private String printerURI = null;// 打印机完整路径
	private PrintService printService = null;// 打印机服务
	private byte[] dotFont;
	private String begin = "^XA"; // 标签格式以^XA开始
	private String end = "^XZ"; // 标签格式以^XZ结束
	private String content = "";

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public static void Print(MOTable mo, DZPTH[] dzpths) {
		MyPrintService.LogText.setText(new Date() + "开始打印" + "\n" + MyPrintService.LogText.getText());
		// ZplPrinter p = new ZplPrinter("ZDesigner GT800 (EPL) (副本 3)");
		ZplPrinter p = new ZplPrinter("ZDesigner GT800");
		// 1.打印单个条码
		String bar0 = mo.getName();// 条码内容
		String bar0Zpl1 = "^FO180,35^BY2,1.0,70^BCN,,Y,N,N^FD${data}^FS";// 条码样式模板
		String bar0Zpl = "^FO450,0^BQ,2,5^FDQA,${data}code^FS";// 条码样式模板
		p.setBarcode(bar0, bar0Zpl1);
		MyPrintService.LogText.setText(new Date() + "设置条码" + "\n" + MyPrintService.LogText.getText());
		int left = 100;
		int h = 35;
		int h_offset = 100;
		int l_offset = 250;
		// MyPrintService.LogText.setText(new Date() + "设置上半部分" + "\n" +
		// MyPrintService.LogText.getText());

		p.setText("项目:" + mo.getOrder_name(), left, 1 * h + h_offset, 30, 30, 20, 1, 1, 24);
		MyPrintService.LogText.setText(new Date() + "设置项目" + "\n" + MyPrintService.LogText.getText());
		p.setText("WBS:" + mo.getBatch_name(), left, 2 * h + h_offset, 30, 30, 20, 1, 1, 24);
		MyPrintService.LogText.setText(new Date() + "设置WBS" + "\n" + MyPrintService.LogText.getText());
		p.setText("MO:" + mo.getName() + " 柜号:" + mo.getCustomID(), left, 3 * h + h_offset, 30, 30, 20, 1, 1, 24);
		MyPrintService.LogText.setText(new Date() + "设置MO、柜号" + "\n" + MyPrintService.LogText.getText());
		p.setText("AOP:" + mo.getDms_id(), left, 4 * h + h_offset, 30, 30, 20, 1, 1, 24);
		MyPrintService.LogText.setText(new Date() + "设置AOP" + "\n" + MyPrintService.LogText.getText());
		p.setText("柜型:" + mo.getProduct_bigtype_name() + " " + mo.getProduct_type_name(), left, 5 * h + h_offset, 30,
		        30, 20, 1, 1, 24);
		MyPrintService.LogText.setText(new Date() + "设置柜型分类" + "\n" + MyPrintService.LogText.getText());
		p.setText("产线:" + mo.getProcessline() + "~No:" + mo.getNo(), left, 6 * h + h_offset, 30, 30, 20, 1, 1, 24);
		MyPrintService.LogText.setText(new Date() + "设置产线、排产序号" + "\n" + MyPrintService.LogText.getText());
		p.setText("排产日期:" + DateUtil.dateToStr(mo.getSchedule_starttime().getTime()), left, 7 * h + h_offset, 30, 30,
		        20, 1, 1, 24);
		MyPrintService.LogText.setText(new Date() + "设置排产日期" + "\n" + MyPrintService.LogText.getText());
		MyPrintService.LogText.setText(new Date() + "上半部分完成" + "\n" + MyPrintService.LogText.getText());
		if (dzpths != null) {
			MyPrintService.LogText.setText(new Date() + "图号不为空，请核对数量！" + "\n" + MyPrintService.LogText.getText());
			for (int j = 0; j < 12 && j < dzpths.length; j++) {
				if (j % 2 == 0) {
					p.setText(dzpths[j].getHeadingline() + ":" + dzpths[j].getDescription(), left,
					        (j / 2 + 8) * h + h_offset, 30, 30, 15, 1, 1, 24);
				} else {
					p.setText(dzpths[j].getHeadingline() + ":" + dzpths[j].getDescription(), left + l_offset,
					        (j / 2 + 8) * h + h_offset, 30, 30, 15, 1, 1, 24);
				}
			}
			/*
			 * p.setText(dzpths[0].getHeadingline() + ":" + dzpths[0].getDescription(),
			 * left, 8 * h + h_offset, 30, 30, 15, 1, 1, 24);
			 * p.setText(dzpths[1].getHeadingline() + ":" + dzpths[1].getDescription(), left
			 * + l_offset, 8 * h + h_offset, 30, 30, 15, 1, 1, 24);
			 * p.setText(dzpths[2].getHeadingline() + ":" + dzpths[2].getDescription(),
			 * left, 9 * h + h_offset, 30, 30, 15, 1, 1, 24);
			 * p.setText(dzpths[3].getHeadingline() + ":" + dzpths[3].getDescription(), left
			 * + l_offset, 9 * h + h_offset, 30, 30, 15, 1, 1, 24);
			 * p.setText(dzpths[4].getHeadingline() + ":" + dzpths[4].getDescription(),
			 * left, 10 * h + h_offset, 30, 30, 15, 1, 1, 24);
			 * p.setText(dzpths[5].getHeadingline() + ":" + dzpths[5].getDescription(), left
			 * + l_offset, 10 * h + h_offset, 30, 30, 15, 1, 1, 24);
			 * p.setText(dzpths[6].getHeadingline() + ":" + dzpths[6].getDescription(),
			 * left, 11 * h + h_offset, 30, 30, 15, 1, 1, 24);
			 * p.setText(dzpths[7].getHeadingline() + ":" + dzpths[7].getDescription(), left
			 * + l_offset, 11 * h + h_offset, 30, 30, 15, 1, 1, 24);
			 * p.setText(dzpths[8].getHeadingline() + ":" + dzpths[8].getDescription(),
			 * left, 12 * h + h_offset, 30, 30, 15, 1, 1, 24);
			 * p.setText(dzpths[9].getHeadingline() + ":" + dzpths[9].getDescription(), left
			 * + l_offset, 12 * h + h_offset, 30, 30, 15, 1, 1, 24);
			 * p.setText(dzpths[10].getHeadingline() + ":" + dzpths[10].getDescription(),
			 * left, 13 * h + h_offset, 30, 30, 15, 1, 1, 24);
			 * p.setText(dzpths[11].getHeadingline() + ":" + dzpths[11].getDescription(),
			 * left + l_offset, 13 * h + h_offset, 30, 30, 15, 1, 1, 24);
			 */
			p.setText("Order Tracking", left + 230, 15 * h + h_offset - 15, 28, 28, 15, 1, 1, 24);
			String zpl = p.getZpl();
			System.out.println("执行打印");
			p.print(zpl);// 打印
			p.resetZpl();
			if (dzpths.length > 12) {
				for (int i = 0; i < ((double) (dzpths.length - 12)) / 26; i++) {
					p.setBarcode(bar0, bar0Zpl1);
					for (int j = 0; j < 26 && (12 + i * 26 + j < dzpths.length); j++) {
						if (j % 2 == 0) {
							p.setText(
							        dzpths[12 + i * 26 + j].getHeadingline() + ":"
							                + dzpths[12 + i * 26 + j].getDescription(),
							        left, (j / 2 + 1) * h + h_offset, 30, 30, 15, 1, 1, 24);
						} else {
							p.setText(
							        dzpths[12 + i * 26 + j].getHeadingline() + ":"
							                + dzpths[12 + i * 26 + j].getDescription(),
							        left + l_offset, (j / 2 + 1) * h + h_offset, 30, 30, 15, 1, 1, 24);
						}
					}
					p.setText("Order Tracking", left + 230, 15 * h + h_offset - 15, 28, 28, 15, 1, 1, 24);
					zpl = p.getZpl();
					p.print(zpl);// 打印
					p.resetZpl();
				}
			}
			MyPrintService.LogText.setText(new Date() + "打印条码:" + mo.getName() + "  端子排图量：" + dzpths.length + "\n"
			        + MyPrintService.LogText.getText());
		} else {
			MyPrintService.LogText.setText(new Date() + "图号为空" + "\n" + MyPrintService.LogText.getText());
			p.setText("Order Tracking", left + 230, 15 * h + h_offset - 15, 28, 28, 15, 1, 1, 24);
			String zpl = p.getZpl();
			System.out.println("执行打印");
			p.print(zpl);// 打印
			MyPrintService.LogText.setText(
			        new Date() + "打印条码:" + mo.getName() + "  端子排图量：0" + "\n" + MyPrintService.LogText.getText());
		}

	}

	/**
	 * 构造方法
	 * 
	 * @param printerURI 打印机路径
	 */
	public ZplPrinter(String printerURI) {
		this.printerURI = printerURI;
		// 加载字体
		File file = new File("C://ts24.lib");
		if (file.exists()) {
			FileInputStream fis;
			try {
				fis = new FileInputStream(file);
				dotFont = new byte[fis.available()];
				fis.read(dotFont);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			MyPrintService.LogText.setText(new Date() + "C://ts24.lib文件不存在" + "\n" + MyPrintService.LogText.getText());
			System.out.println("C://ts24.lib文件不存在");
		}
		// 初始化打印机
		PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
		if (services != null && services.length > 0) {
			for (PrintService service : services) {
				if (printerURI.equals(service.getName())) {
					printService = service;
					break;
				}
			}
		}
		if (printService == null) {
			System.out.println("没有找到打印机：[" + printerURI + "]");
			// 循环出所有的打印机
			if (services != null && services.length > 0) {
				System.out.println("可用的打印机列表：");
				for (PrintService service : services) {
					System.out.println("[" + service.getName() + "]");
				}
			}
		} else {
			System.out.println("找到打印机：[" + printerURI + "]");
			System.out.println("打印机名称：[" + printService.getAttribute(PrinterName.class).getValue() + "]");
		}
	}

	/**
	 * 设置条形码
	 * 
	 * @param barcode 条码字符
	 * @param zpl     条码样式模板
	 */
	public void setBarcode(String barcode, String zpl) {
		content += zpl.replace("${data}", barcode);
	}

	/**
	 * 中文字符、英文字符(包含数字)混合
	 * 
	 * @param str 中文、英文
	 * @param x   x坐标
	 * @param y   y坐标
	 * @param eh  英文字体高度height
	 * @param ew  英文字体宽度width
	 * @param es  英文字体间距spacing
	 * @param mx  中文x轴字体图形放大倍率。范围1-10，默认1
	 * @param my  中文y轴字体图形放大倍率。范围1-10，默认1
	 * @param ms  中文字体间距。24是个比较合适的值。
	 */
	public void setText(String str, int x, int y, int eh, int ew, int es, int mx, int my, int ms) {
		byte[] ch = str2bytes(str);
		for (int off = 0; off < ch.length;) {
			if (((int) ch[off] & 0x00ff) >= 0xA0) {
				int qcode = ch[off] & 0xff;
				int wcode = ch[off + 1] & 0xff;
				content += String.format("^FO%d,%d^XG0000%01X%01X,%d,%d^FS\n", x, y, qcode, wcode, mx, my);
				begin += String.format("~DG0000%02X%02X,00072,003,\n", qcode, wcode);
				qcode = (qcode + 128 - 32) & 0x00ff;
				wcode = (wcode + 128 - 32) & 0x00ff;
				int offset = ((int) qcode - 16) * 94 * 72 + ((int) wcode - 1) * 72;

				for (int j = 0; j < 72; j += 3) {
					qcode = (int) dotFont[j + offset] & 0x00ff;
					wcode = (int) dotFont[j + offset + 1] & 0x00ff;
					int qcode1 = (int) dotFont[j + offset + 2] & 0x00ff;
					begin += String.format("%02X%02X%02X\n", qcode, wcode, qcode1);
				}

				x = x + ms * mx;
				off = off + 2;
			} else if (((int) ch[off] & 0x00FF) < 0xA0) {
				setChar(String.format("%c", ch[off]), x, y, eh, ew);
				x = x + es;
				off++;
			}
		}
	}

	/**
	 * 英文字符串(包含数字)
	 * 
	 * @param str 英文字符串
	 * @param x   x坐标
	 * @param y   y坐标
	 * @param h   高度
	 * @param w   宽度
	 */
	public void setChar(String str, int x, int y, int h, int w) {
		content += "^FO" + x + "," + y + "^A0," + h + "," + w + "^FD" + str + "^FS";
	}

	/**
	 * 英文字符(包含数字)顺时针旋转90度
	 * 
	 * @param str 英文字符串
	 * @param x   x坐标
	 * @param y   y坐标
	 * @param h   高度
	 * @param w   宽度
	 */
	public void setCharR(String str, int x, int y, int h, int w) {
		content += "^FO" + x + "," + y + "^A0R," + h + "," + w + "^FD" + str + "^FS";
	}

	/**
	 * 获取完整的ZPL
	 * 
	 * @return
	 */
	public String getZpl() {
		return begin + content + end;
	}

	/**
	 * 重置ZPL指令，当需要打印多张纸的时候需要调用。
	 */
	public void resetZpl() {
		begin = "^XA";
		end = "^XZ";
		content = "";
	}

	/**
	 * 打印
	 * 
	 * @param zpl 完整的ZPL
	 */
	public boolean print(String zpl) {
		if (printService == null) {
			System.out.println("打印出错：没有找到打印机：[" + printerURI + "]");
			return false;
		}
		DocPrintJob job = printService.createPrintJob();
		byte[] by = zpl.getBytes();
		DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
		Doc doc = new SimpleDoc(by, flavor, null);
		try {
			job.print(doc, null);
			System.out.println("已打印");
			return true;
		} catch (PrintException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 字符串转byte[]
	 * 
	 * @param s
	 * @return
	 */
	private byte[] str2bytes(String s) {
		if (null == s || "".equals(s)) {
			return null;
		}
		byte[] abytes = null;
		try {
			abytes = s.getBytes("gb2312");
		} catch (UnsupportedEncodingException ex) {
			ex.printStackTrace();
		}
		return abytes;
	}
}
