package work03;

import java.util.Scanner;

public class practice07 {
	public static void main(String[] ages) {
		Scanner input = new Scanner(System.in);
		System.out.print("����������е��·ݣ�");
		int price = 5000;
		int mon = input.nextInt();
		System.out.print("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2��");
		String cab = input.next();
		if (mon >= 4 && mon <= 10) {

			if (cab.contentEquals("1")) {
				double pri = price * 0.9;
				System.out.print("���Ļ�Ʊ�۸�" + pri);

			} else {
				double pri = price * 0.8;
				System.out.print("���Ļ�Ʊ�۸�" + pri);
			}

		} else {

			if (cab.contentEquals("1")) {
				double pri = price * 0.5;
				System.out.print("���Ļ�Ʊ�۸�" + pri);

			} else {
				double pri = price * 0.4;
				System.out.print("���Ļ�Ʊ�۸�" + pri);

			}

		}
		input.close();
	}
}
