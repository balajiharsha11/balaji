public class str17 {
public static void main(String[] args) {
	String input1="abc2012345";
	String input2="abc2112660";
	int input3=4;
	System.out.println(meterReading(input1,input2,input3));
}
public static int meterReading(String input1, String input2, int input3) {
	int n1=Integer.parseInt(input1.substring(5, input1.length()));
	int n2=Integer.parseInt(input2.substring(5, input2.length()));
	int n=Math.abs((n2-n1)*input3);
	return n;
}
}