package comparatorSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Sort with Java 8 Lambda
// Java 8 Lambda expressions help in writing Comparator implementations on the fly. 
// We do not need to create seperate class to provide the one time comparison logic.

public class ComparatorJava8 {
	
       public static void main(String args[]) {
    	     
    	     // Lambda sorting by using comparator interface
    	     Comparator<Employee> firstNameSorter = (a, b) -> a.getFirstName().compareToIgnoreCase(b.getFirstName());
    	     
    	     List<Employee> emp = new ArrayList<>();
    	     emp.add(new Employee(21, "saeed", "sheikh",26));
    	     emp.add(new Employee(24, "zain", "sheikh", 14));
    	     emp.add(new Employee(27, "yasir", "lashari", 25));
    	     emp.add(new Employee(33, "asad", "dasti", 28));
    	     
    	     Collections.sort(emp, firstNameSorter);
    	     
    	     System.out.println(emp);
    	   
       }
}
