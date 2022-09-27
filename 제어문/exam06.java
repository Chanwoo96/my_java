package 제어문;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class exam06 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		JFrame web= new JFrame();
		web.getContentPane().setBackground(new Color(255, 255, 0));
		web.setSize(400,400);
		web.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(155, 117, 116, 21);
		web.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(155, 177, 116, 21);
		web.getContentPane().add(t2);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setBounds(45, 120, 57, 15);
		web.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setBounds(45, 180, 57, 15);
		web.getContentPane().add(lblNewLabel_1);
		
		JButton btnp = new JButton("더하기");
		btnp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tex1=t1.getText();
				String tex2=t2.getText();
				int num1 = Integer.parseInt(tex1);
				int num2 = Integer.parseInt(tex2);
				JOptionPane.showMessageDialog(web,"더하기 버튼을 누르셨군요");
				//JOptionPane.showMessageDialog(web,num1+num2);
				web.setTitle("더한 결과는"+(num1+num2));
				//label.setText("더한 결과는"+(num1+num2));
				t1.setText("");
				t2.setText("");
				
				
			}
		});
		btnp.setBounds(70, 259, 97, 23);
		web.getContentPane().add(btnp);
		
		JButton btnm = new JButton("빼기");
		btnm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tex1=t1.getText();
				String tex2=t2.getText();
				int num1 = Integer.parseInt(tex1);
				int num2 = Integer.parseInt(tex2);
				JOptionPane.showMessageDialog(web,"빼기 버튼을 누르셨군요");
				JOptionPane.showMessageDialog(web,num1-num2);
			}
		});
		btnm.setBounds(211, 259, 97, 23);
		web.getContentPane().add(btnm);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\java workspace\\java01\\red.png"));
		lblNewLabel_3.setBounds(12, 10, 360, 84);
		web.getContentPane().add(lblNewLabel_3);
		web.setVisible(true);
		
		
	}
}
