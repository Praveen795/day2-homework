package userIp2;
import java.util.Scanner;

public class userIp2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		int no=sc.nextInt();
		
		for(int i=1;i<=no;i++) {
			int count=0;
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
					count=count+1;
					
				}
			}
				if(count==0) {
					System.out.println(i);
				}
				
		}
		
	}

}
