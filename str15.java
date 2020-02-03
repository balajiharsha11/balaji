public class str15 {
public static void main(String[] args) {
		String s1="New York";
		String s2="NWYR";
		System.out.println(StringFormatting(s1,s2));
	}
public static String StringFormatting(String s1, String s2) {
	StringBuffer s4=new StringBuffer();
	String s3=s1.toUpperCase();
	for(int i=0;i<s2.length();i++)
		for(int j=0;j<s3.length();j++)
			if(s2.charAt(i)==s3.charAt(j))
				s4.append(s1.charAt(j)).append('+');
	return s4.toString();
}
}