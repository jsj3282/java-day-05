package day05;

import java.io.IOException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) throws IOException {
		/*
		//���� 1.
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("1. �ȱ� 2. ���߱��� 3. �ڵ��� 4. ���� : ");
			//int select = System.in.read() - 48;
			int select = input.nextInt();
			switch(select) {
				case 1 : {
					System.out.println("�ȱ�");
					break;
				}
				case 2 : {
					System.out.println("���߱���");
					break;
				}
				case 3 : {
					System.out.println("�ڵ���");
					break;
				}
				case 4 : {
					System.out.println("���α׷� ����"); 
					System.exit(0);
				}
			}
		}
		
		
		//���� 2.
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.print("ù��° ���ڿ� �Է� : ");
		n1 = input.next();
		System.out.print("�ι�° ���ڿ� �Է� : ");
		n2 = input.next();
		System.out.println("n1 ���� : " + n1.length());
		System.out.println("n2 ���� : " + n2.length());
		
		//���� 3. 
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.print("ù��° ���ڿ� �Է� : ");
		n1 = input.next();
		System.out.print("�ι�° ���ڿ� �Է� : ");
		n2 = input.next();
		System.out.println("n1==n2 : " + (n1==n2));
		System.out.println("n1.equals(n2) : " + n1.equals(n2));

		
		//���� 4.  (�ʱ�ȭ �ʿ�)
		int i;
		String s;
		System.out.println(i);
		System.out.println(s);
		
		
		//���� 5. 
		//�α��� ���α׷� ����ÿ�.
		//ó���� �α����� �ϸ� ����Ǿ� �ִ� ���� ���� ������ ���� �� ���� ���̴�.
		//�׷��� ȸ�������� ���� �����ϰ� �α��� �õ� �� ȸ�������� ���� ���̵�� �α��� �� ����
		//���̵� �������� ������.
		Scanner input = new Scanner(System.in);
		String id = null, id2;
		int num;
		while(true) {
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. ������");
			System.out.print(">>> ");
			num = input.nextInt();
			switch(num) {
			case 1: {
				
				System.out.print("�α��� �ϱ� ���� ���̵� �Է����ּ��� : ");
				id2 = input.next();
				if(id2.equals(id)) {
					System.out.println("�α��� ����!");
					break;
				}else {
					System.out.println("�ٽ� �α������ּ���!");
					continue;
				}			
			}
			case 2:
				System.out.print("ȸ������ �ϱ� ���� ���̵� �Է����ּ��� : ");
				id = input.next();
				System.out.println("����� ���̵�� " + id + "�Դϴ�.");
				break;
			case 3:
				System.out.println("�ý����� �����մϴ�.");
				System.exit(0);
			}
		}
		*/
		//���� 6.
		//Ŀ�����Ǳ�
		Scanner input = new Scanner(System.in);
		int num, money;
		while(true) {
			System.out.print("����� �����ϼ��� : ");
			money = input.nextInt();
			System.out.println("==========  Ŀ�� ���Ǳ� ==========");
			System.out.println("1. Ŀ��(200) 2. ���ھ�(250) 3. ��ȯ  4. ����");
			System.out.println("�޴��� �����ϼ���");
			System.out.print(">");
			num = input.nextInt();
			switch(num) {
			case 1: 
				if(money>=200) {
					System.out.println("���ְԵ弼��");
					break;
				}else {
					System.out.println("���� �����մϴ�.");
					break;
				}
			case 2:
				if(money>=250) {
					System.out.println("���ְԵ弼��.");
					break;
				}else {
					System.out.println("���� �����մϴ�.");
					break;
				}
			case 3:
				System.out.println("�Ž����� : " + money);
				break;
			case 4 :
				System.out.println("�ý��� ����");
				System.exit(0);
			}
		}
	}
}
