package Session1;

import java.util.Scanner;

public class B_32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='.') {
				sb.append(0);
			}else if(s.charAt(i)=='-' && s.charAt(i+1)=='.') {
				sb.append(1);
				i++;
			}else if(s.charAt(i)=='-' && s.charAt(i+1)=='-') {
				sb.append(2);
				i++;
			}
		}System.out.println(sb.toString());
		

	}

}
