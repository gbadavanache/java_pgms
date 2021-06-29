package FindDuplicate;

public class ArmstrongNum {
		public static void main(String[] args) {
		int num=153,rem,c = 0 ;  /* (1*1*1)+(5*5*5)+(3*3*3) = 153  */
		int temp = num ;
		
		while(num > 0) {
			rem = num%10;
			num = num/10;
			c = c + (rem*rem*rem);
		}
		if(temp == c) {
			System.out.println("armstrong number");   
		}
		    else  {
		        System.out.println("Not armstrong number");   
		}
	}

}