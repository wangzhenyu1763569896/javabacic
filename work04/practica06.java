package work04;
import java.util.Scanner;
public class practica06 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ����");
		int num1 = input.nextInt();
		System.out.println("��ѡ������� + - * / ");
		char symbol = input.next().charAt(0);
		System.out.println("������ڶ�����");
		int num2 = input.nextInt();
		switch(symbol){
		case '+':
			System.out.println("��������"+(num1+num2));
			break;
		case '-':
			System.out.println("��������"+(num1-num2));
			break;
		case '*':
			System.out.println("��������"+(num1*num2));
			break;
		case '/':
			System.out.println("��������"+(num1/num2));
			break;
			default:
				System.out.println("��������ȷ������");
				break;
				
		}
	}

}
