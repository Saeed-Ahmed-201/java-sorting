import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
   * There is no direct support for sorting the sets in Java. 
   * To sort a set, follow these steps:
   *  1 - Convert set to list.
   *  2 - Sort list using Collections.sort() API
   *  3 - Convert list back to set.
 */

public class SortingSet {
	
	   public static void main(String args[]) {
		   
		   Set<Integer> numberSet = new LinkedHashSet<>(Arrays.asList(20,10,30,50,40));
		   
		   // step 1 - convert set to list
		   List<Integer> numberList = new ArrayList<Integer>(numberSet);
		   // step 2 - sort the list using Collections.sort() api
		   Collections.sort(numberList);
		   // step 3 - convert list back to set
		   numberSet = new LinkedHashSet<>(numberList);
		   
		   System.out.println(numberSet);
		
	   }

}
