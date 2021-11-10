package userIP;

import java.util.Scanner;


public class userIP {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ente the number");
		
		int a=sc.nextInt();
		int flag=0;
		
		for(int i=2; i<a; i++) {
			if(a%i==0) {
				System.out.print(a+"not prime");
				flag=1;
			}
		}
			if(flag==0) {
				System.out.print(a +"prime");
			}
		
			
	}
	}	
