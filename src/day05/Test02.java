package day05;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		/*
		//예제 10.
		//두 수의 최소공배수와 최대공약수를 구하는 프로그램을 작성하라.	
		Scanner input = new Scanner(System.in);
		int num1, num2;
		int tmp;
		System.out.print("두 수를 입력하시오 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		int nu1 = num1;
		int nu2 = num2;
		while(num1 != 0) {
			if(num1 < num2) {
				tmp = num1;
				num1 = num2;
				num2 = tmp;
			}
			num1 = num1 % num2;
		}
		int su = nu1 * nu2 / num2;
		System.out.println("두 수의 최대 공약수는 : " + num2);
		System.out.println("두 수의 최대 공배수는 : " + su);
		
		
		//예제 11.
		//어떤 수의 약수를 구하는 프로그램을 작성하여라.
		//약수 = 어떤 수를 정수로 나눌 수 있는 수
		Scanner input = new Scanner(System.in);
		System.out.print("어떤 수의 약수를 구하고 싶습니까? : ");
		int num = input.nextInt();
		int i = 1;
		while(true) {
			if(num>=i) {
				if(num % i==0) {
					System.out.print(i + "\t");
				}
			}else {
				break;
			}
			i++;
		}
		
		//예제 12.
		//1에서 1000까지의 자연수 중에서 4로 나누어도 6으로 나누어도 나머지가 
		//1인 수의 합을 출력하라.
		int i = 1;
		int sum = 0;
		while(i<=1000) {
			if(i % 4 == 1 && i % 6 ==1) {
				System.out.println(i);
				sum += i;
			}
			i++;
		}System.out.println(sum);
	
		
		//예제 13.
		//2에서부터 입력된 어떤 수까지 내에 있는 소수를 찾는 프로그램을 작성하라.
		Scanner input = new Scanner(System.in);
		System.out.print("어떤 수까지의 소수를 찾고 싶으세요? : ");
		int num = input.nextInt();
		int i = 2;
		int j = 1;
		int sum = 0;
		while(i<=num) {
			while(true) {
				if(i >= j) {
					if(i % j == 0) {
						//System.out.println(i + " : " + j);
						sum += 1;
					}
					j++;	
				}else	{
					j = 1;
					break;
				}	
			}
			if(sum==2) {
				System.out.println(i);
			}
			//System.out.println(sum);
			i++;
			sum = 0;
			
		}
		
		//예제 14.
		//1~1000사이에 있는 자연수에 대하여 자기 자신의 수를 제외한 모든 약수의 합이
		//자신과 같아지는(완전수)를 구하여라.
		  int i = 2;
	        int j = 1;
	        int sum = 0;
	        while(i<=1000) {
	           while(i > j) {
	              if(i % j == 0) {
	                 sum += j;
	   
	              }
	              j++;
	           }
	           //System.out.println(i + ":" + sum);
	           if(i==sum) {
	              System.out.println(i);
	           }
	           i++;
	           j = 1;
	           sum = 0;
	        }
			*/
	
		//예제 15.
		//별찍기
		
//		Scanner input = new Scanner(System.in);
//	    System.out.println("홀수의 줄 수를 입력받으면 마름모가 만들어지게 하세요.");
//	    System.out.print("줄 수를 입력하세요 : ");
//	    
//	    int i = 1, j = 1, k = 1;
//	    int line = input.nextInt();
//	    int line2 = line / 2;
//	    while(i<=line) {
//	    	if(i <= line2+1) {
//	    		while(k<=line2+1) {
//	    			System.out.print(" ");
//	    			k++;
//	    		}
//	    	}
//	    	while(j<=i) {
//	    		System.out.print("*");
//	    		j++;
//	    		
//	    	}
//	    	System.out.println();
//	    	j = 1;
//	    	i += 2;
//	    	k -= 2;
//	    }
//	    /*
//	    	i = 1;
//	    	j = line;
//	    	k = 1;
//	    	while(i<=line) {
//	    		if(i >= line2-1) {
//	    			while(k>=line2-1) {
//	    				System.out.print(" ");
//	    				k--;
//	    			}
//	    		}
//	    		while(i<=j-2) {
//	    			System.out.print("*");
//	    			j--;
//	    			
//	    		}
//	    		System.out.println();
//	    		j =line;
//	    		i += 2;
//	    		k+=2;
//	    }
//	    */
		   Scanner input = new Scanner(System.in);
		      System.out.println("홀수의 줄 수를 입력받으면 마름모가 만들어지게 하세요.");
		      System.out.print("줄 수를 입력하세요 : ");

		      int i = 1, j = 1, k = 1;
		      int line = input.nextInt();
		      int line2 = line / 2;
		      while(i<=line2+1) {
		         k=1;
		         j=1;
		         while(k+i<=line2+1) {
		            System.out.print(" ");
		            k++;
		         }
		         while(j<=i*2-1) {
		            System.out.print("*");
		            j++;
		         }
		         System.out.println();
		         i++;
		      }
		      
		      i=1;
		      while(i<=line) {
		         k=1;
		         j=1;
		         while(i+line2>=line2+k) {
		            System.out.print(" ");
		            k++;
		         }
		         while(j<=line-(2*i)) {
		            System.out.print("*");
		            j++;
		         }
		         System.out.println();
		         //j =line;
		         i++;
		      }
	}
}
