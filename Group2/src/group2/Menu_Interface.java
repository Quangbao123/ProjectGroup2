package group2;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu_Interface extends JFrame {
	JButton btnCong, btnTru, btnNhan, btnChia, btnChiaLayDu;
	public Menu_Interface(String title) {
		this.setTitle(title);
		addControl();
		addEvents();
	}
	public void addEvents() {
		 btnNhan.addActionListener(e -> {
	            try {
	                String str1 = javax.swing.JOptionPane.showInputDialog("Nhập số thứ nhất:");
	                String str2 = javax.swing.JOptionPane.showInputDialog("Nhập số thứ hai:");
	                double a = Double.parseDouble(str1);
	                double b = Double.parseDouble(str2);
	                double result = a * b;
	                javax.swing.JOptionPane.showMessageDialog(null, "Kết quả: " + result);
	            } catch (Exception ex) {
	                javax.swing.JOptionPane.showMessageDialog(null, "Lỗi: Vui lòng nhập số hợp lệ.");
	            }
	        });
		 btnCong.addActionListener(e -> {
	            try {
	                String str1 = javax.swing.JOptionPane.showInputDialog("Nhập số thứ nhất:");
	                String str2 = javax.swing.JOptionPane.showInputDialog("Nhập số thứ hai:");
	                double a = Double.parseDouble(str1);
	                double b = Double.parseDouble(str2);
	                double result = a + b;
	                javax.swing.JOptionPane.showMessageDialog(null, "Kết quả: " + result);
	            } catch (Exception ex) {
	                javax.swing.JOptionPane.showMessageDialog(null, "Lỗi: Vui lòng nhập số hợp lệ.");
	            }
	        });
		 

	}
	
	public void addControl() {
		Container cons = getContentPane();
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		cons.add(pnMain);
		
		// dong label
		JPanel pnLabel = new JPanel();
		pnLabel.setLayout(new FlowLayout());
		JLabel lblMenu = new JLabel("MENU");
		pnLabel.add(lblMenu);
		pnMain.add(pnLabel);
		
		
		// dong phep cong tru
		JPanel pnCongTru = new JPanel();
		pnCongTru.setLayout(new FlowLayout());
		this.btnCong = new JButton("+");
		this.btnTru = new JButton("-");
		pnCongTru.add(btnCong); pnCongTru.add(btnTru);
		pnMain.add(pnCongTru);
		
		// dong phep nhan chia
		JPanel pnNhanChia = new JPanel();
		pnNhanChia.setLayout(new FlowLayout());
		this.btnNhan = new JButton("x");
		this.btnChia = new JButton("/");
		pnNhanChia.add(btnNhan); pnNhanChia.add(btnChia);
		pnMain.add(pnNhanChia);
		
		// dong phep chia lay du
		JPanel pnChiaLayDu = new JPanel();
		pnChiaLayDu.setLayout(new FlowLayout());
		this.btnChiaLayDu = new JButton("%");
		pnChiaLayDu.add(btnChiaLayDu);
		pnMain.add(pnChiaLayDu);
	}
	public void showWindow() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(500,400);
	}
}
