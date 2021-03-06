package comparatorSorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Employee {
	
	    private Integer id;
	    
	    private String firstName;
	    
	    private String lastName;
	    
	    private Integer age;

		public Employee(Integer id, String firstName, String lastName, Integer age) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}
	    
		
	    
		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
		}

		public static void main(String []args) {
		
			   List<Employee> employees = new ArrayList<>();
			   employees.add(new Employee(22, "saeed", "sheikh", 26));
			   employees.add(new Employee(25, "yasir", "lashari", 25));
			   employees.add(new Employee(32, "asad", "dasti", 28));
			   employees.add(new Employee(23, "zain", "sheikh", 14));
			   
//			   Collections.sort(employees, new SortByFirstName());
			   
			    Collections.sort(employees, new SortByAge());
			   
			   System.out.println(employees);
			
		}
}
