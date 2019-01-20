package assignment1;
import java.util.*;

public class palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s, p = "";
		s = input.nextLine();
		String[] words = s.split(" ");
		for(String y: words) {
			y.toLowerCase();
			char[] x = y.toCharArray();
			int n = y.length(), f=0;
			for(int i=0;i<n/2;i++){
				if(x[i]!=x[n-1-i]) {
					f=1;
					break;
				}
			if(f==1)
				p+=(" "+y);
			}
		}
	}
}
