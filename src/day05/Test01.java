package day05;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		/*
		//���� 1.
		Scanner input = new Scanner(System.in);
		int i, sum = 0;
		while(true) {
			System.out.print("���Է�(1~100) : ");
			i = input.nextInt();
			if(i >= 1 && i <= 100) {
				break;
			}System.out.println("�߸��Է�, �ٽ�");
		}
		for(int j = 1; j <= i; j++) {
			sum += j;
		}System.out.println("�Է� ���� �������� �� : " + sum);
		
		
		
		//���� 2.
		//1 ~ 10������ ���ڸ� �Է� �޾� 1���� �Է� ���� �������� ���� ���Ͻÿ�.
		Scanner input = new Scanner(System.in);
		int i, sum = 0;
		while(true) {
			System.out.print("�� �Է�(1~10) :  ");
			i = input.nextInt();
			if(i>=1 && i<=10) {
				break;
			}System.out.println("�ٽ� �Է����ּ���(1~10) : ");
		}
		
		for(int j=1; j<=i; j++) {
			sum +=j;
		}
		System.out.println("�Է� ���� �������� �� : " + sum);
		
		
		//���� 3.
		//10 ~ 20 ������ ���ڸ� �Է� �޾� 1���� �Է� ���� �������� ���� ���Ͻÿ�.
		Scanner input = new Scanner(System.in);
		int i, sum = 0;
		while(true) {
			System.out.print("�� �Է�(10~20) : ");
			i = input.nextInt();
			if(i >= 10 && i <=20) {
				break;
			}System.out.println("�ٽ� �Է����ּ���(10~20) : ");
		}
		
		for(int j = 1; j <= i; j++) {
			sum += j;
		}
		System.out.println("�Է� ���� �������� �� : " + (sum));
		
		
		//���� 4. ���� ������
		Scanner input = new Scanner(System.in);
		int i, temp;
		System.out.print("�� �Է� : ");
		i = input.nextInt();
		while(true) {
			temp = i % 10;
			i = i / 10;
			System.out.println(temp + " ");
			if(i==0) break;
		}
		System.out.println();
		
		
		//���� 5.
		int su = 0, sum = 0;
		do {
			su ++;
			sum += su;
			
		}while(su<=9);
		System.out.println("sum = " + sum);
		
		
		//���� 6.
		int i = 0;
		while(i < 5) {
			i++;
			//if(i==3) {continue;}
			if(i==3) {System.out.println("����");}
			System.out.println("i : " + i);
		}
		
		//���� 7.
		int i = 0;
		while(i < 5) {
			i++;
			if(i==3) {
				System.out.println("i : " + i + " : break");
				break;
			}
			System.out.println("i : " + i);
		}

		//���� 8.
		int i = 0;
		boolean bool = true;
		while(bool) {
			i++;
			if(i==3) {
				bool = false;
			}
			System.out.println("i : " + i);
		}
		System.out.println("���� ���� ����!!");
		
		*/
		//���� 9.
		//���� 100���� ����Ǿ� �ִ� â�� �ϼ� 1���� �㰡 �ִ�. �� �Ѹ����� �Ϸ翡 20g�� 
		//���� �԰�, 10��(10, 20, 30)���� ���� ���� 2�辿 �����Ѵ�. ��ĥ ���� â���� ����
		//��� ���� ���̰� �ɱ�. �׸��� ��� �� �� �����ΰ�?(�� ���� = 1kg)
		//(���� ���� �Ŀ� 2�� �����ϴ� ����)
		int rice = 100 * 1000;
		int mice = 2;
		int i = 1;
		while(true) {
			
			rice = rice - 20 * mice;
			
			
			if(i % 10 == 0) {
				mice = mice * 2;
			}
			
			if(rice <= 0)	break;
			
			System.out.println(i + "�� : " + mice + " ���� : " + rice );
			i += 1;
		}
		System.out.println("â���� ���� ������ �� : " + i);
		System.out.println("��� �� : " + mice);
		
		
		
	}
}
