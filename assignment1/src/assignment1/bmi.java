package assignment1;
import java.util.Scanner;

public class bmi {
	public static void main (String [] args) {
		 
        Scanner input = new Scanner (System.in);
         
        double weight;
        double height;
        double bmi;
        String fname;
        String lname;
 
        System.out.println ("BMI VALUES");
        System.out.println ("Underweight: less than 18.5");
        System.out.println ("Normal:      between 18.5 and 24.9");
        System.out.println ("Overweight:  between 25 and 29.9");
        System.out.println ("Obese:       30 or greater");
 
        System.out.print ("Enter First Name: ");
        fname = input.next();
        System.out.print ("Enter Last Name: ");
        lname = input.next();
        System.out.print ("Enter Your Weight in Kgs: ");
        weight = input.nextDouble();
        System.out.print ("Enter Your Height in cms: ");
        height = input.nextDouble();
        bmi = (weight*10000) / (height * height);
        System.out.printf ("Your Body Mass Index (BMI) is %.2f\n\n", bmi);

        if(bmi<18.5) {
        	System.out.printf(fname+" based on your BMI(%.2f), you are Underweight", bmi);
        }
        else if(bmi<25) {
        	System.out.printf(fname+" based on your BMI(%.2f), you are Normal", bmi);	
        }
        else if(bmi<30) {
        	System.out.printf(fname+" based on your BMI(%.2f), you are Overweight", bmi);
        }
        else {
        	System.out.printf(fname+" based on your BMI(%.2f), you are Obese", bmi);
        }
    }
}
