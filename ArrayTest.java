import java.util.HashSet;
import java.util.Set;

public class ArrayTest {
	public static void main(String[] args) {
		String[] array = { "eat", "tea", "tan", "ate", "nat", "bat" };
		refractoring(array);
	}

	public static void refractoring(String[] args) {
		Set<String> ak=null;
		for (int i = 0; i < args.length; i++) {
			ak =new HashSet<String>();
			ak.add(args[i]);
			for (int j = 1; j < args.length; j++) {
				if(checkCharecter(args[i],args[j])) {
					ak.add(args[j]);
					i=j;
				}
			}
			System.out.println(ak);
		}
	}

	public static Boolean checkCharecter(String one, String two) {
		char[] oneChar = one.toCharArray();
		char[] twoChar = two.toCharArray();
		int count=0;
		for (int i = 0; i < oneChar.length; i++) {
			if (one.length() == two.length()) {
				for (int j = 0; j < twoChar.length; j++) {
					if (oneChar[i] == twoChar[j]) {
						count=count+1;
					}
				}
			}
		}
		if(count==one.length()) {
			return true;
		}
		return false;
	}
}
