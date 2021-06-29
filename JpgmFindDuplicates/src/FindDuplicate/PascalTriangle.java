package FindDuplicate;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner rn = new Scanner(System.in);
		int i ,j;
		System.out.println("Enter the number of rows to be printer : ");
		int rows = rn.nextInt();
		
		for(i=1;i<rows;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=rows-1;i>=1;i--) {
			for(j=1;j<=i-1;j++) { //try j<=i
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
