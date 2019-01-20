package assignment1;
import java.util.Scanner;

public class reaction {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.println("Enter the Chemical Equation: ");
        String eqn;
        eqn = input.nextLine();
        input.close();
        System.out.println(eqn);
        String[] sides = eqn.split("->");
        if(sides.length != 2) {
            throw new RuntimeException("Check your equation. There should be exactly one -> symbol somewhere");
        }
        else{
        	String[] reactants = sides[0].split("\\+");
            String[] products = sides[1].split("\\+");
            System.out.println("Reactants are: ");
            for(String r : reactants) {
            	parse(r);
            }
            System.out.println("Products are: ");
            for(String p : products) {
            	parse(p);
            }
        }
	}

	private static void parse(String x) {
		x=x.trim();
    	for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (Character.isLetter(c)) {
            	String n;
            	if (i==0) {
            		n = "1";
            	}
            	else n = x.substring(0,i);
                System.out.println(n + " mole(s) of "+ x.substring(i));
                break;
            }
        }		
	}
}
