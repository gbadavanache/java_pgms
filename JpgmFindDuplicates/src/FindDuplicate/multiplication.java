package FindDuplicate;
import java.util.Scanner;


public class multiplication {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a1 ,a2 , mul=0;
		System.out.println("Multiply 2 numbers without using multiplication operator");
		System.out.println("Enter two numbers:");
		a1 = scan.nextInt();
		a2 = scan.nextInt();
	
		for (int i=1;i<=a1;i++) {
			mul = mul+a2;
		}
		System.out.println("The multiplication of "+a1+" and "+a2+" is:" +mul);
		scan.close();
	}

}
