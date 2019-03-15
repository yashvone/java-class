package assignment1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.NoSuchElementException;

public class Exception{

    static void check(String r, String n){
        if(r.length() != 9){
            System.out.println("Invalid");
            throw new IllegalArgumentException("Register Number must contain exactly 9 characters");
        }
        if(n.length() != 10){
            System.out.println("Invalid");
            throw new IllegalArgumentException("Mobile Number must contain exactly 10 characters");
        }

        String pattern = "^[6|7|8|9]{1}\\d{9}";
        Pattern a = Pattern.compile(pattern);
        Matcher m1 = a.matcher(n);
        if(!m1.find()){
            throw new NumberFormatException("Mobile Number can only contain digits");
        }

        String pattern2 = "^[1-9]{2}[A-Z]|[a-z]{3}[0-9]{4}$";
        Pattern b = Pattern.compile(pattern2);
        Matcher m2 = b.matcher(r);
        if(!m2.find()){
            throw new NoSuchElementException("Registration Number can only contain digits and alphabets");
        }

    }

    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.println("Enter Reg Number: ");
    		String reg = sc.nextLine();
	        System.out.println("Enter Phone Number: ");
    		String no = sc.nextLine();
	        check(reg, no);
	        System.out.println("Valid");
    	}
    }
}