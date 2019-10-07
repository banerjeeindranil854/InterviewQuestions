
public class LargestPalandrom {
public static void main(String[] args) {
String largestPalindrom="ABCDCBAHJTSMS";	
getPalindrom(largestPalindrom);
}
public static void getPalindrom(String largestPalindrom) {
for(int i=0;i<largestPalindrom.length();i++) {
	for(int j=i;j<largestPalindrom.length();j++) {
		if(palindromCheck(largestPalindrom.substring(i,j+1))) {
			System.out.println(largestPalindrom.substring(i,j+1));
			i=j;
			break;
		}
	}
}

}
static Boolean palindromCheck(String bx) {
	StringBuilder as=new StringBuilder();
	as.append(bx);
	if(bx.equals(as.reverse().toString())&& bx.length()>1)
	return true;
	return false;
}
}
