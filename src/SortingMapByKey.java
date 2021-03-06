import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
   * A map is the collection of key-value pairs. So map can be sorted in two ways i.e. sort by key or sort by value.
   * The best and most effective a sort a map by keys is to add all map entries in TreeMap object 
   * TreeMap store the entry sets in sorted order by keys.
 */

public class SortingMapByKey {
	   
	   public static void main(String args[]) {
		   
		      Map<Integer, String> students = new HashMap<>();
		      students.put(21, "Gul Khan");
		      students.put(57, "Saeed Ahmed");
		      students.put(73, "Yasir Hussain");
		      students.put(51, "Parvez Ali");
		      
		      // TreeMap store the entry sets in sorted order by keys
		      Map<Integer, String> treeMap = new TreeMap<>(students);
		      System.out.println(treeMap);
	   }
}
