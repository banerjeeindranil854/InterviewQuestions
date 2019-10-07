import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ConsicutiveOnesZeroes {
	public static void main(String[] args) {
		String input="001100010011100";
		consecuteValue(input);
	}

	public static void consecuteValue(String input) {
		Pattern pattern = Pattern.compile("0+");
		int count=0;
		Matcher matcher=pattern.matcher(input);
		while (matcher.find()) {
			if((input.substring(matcher.start(),matcher.end())).length()%2==0) {
				count=count+1;
			}
			
		}
		System.out.println(count);
	}
}
