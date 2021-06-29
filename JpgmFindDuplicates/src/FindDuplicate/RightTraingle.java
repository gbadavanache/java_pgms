package FindDuplicate;

public class RightTraingle {
    	 public static void pyramidPattern(int n) 
    	    {  
    	        for (int i=0; i<n; i++) //for(i=n-1;i>=0;i--)decrement from upward
    	        { 
    	        for (int j=n-i; j>1; j--) //inner loop for spaces //decrement from downwards
    	            { 
    	                System.out.print(" "); //print space
    	            }  
	    	            for (int j=0; j<=i; j++ ) //inner loop for number of columns
	    	            { 
	    	                System.out.print("* "); //print star
	    	            } 
    	  
    	            System.out.println(); //ending line after each row
    	        } 
    	    } 
    	  
    	    public static void main(String args[]) //driver function
    	    { 
    	        int n = 5; 
    	        pyramidPattern(n); 
    	    } 
    	}