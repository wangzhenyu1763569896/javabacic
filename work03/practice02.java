package work03;
import java.util.Scanner;
public class practice02 {
	public static void main(String[] ages) {
		Scanner input = new Scanner(System.in); 
		System.out.println("�������ع������ϵͳ>�ͻ�������Ϣ>��ӿͻ���Ϣ");
			 System.out.print("\n�������Ա��<4λ����>:"); 
			 int custNo = input.nextInt();
			  System.out.print("�������Ա���գ���/������λ���ֱ�ʾ����"); 
			  String custBirth = input.next();
			  System.out.print("��������֣�"); 
			  int custScore = input.nextInt(); 
			  if (custNo >=1000 && custNo < 10000) {
				  System.out.println("��¼��Ļ�Ա��Ϣ��" + "\n" + custNo +"\t" + custBirth + "\t" + custScore); 
				  } else { System.out.println("��Ϣ¼��ʧ��");
			  } 
			  input.close();
			  } 
	}

