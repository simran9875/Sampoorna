package Session2;

import java.util.Scanner;

public class A_110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int count=0;
		while(n>0) {
			long rem = n%10;
			if(rem==4 ||rem ==7) {
				count++;
			}n/=10;
		}if(count==4 || count==7) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		

	}

}
