package FindDuplicate;

import java.time.LocalDateTime;

public class StringConcat {
	public static void main(String[] args) {
		String s1 = "Kavya";
		String s2 = "Raj";
		String s4 = "raj";
		//String s3 = s1+s2 ; //by not using concat method 
		String s3 = s1.concat(s2);   // by using concat method
		
		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println("Display local Date and Time:" +myDateTime);
		boolean s5 = s2.equalsIgnoreCase(s4);
		char ch = s4.charAt(2);
		System.out.println("Char of s4 at 2nd postiiton: " +ch);
		System.out.println("string that starts with 'v' : " +s1.startsWith("v"));  
		System.out.println("Length of String s1: " +s1.length());
		System.out.println(" string s2 "+s2+" is equal to s4 "+s4+"  :" +s5);
		System.out.println("Concatination of string s1 and s2 is :" +s3);
	}

}
