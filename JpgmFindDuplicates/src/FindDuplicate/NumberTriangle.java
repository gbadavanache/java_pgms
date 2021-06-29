package FindDuplicate;

public class NumberTriangle {    
	public static void main(String[] args)
	{ 
	    int i, j,num=5; // try num=1;
	
	    for(i=1; i<num; i++) // outer loop for rows
	    { 
	        for(j=1; j<=i; j++) // inner loop for rows
	        { 
	        	System.out.print(j+ " "); 
	          // ++j;    //incrementing value of num 

	        } 
	
	        // ending line after each row 
	        System.out.println(); 
	    } 
	} 
}
