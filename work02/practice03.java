package work02;
import java.util.Scanner;
public class practice03 {
	public static void main(String[] args) {
		int custNumb;
		System.out.println("������4λ��Ա���ţ�");
		Scanner input = new Scanner(System.in);
		custNumb = input.nextInt();
		int gewei = custNumb % 10;
		int shiwei = custNumb / 10 % 10;
		int baiwei = custNumb / 100 % 10;
		int qianwei = custNumb / 1000;
		int sum = gewei + shiwei + baiwei + qianwei;
		System.out.println("��Ա����;" + custNumb + "��λ֮�ͣ�" + sum);
		boolean isluck=sum>20;
		System.out.println("�����˿ͻ���" + isluck);
	}
}
