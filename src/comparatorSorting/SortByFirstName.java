package comparatorSorting;

import java.util.Comparator;

public class SortByFirstName implements Comparator<Employee>{

	   @Override
	   public int compare(Employee obj1, Employee obj2){
		      return obj1.getFirstName().compareToIgnoreCase(obj2.getFirstName());
	   }
}
