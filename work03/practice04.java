package work03;
import java.util.Scanner;
public class practice04 {
	public static void main(String[]ages){ 
		Scanner input=new Scanner(System.in); 
		System.out.print("�������Ա���֣�"); 
		int score=input.nextInt();
			 if(score>=8000){
				 System.out.println("�û�Ա���ܵ��ۿ��ǣ�����"); 
				 }else if(score<8000&&score>=4000){
					 System.out.println("�û�Ա���ܵ��ۿ��ǣ�����"); 
					 }else if(score<4000&&score>=2000){ 
						 System.out.println("�û�Ա���ܵ��ۿ��ǣ�����"); 
						 }else{
							 System.out.println("�û�Ա���ܵ��ۿ��Ǿ���"); 
							 } 
			 input.close(); 
			 } 
	}

