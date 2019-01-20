package assignment1;
import java.util.Scanner;
public class jagged {
	public static void main(String[] args) {
        int i, j;
        double t;
        int arr[][] = new int[4][]; 

        Scanner input = new Scanner(System.in);
        for(i = 0; i < arr.length; i++){
            System.out.print("Enter number of slow learners for batch" + (i+1) + ": ");
            t = input.nextDouble();
            arr[i] = new int[(int)Math.ceil(t/4)];
            for(j = 0; j < arr[i].length; j++)
            {
                if(t >= 4)
                    arr[i][j] = 4;
                else
                    arr[i][j] = (int)t;
                t = t - 4;
            }
        }
  
        System.out.println("Contents of 2D Jagged Array"); 
        int bfour = 0;
        for (i = 0; i < arr.length; i++) { 
            int cfour = 0;
        	for (j = 0; j < arr[i].length; j++) {
            		System.out.print(arr[i][j] + " ");
            		if(arr[i][j] == 4)
            			cfour++;
            }
        	if(arr[i].length==cfour)
        		bfour++;
            System.out.println(); 
        }

        System.out.println("Number of batches with all the tutors having exactly 4 students are: " + bfour );
    }
}
