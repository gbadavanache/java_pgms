package FindDuplicate;

public class StarTriangle {
	public static void main(String[] args) {
		int i,j,n=5;
		
		for (i=1;i<=n;i++) {
			  for(j=1; j<=i; j++) // inner loop for spaces 
	            {           
				  //Don't use println
	                System.out.print("* "); // printing * with  space
	          	}
			System.out.println();
		}
	}
}
