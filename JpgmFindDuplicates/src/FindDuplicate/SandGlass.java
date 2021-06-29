package FindDuplicate;

import java.util.Scanner;

public class SandGlass {
	public static void sandglass(String[] args)
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
 
        int n = sc.nextInt();
		int i,j ;
        for ( i=0; i<n; i++) { //for(i=n-1;i>=0;i--)decrement from upward
        		for (j=n-i; j>1; j--) {//inner loop for spaces //decrement from downwards
	                System.out.print(" "); //print space
	            }  
	            for (j=0; j<=i; j++ ) { //inner loop for number of columns
	                System.out.print("* "); //print star
	            }
	            System.out.println(); //ending line after each row
	        } 
        
        for(i=n-1;i>=1;i--) {
        	for(j=i;j<=i;j++) {
        		System.out.print("* ");
        	}

        	for(j=i;j<n-1;j++) {
        	 System.out.print("*" + " ");
        	}
        	System.out.println();
        }
    } 
  
}
