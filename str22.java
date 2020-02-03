public class str22 {
public static void main(String[] args) {
	String s="Hello World";	
	System.out.println(reArrangingWord(s));
}
public static String reArrangingWord(String s) {
	StringBuffer sb=new StringBuffer();
	sb.append(s.substring(s.length()-1));
	sb.append(s.substring(1, s.length()-1));
	sb.append(s.substring(0, 1));
	return sb.toString();
}
}