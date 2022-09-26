package 연습;

import javax.swing.JOptionPane;

public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hei = JOptionPane.showInputDialog("당신의 키를 입력하세요.");
		double hei1 = Double.parseDouble(hei);
		double wei = (hei1 - 100) * 0.9;
		JOptionPane.showMessageDialog(null, "당신의 적정 몸무게는" + wei + "입니다");
	}

}
