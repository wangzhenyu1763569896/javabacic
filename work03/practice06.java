package work03;

import java.util.Scanner;

public class practice06 {
	public static void main(String[] ages) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������ɺɺ�ĳɼ�:");
		int score = input.nextInt();
		if (score >= 100) {
			System.out.println("�ְ���");

		} else if (score >= 90) {
			System.out.println("������ʼǱ�");

		} else if (score >= 60) {
			System.out.println("�������ֻ�");

		} else {
			System.out.println("û������");
		}
		input.close();
	}
}
