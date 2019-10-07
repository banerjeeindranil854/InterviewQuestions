import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomSort {
public static void main(String[] args) {
	List<String> allValue=new ArrayList<String>();
	allValue.add("Hello");
	allValue.add("My");
	allValue.add("name");
	allValue.add("is");
	allValue.add("Don");
	Comparator<String> comparator=new Comparator() {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1.toString().toUpperCase().toCharArray()[0]>o2.toString().toUpperCase().toCharArray()[0])
		return 1;
		else if(o1.toString().toUpperCase().toCharArray()[0]>o2.toString().toUpperCase().toCharArray()[0])
			return -1;
		else 
		return 0;
	}; 
	};

	Collections.sort(allValue,comparator); 
	System.out.println(allValue);
}
}
