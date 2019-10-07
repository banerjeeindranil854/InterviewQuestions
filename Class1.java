
public class Class1 {
	public static void main(String[] args) {
		String[] dir = { "i", "like", "sam", "sung", "samsung", "mobile" };
		String allvalue = "ilikesamsung";
		System.out.println(dictenory(dir,allvalue).toString());
	}

	static StringBuilder dictenory(String[] args, String allvalue) {
		String tempString = allvalue;
		StringBuilder strBuild = new StringBuilder();
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < tempString.length(); j++) {
				if (tempString.substring(0, j+1).equals(args[i])) {
					tempString = tempString.substring(j+1, tempString.length());
					strBuild.append(args[i]).append(" ");
                    break;
				}
			}
		}
		return strBuild;

	}
}
