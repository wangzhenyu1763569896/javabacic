package work03;
import java.util.Scanner;
public class practice03 {
	public static void main(String[] ages) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������Ƿ��ǻ�Ա���ǣ�y��/�������ַ���");
		String ans = input.next();
		System.out.print("������:");
		double money = input.nextDouble();
		if (ans.equals("y")) {
			if (money >= 200) {
				double pay = money * 0.75;
				System.out.println("ʵ��֧��:" + pay);
			} else {
				double pay = money * 0.8;
				System.out.println("ʵ��֧����" + pay);
			}
		} else {
			if (money > 100) {
				double pay = money * 0.9;
				System.out.println("ʵ��֧����" + pay);
			} else {
				double pay = money;
				System.out.println("ʵ��֧��" + pay);
			}
			input.close();
		}
	}
}

