package work02;

public class practice05 {
	public static void main(String[] args){
		int leftx = 10;
		int righty = 8;
		System.out.println("�������ǰ���е�ֽ�ƣ�");
		System.out.println("�������е�ֽ�ƣ�" + leftx);
		System.out.println("�������е�ֽ�ƣ�"+ righty);
		System.out.println("\n\n\n");
		int z;
		z = righty;
		righty = leftx;
		leftx = z;
		
		System.out.println("������������е�ֽ�ƣ�");
		System.out.println("�������е�ֽ�ƣ�" + leftx);
		System.out.println("�������е�ֽ�ƣ�"+ righty);
		
	}
}
