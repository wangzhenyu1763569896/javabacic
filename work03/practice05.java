package work03;

import java.util.Scanner;

public class practice05 {
	public static void main(String[] ages) {
		Scanner input = new Scanner(System.in);
		System.out.print("�ڼ�������һ������:");
		int integer = input.nextInt();
		if (integer % 3 == 0 || integer % 5 == 0) {
			System.out.println("��������3��5�ı���");
		} else {
			System.out.println("���������Ա�3��5�κ�һ��������");
		}
		input.close();
	}
}
