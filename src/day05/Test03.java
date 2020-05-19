package day05;

import java.io.IOException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) throws IOException {
		/*
		//예제 1.
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("1. 걷기 2. 대중교통 3. 자동차 4. 종료 : ");
			//int select = System.in.read() - 48;
			int select = input.nextInt();
			switch(select) {
				case 1 : {
					System.out.println("걷기");
					break;
				}
				case 2 : {
					System.out.println("대중교통");
					break;
				}
				case 3 : {
					System.out.println("자동차");
					break;
				}
				case 4 : {
					System.out.println("프로그램 종료"); 
					System.exit(0);
				}
			}
		}
		
		
		//예제 2.
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.print("첫번째 문자열 입력 : ");
		n1 = input.next();
		System.out.print("두번째 문자열 입력 : ");
		n2 = input.next();
		System.out.println("n1 길이 : " + n1.length());
		System.out.println("n2 길이 : " + n2.length());
		
		//예제 3. 
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.print("첫번째 문자열 입력 : ");
		n1 = input.next();
		System.out.print("두번째 문자열 입력 : ");
		n2 = input.next();
		System.out.println("n1==n2 : " + (n1==n2));
		System.out.println("n1.equals(n2) : " + n1.equals(n2));

		
		//예제 4.  (초기화 필요)
		int i;
		String s;
		System.out.println(i);
		System.out.println(s);
		
		
		//예제 5. 
		//로그인 프로그램 만드시오.
		//처음에 로그인을 하면 저장되어 있는 값이 없기 때문에 비교할 수 없을 것이다.
		//그래서 회원가입을 먼저 진행하고 로그인 시도 후 회원가입할 때의 아이디와 로그인 할 때의
		//아이디가 같은지를 비교하자.
		Scanner input = new Scanner(System.in);
		String id = null, id2;
		int num;
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 나가기");
			System.out.print(">>> ");
			num = input.nextInt();
			switch(num) {
			case 1: {
				
				System.out.print("로그인 하기 위해 아이디를 입력해주세요 : ");
				id2 = input.next();
				if(id2.equals(id)) {
					System.out.println("로그인 성공!");
					break;
				}else {
					System.out.println("다시 로그인해주세요!");
					continue;
				}			
			}
			case 2:
				System.out.print("회원가입 하기 위해 아이디를 입력해주세요 : ");
				id = input.next();
				System.out.println("당신의 아이디는 " + id + "입니다.");
				break;
			case 3:
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			}
		}
		*/
		//예제 6.
		//커피자판기
		Scanner input = new Scanner(System.in);
		int num, money;
		while(true) {
			System.out.print("요금을 투입하세요 : ");
			money = input.nextInt();
			System.out.println("==========  커피 자판기 ==========");
			System.out.println("1. 커피(200) 2. 코코아(250) 3. 반환  4. 종료");
			System.out.println("메뉴를 선택하세요");
			System.out.print(">");
			num = input.nextInt();
			switch(num) {
			case 1: 
				if(money>=200) {
					System.out.println("맛있게드세요");
					break;
				}else {
					System.out.println("돈이 부족합니다.");
					break;
				}
			case 2:
				if(money>=250) {
					System.out.println("맛있게드세요.");
					break;
				}else {
					System.out.println("돈이 부족합니다.");
					break;
				}
			case 3:
				System.out.println("거스름돈 : " + money);
				break;
			case 4 :
				System.out.println("시스템 종료");
				System.exit(0);
			}
		}
	}
}
