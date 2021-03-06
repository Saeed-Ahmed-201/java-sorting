import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		   
		   Integer[] numbers = new Integer[] {5,2,1,3,4,6,8,9,7,10};
		   List<Integer> sortList = Arrays.asList(numbers);
		   
		   // SORTING ASCENDING ORDER LIST BY USING Collections.sort() 
		   // Note - List applying Collections sort() method. In the case of Arrays, we used Arrays.sort() method
		   Collections.sort(sortList);
		   System.out.println(sortList);
		   
		// SORTING DESCENDING ORDER LIST BY USING Collections.sort() 
		   Collections.sort(sortList, Collections.reverseOrder());
		   System.out.println(sortList);
		
	}

}
