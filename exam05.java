package 연습;

import javax.swing.JOptionPane;

public class exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int phy = 66;
		int mat = 77;
		int eng = 88;
		int kor = 99;

		int total = phy + mat + eng + kor;
		double avg = total / 4.0;
		//정수와 정수 계산은 무조건 정수이다.
		//계산결과가 실수가 나왔다고 하더라도 실수를 잘라서 정수로 만들어버린다.
		System.out.println(avg);

		final double PI = 3.14f;
		double rad = 2.2f;
		double cir = PI * rad * rad;
		System.out.println(cir);
	}
}
