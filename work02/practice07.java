package work02;
import java.util.Scanner;
public class practice07 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("����뱾��");
		double captital = input.nextDouble();
		double firstyearCaptital = captital*1.0225;
		double secondyearCaptital = captital*0.027*2+captital;
		double thirdyearCaptital = captital*0.0324*3+captital;
		double fifthyearCaptital = captital*0.036*5+captital;
		System.out.println("����Ϊ��"+captital);
		System.out.println("��ȡһ���ı�ϢΪ��"+firstyearCaptital);
		System.out.println("��ȡ�����ı�ϢΪ��"+secondyearCaptital);
		System.out.println("��ȡ�����ı�ϢΪ��"+thirdyearCaptital);
		System.out.println("��ȡ�����ı�ϢΪ��"+fifthyearCaptital);	
	}
}
