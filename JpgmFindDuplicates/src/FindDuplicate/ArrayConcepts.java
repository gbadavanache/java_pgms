package FindDuplicate;

import java.util.ArrayList;

public class ArrayConcepts {
	public static void main(String[] arg) {
		ArrayList<String> car = new ArrayList<String>();
		car.add("Volvo");
		car.add("BMV");
		car.add("Ritz");
		car.add("Tiago");
		car.remove(2); //remove Ritz from the list
		
		for(int i=0;i<car.size();i++) {
			System.out.println(car.get(i));
		}
		
	}

}
