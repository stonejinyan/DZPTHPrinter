import java.io.IOException;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyPrintService {

	public static JTextArea LogText = new JTextArea();
	public static String Y = "0";
	public static String X = "0";

	public static void main(String args[]) throws IOException {
		// s.setDaemon(true);// 设置线程为后台线程，tomcat不会被hold,启动后依然一直监听。
		JFrame frame = new JFrame("Order Tracking打印程序1.2");
		// Setting the width and height of frame
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/*
		 * 创建面板，这个类似于 HTML 的 div 标签 我们可以创建多个面板并在 JFrame 中指定位置 面板中我们可以添加文本字段，按钮及其他组件。
		 */
		JPanel panel = new JPanel();

		// 添加面板
		frame.add(panel);
		panel.setLayout(null);

		JLabel LogLabel = new JLabel("日志：");
		LogLabel.setBounds(10, 10, 80, 25);
		panel.add(LogLabel);

		LogText.setEditable(false);
		LogText.setBounds(100, 10, 500, 500);
		panel.add(LogText);
		/*
		 * 调用用户定义的方法并添加组件到面板
		 */
		// placeComponents(panel);

		// 设置界面可见
		frame.setVisible(true);
		StartThread s = new StartThread();
		// s.setDaemon(true);
		s.start();
		MyPrintService.LogText.setText(new Date() + "程序启动！" + "\n" + MyPrintService.LogText.getText());
	}

	public static void StartService(String[] args) {
		// 启动服务的方法
		System.out.println("开始启动服务");
		StartThread s = new StartThread();
		s.setDaemon(true);
		s.start();
		System.out.println("服务已启动");
	}

	public static void StopService(String[] args) {
		System.out.println("停止服务");
	}
}
