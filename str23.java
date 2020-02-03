import java.util.StringTokenizer;
public class str23 {
public static void main(String[] args) {
	String s="I work for cognizant";
	System.out.println(noOfWordsInString(s));
}
public static int noOfWordsInString(String s) {
	StringTokenizer t=new StringTokenizer(s," "); 
	return t.countTokens();
}
}