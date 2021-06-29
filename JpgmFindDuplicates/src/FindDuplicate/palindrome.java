package FindDuplicate;

public class palindrome {

		public static void main(String[] agrs) {
			//System.out.println("enter the number to be reversed");
			int num = 45854;
			int rem,reversedNum=0;
			int OriginNum = num;
			
			while(num > 0) {
				rem = num%10;
				num = num/10;
				reversedNum = (reversedNum*10)+rem;
				
			}
			if(OriginNum == reversedNum) { //check if original num is reveresed 
				System.out.println("It is palindrome");
			}
			else {
				System.out.println("Not palindrome");
			}
		}
}
