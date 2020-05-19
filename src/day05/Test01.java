package day05;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		/*
		//예제 1.
		Scanner input = new Scanner(System.in);
		int i, sum = 0;
		while(true) {
			System.out.print("수입력(1~100) : ");
			i = input.nextInt();
			if(i >= 1 && i <= 100) {
				break;
			}System.out.println("잘못입력, 다시");
		}
		for(int j = 1; j <= i; j++) {
			sum += j;
		}System.out.println("입력 받은 수까지의 합 : " + sum);
		
		
		
		//예제 2.
		//1 ~ 10사이의 숫자만 입력 받아 1부터 입력 받은 수까지의 합을 구하시오.
		Scanner input = new Scanner(System.in);
		int i, sum = 0;
		while(true) {
			System.out.print("수 입력(1~10) :  ");
			i = input.nextInt();
			if(i>=1 && i<=10) {
				break;
			}System.out.println("다시 입력해주세요(1~10) : ");
		}
		
		for(int j=1; j<=i; j++) {
			sum +=j;
		}
		System.out.println("입력 받은 수까지의 합 : " + sum);
		
		
		//예제 3.
		//10 ~ 20 사이의 숫자만 입력 받아 1부터 입력 받은 수까지의 합을 구하시오.
		Scanner input = new Scanner(System.in);
		int i, sum = 0;
		while(true) {
			System.out.print("수 입력(10~20) : ");
			i = input.nextInt();
			if(i >= 10 && i <=20) {
				break;
			}System.out.println("다시 입력해주세요(10~20) : ");
		}
		
		for(int j = 1; j <= i; j++) {
			sum += j;
		}
		System.out.println("입력 받은 수까지의 합 : " + (sum));
		
		
		//예제 4. 숫자 나누기
		Scanner input = new Scanner(System.in);
		int i, temp;
		System.out.print("수 입력 : ");
		i = input.nextInt();
		while(true) {
			temp = i % 10;
			i = i / 10;
			System.out.println(temp + " ");
			if(i==0) break;
		}
		System.out.println();
		
		
		//예제 5.
		int su = 0, sum = 0;
		do {
			su ++;
			sum += su;
			
		}while(su<=9);
		System.out.println("sum = " + sum);
		
		
		//예제 6.
		int i = 0;
		while(i < 5) {
			i++;
			//if(i==3) {continue;}
			if(i==3) {System.out.println("실행");}
			System.out.println("i : " + i);
		}
		
		//예제 7.
		int i = 0;
		while(i < 5) {
			i++;
			if(i==3) {
				System.out.println("i : " + i + " : break");
				break;
			}
			System.out.println("i : " + i);
		}

		//예제 8.
		int i = 0;
		boolean bool = true;
		while(bool) {
			i++;
			if(i==3) {
				bool = false;
			}
			System.out.println("i : " + i);
		}
		System.out.println("다음 문장 실행!!");
		
		*/
		//예제 9.
		//쌀이 100통이 저장되어 있는 창고에 암수 1쌍의 쥐가 있다. 쥐 한마리가 하루에 20g의 
		//쌀을 먹고, 10일(10, 20, 30)마다 쥐의 수가 2배씩 증가한다. 며칠 만에 창고의 쌀이
		//모두 쥐의 먹이가 될까. 그리고 쥐는 총 몇 마리인가?(쌀 한통 = 1kg)
		//(쌀을 먹은 후에 2배 증가하는 조건)
		int rice = 100 * 1000;
		int mice = 2;
		int i = 1;
		while(true) {
			
			rice = rice - 20 * mice;
			
			
			if(i % 10 == 0) {
				mice = mice * 2;
			}
			
			if(rice <= 0)	break;
			
			System.out.println(i + "일 : " + mice + " 마리 : " + rice );
			i += 1;
		}
		System.out.println("창고의 쌀이 없어진 날 : " + i);
		System.out.println("쥐는 총 : " + mice);
		
		
		
	}
}
