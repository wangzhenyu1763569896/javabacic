package work04;
import java.util.Scanner;
public class practice01 {
	public static void main(String[] args){
		System.out.println("\n\t\t��ӭʹ���������ع���ϵͳ1.0��\n");
		System.out.println("\t\t\t1.��¼ϵͳ\n");
		System.out.println("\t\t\t2.�˳�\n");
		System.out.println("**********************************\n");
		System.out.println("��ѡ���������֣�");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch(num){
		case 1:
			System.out.println("\n\t\t��ӭʹ���������ع������ϵͳ\n");
			System.out.println("**********************************");
			System.out.println("\t\t\t1.�ͻ���Ϣ����\n");
			System.out.println("\t\t\t2.�������\n");
			System.out.println("\t\t\t3.�������\n");
			System.out.println("\t\t\t4.ע��\n");
			System.out.println("**********************************\n");
			System.out.println("��ѡ���������֣�");
			break;
		case 2:
			System.out.println("лл����ʹ�ã�");
			break;
			default:
				System.out.println("��������");
				break;
		}
		
	}

}
