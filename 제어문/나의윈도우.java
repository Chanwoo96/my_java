package 제어문;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class 나의윈도우 {
	private static JTextField textField;
	private static JTextField textField_2;
	private static JTextField textField_1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(42, 40, 90, 37);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(162, 40, 231, 29);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("전화번호");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_2.setBounds(42, 103, 90, 37);
		f.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(162, 103, 231, 29);
		f.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("주소");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1.setBounds(42, 181, 90, 37);
		f.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(162, 181, 231, 29);
		f.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBounds(67, 326, 109, 37);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(266, 326, 109, 37);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);
	}
}
