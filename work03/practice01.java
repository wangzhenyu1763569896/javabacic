package work03;
import java.util.Scanner;
public class practice01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������ع���ϵͳ>���˳齱");
		System.out.println("\n��������λ��Ա��:");
		int custNo = input.nextInt();
		int baiwei = custNo / 100 % 10;
		int random = (int) (Math.random() * 10);
		if (baiwei == random) {
			System.out.println(custNo + "�ͻ��������û�����þ���Mp3һ��");
		} else {
			System.out.println(custNo + "�ͻ���лл���֧��");
		}
		input.close();
	}

}
