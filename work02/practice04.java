package work02;
import java.util.Scanner;
public class practice04 {
	public static void main(String[] args){
		double discount;
		System.out.println("�������ۿۣ�");
		Scanner input = new Scanner(System.in);
		discount = input.nextDouble();
		int shirtPrice = 245;
		int shoePrice = 570;
		int padPrice = 320;
		double finalshirtPay = shirtPrice * discount;
		double finalshoePay = shoePrice * discount;
		double finalpadPay = padPrice * discount;
		boolean countshirtPrice = finalshirtPay < 100;
		boolean countshoePrice = finalshoePay < 100;
		boolean countpadPrice = finalpadPay < 100;
		System.out.println("T���ۿۼ۵���100�𣿣�"+ countshirtPrice);
		System.out.println("����Ь�ۿۼ۵���100�𣿣�"+ countshoePrice);
		System.out.println("�������ۿۼ۵���100�𣿣�"+ countpadPrice);
	}
}
