package 연습;

import javax.swing.JOptionPane;

public class exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tel = JOptionPane.showInputDialog("통신사를 입력하세요.");
		String num = JOptionPane.showInputDialog("전화번호를 입력하세요.");
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");

		String user = name + "님은 " + tel + "에 " + num;
		JOptionPane.showMessageDialog(null, "다이얼로그로 " + user + "로 가입되셨습니다.");
	}

}
