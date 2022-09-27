package 제어문;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 조건문 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame web = new JFrame();
		web.setSize(500,600);
		web.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setBounds(52, 46, 141, 36);
		web.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(205, 46, 202, 39);
		web.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_1.setBounds(52, 167, 141, 36);
		web.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(205, 167, 202, 39);
		web.getContentPane().add(t2);
		
		JLabel lblNewLabel_2 = new JLabel("국어 점수");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_2.setBounds(52, 287, 141, 36);
		web.getContentPane().add(lblNewLabel_2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(205, 287, 202, 39);
		web.getContentPane().add(t3);
		
		JLabel lblNewLabel_3 = new JLabel("수학 점수");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_3.setBounds(52, 348, 141, 36);
		web.getContentPane().add(lblNewLabel_3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(205, 348, 202, 39);
		web.getContentPane().add(t4);
		
		JButton btnw = new JButton("어디로 갈까");
		btnw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String food= t1.getText();
				if (food.equals("커피")) {
					JOptionPane.showMessageDialog(web,"카페로 갑시다." );
				}else if (food.equals("밀크티")) {
					JOptionPane.showMessageDialog(web,"카페로 갑시다." );
					
				}else {
					JOptionPane.showMessageDialog(web,"집으로 갑시다." );
					
				}
			}
		});
		btnw.setBounds(52, 100, 355, 46);
		web.getContentPane().add(btnw);
		
		JButton btno = new JButton("나의 내년 나이는");
		btno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String year= t2.getText();
				int old= Integer.parseInt(year);
				JOptionPane.showMessageDialog(web,"내년 나이는 "+(old+1) );
			}
		});
		btno.setBounds(52, 213, 355, 46);
		web.getContentPane().add(btno);
		
		JButton btna = new JButton("나의 평균 점수는");
		btna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String kor=t3.getText();
				String math=t4.getText();
				
				int ks=Integer.parseInt(kor);
				double ms=Double.parseDouble(math);
				JOptionPane.showMessageDialog(web, (ks+ms)/2);
				
			}
		});
		btna.setBounds(52, 420, 355, 46);
		web.getContentPane().add(btna);
		web.setVisible(true);
	}

}
