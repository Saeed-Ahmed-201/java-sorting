import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To sort list of custom objects, we have two popular approaches i.e. Comparable and Comparator.
*/

public class SortingObject implements Comparable<SortingObject> {

	   private Integer id;
	   private String firstName;
	   private Integer age;

	   @Override
	   public int compareTo(SortingObject obj) {
		      return this.getId().compareTo(obj.getId());
	   }

	public SortingObject(Integer id, String firstName, Integer age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", firstName=" + firstName + ", age=" + age + "]";
	}
	   
	public static void main(String args[]) {
		
		  List<SortingObject> sortingObject = new ArrayList<>();
		  sortingObject.add(new SortingObject(5, "saeed", 21));
		  sortingObject.add(new SortingObject(2, "zain", 22));
		  sortingObject.add(new SortingObject(1, "haseeb", 23));
		  sortingObject.add(new SortingObject(7, "hamad", 29));
		  
		  Collections.sort(sortingObject);
		  
		  System.out.println(sortingObject);
	}
}
