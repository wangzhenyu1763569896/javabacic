package work02;
public class practice02 {
	public static void main(String[] args) {
		int shirtPrice = 245;
		int shoePrice = 570;
		int padPrice = 320;
		int shirtNo = 2;
		int shoeNo = 1;
		int padNo = 1;
		double discount = 0.8;
		double finalPay = (shirtPrice * shirtNo + shoePrice * shoeNo + padPrice * padNo) * discount;
		double score = (int)finalPay*3/100;
		System.out.println("-------------*���ѵ�*-------------");
		System.out.println("������Ʒ\t\t\t����\t\t\t����\t\t\t���");
		System.out.println("T��\t\t\t��245\t\t\t2\t\t\t��490");
		System.out.println("����Ь\t\t\t��570\t\t\t1\t\t\t��570");
		System.out.println("������\t\t\t��320\t\t\t2\t\t\t��320");
		System.out.println("\n\n");
		System.out.println("�ۿۣ�   8��");
		System.out.println("�����ܽ���" + finalPay);
		System.out.println("ʵ�ʽɷѣ���1500.0");
		System.out.println("��Ǯ����396.0");
		System.out.println("���ι����Ļ����ǣ�"+ score);
		}
}
