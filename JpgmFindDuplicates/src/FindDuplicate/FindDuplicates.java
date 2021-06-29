package FindDuplicate;

public class FindDuplicates {
	public static void main(String[] args) {
		System.out.println("Java pgm to find the duplicates");
		int[] arr = {1,2,3,5,7,8,8,2};
		
		for(int i=0; i<arr.length ; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
				
			}
		}
		
		
	}
}
	
