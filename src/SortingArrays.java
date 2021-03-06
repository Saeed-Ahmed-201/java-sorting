import java.util.Arrays;
import java.util.Collections;

public class SortingArrays {

	   public static void main(String args[]) {
		   
		      Integer[] numbers = new Integer[] {20,10,30,50,40,60,5};
		      // SORTING ARRAY OF NUMBERS IN ASCEDING
		      Arrays.sort(numbers);
		      System.out.println("ASCENDING ORDER : " + Arrays.toString(numbers));
		      
		      
		      // SORTING ARRAY OF NUMBERS IN PARTICULAR RANGE 
		      Arrays.sort(numbers, 2,5);
		      System.out.println("SORTED IN PARTICULAR RANGE : " + Arrays.toString(numbers));
		   
		   // SORTING ARRAY OF NUMBERS IN DESCENDING ORDER
		      Arrays.sort(numbers, Collections.reverseOrder());
		      System.out.println("DESCENDING ORDER : " + Arrays.toString(numbers));
		      
	   }
}
