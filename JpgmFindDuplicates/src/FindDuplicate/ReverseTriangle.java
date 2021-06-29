package FindDuplicate;

import java.util.Scanner;

public class ReverseTriangle {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of n:");
			int row = sc.nextInt();
			
			for(int i=row; i>=0; i--)  // i=row-3 you can try like this 
			{
				for(int j=0 ;j<=i; j++)
				{
					//System.out.println("* ");
					System.out.print("* ");

				}
				System.out.println();
			}
			sc.close();
	}
}
