package 연습;

import javax.swing.JOptionPane;

public class exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String wid = JOptionPane.showInputDialog("네모의 가로길이를 입력하세요.");
		String hei = JOptionPane.showInputDialog("네모의 세로길이를  입력하세요.");
		int wid1 = Integer.parseInt(wid);
		int hei1 = Integer.parseInt(hei);
		int area = wid1 * hei1;
		JOptionPane.showMessageDialog(null, "네모의 면적은" + area + "입니다.");
	}

}
