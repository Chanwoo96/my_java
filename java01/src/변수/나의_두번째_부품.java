package 변수;

import javax.swing.JOptionPane;

public class 나의_두번째_부품 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자주 쓰는 기능을 가진 부품을 대문자로 바로 쓸 수 있도록 준비되어있음
		// System,JOptionPane, 숫자로 변환해주는 부품들 (Integer)
		// JOptionPane 이용해서 취미, 이름 입력==> 출력

		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요.");
		String hobby = JOptionPane.showInputDialog("당신의 취미를 입력하세요.");
		// prompt(), 입력용
		String age = JOptionPane.showInputDialog("당신의 나이를 입력하세요.");
		// 자주 안쓰는 기능을 가지 부품은 new를 가지고 새로 만들어쓴다.
		// JFrame,Date,...
		// alert(),null:없다!!
		JOptionPane.showMessageDialog(null, "나의 이름은 " + name);
		JOptionPane.showMessageDialog(null, "나의 나이는 " + age);
		JOptionPane.showMessageDialog(null, "나의 취미는 " + hobby);
	}

}
