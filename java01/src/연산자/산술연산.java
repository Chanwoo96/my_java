package 연산자;

import javax.swing.JOptionPane;

public class 산술연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String age=JOptionPane.showInputDialog("올해 나이 입력");
		int age2 = Integer.parseInt(age) +1;
		JOptionPane.showMessageDialog(null, "내년 나이는"+ age2);
	}

}
