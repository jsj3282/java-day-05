package day05;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		/*
		//���� 10.
		//�� ���� �ּҰ������ �ִ������� ���ϴ� ���α׷��� �ۼ��϶�.	
		Scanner input = new Scanner(System.in);
		int num1, num2;
		int tmp;
		System.out.print("�� ���� �Է��Ͻÿ� : ");
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
		System.out.println("�� ���� �ִ� ������� : " + num2);
		System.out.println("�� ���� �ִ� ������� : " + su);
		
		
		//���� 11.
		//� ���� ����� ���ϴ� ���α׷��� �ۼ��Ͽ���.
		//��� = � ���� ������ ���� �� �ִ� ��
		Scanner input = new Scanner(System.in);
		System.out.print("� ���� ����� ���ϰ� �ͽ��ϱ�? : ");
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
		
		//���� 12.
		//1���� 1000������ �ڿ��� �߿��� 4�� ����� 6���� ����� �������� 
		//1�� ���� ���� ����϶�.
		int i = 1;
		int sum = 0;
		while(i<=1000) {
			if(i % 4 == 1 && i % 6 ==1) {
				System.out.println(i);
				sum += i;
			}
			i++;
		}System.out.println(sum);
	
		
		//���� 13.
		//2�������� �Էµ� � ������ ���� �ִ� �Ҽ��� ã�� ���α׷��� �ۼ��϶�.
		Scanner input = new Scanner(System.in);
		System.out.print("� �������� �Ҽ��� ã�� ��������? : ");
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
		
		//���� 14.
		//1~1000���̿� �ִ� �ڿ����� ���Ͽ� �ڱ� �ڽ��� ���� ������ ��� ����� ����
		//�ڽŰ� ��������(������)�� ���Ͽ���.
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
	
		//���� 15.
		//�����
		
//		Scanner input = new Scanner(System.in);
//	    System.out.println("Ȧ���� �� ���� �Է¹����� ������ ��������� �ϼ���.");
//	    System.out.print("�� ���� �Է��ϼ��� : ");
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
		      System.out.println("Ȧ���� �� ���� �Է¹����� ������ ��������� �ϼ���.");
		      System.out.print("�� ���� �Է��ϼ��� : ");

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
