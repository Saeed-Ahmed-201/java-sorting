import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * In java 8, Map.Entry class has static method comparingByValue() to help you in sorting by values. 
 * This method returns a Comparator that compares Map.Entry in natural order on values.
*/

public class SortingMapByValue {
	
	   public static void main(String args[]) {
		   
		      Map<Integer, String> unsortedStudents = new HashMap<>();
		      unsortedStudents.put(57, "saeed ahmed");
		      unsortedStudents.put(21, "gul khan");
		      unsortedStudents.put(72, "yasir hussain");
		      unsortedStudents.put(51, "parvez hussain");
		      
		      // /LinkedHashMap preserve the ordering of elements in which they are inserted
		      Map<Integer, String> sortedMap = new LinkedHashMap<>();
		      
		       unsortedStudents
		      .entrySet()
		      .stream()
		      .sorted(Map.Entry.comparingByValue())
		      .forEachOrdered(student -> {
		    	  sortedMap.put(student.getKey(), student.getValue());
		       });
		      
		      System.out.println(sortedMap);
		      
		      
		   
	   }

}
