import java.util.StringTokenizer;
public class str18{
public static void main(String[] args) {
	String input1="hai hello how are you?? hai hai";		
	String input2="what hai";
	System.out.println(stringOccurance(input1,input2));
}

public static int stringOccurance(String input1, String input2){
	int count=0;
	StringTokenizer t1=new StringTokenizer(input2," ");
	String s1=t1.nextToken();
	String s2=t1.nextToken();
	StringTokenizer t2=new StringTokenizer(input1," ");
	while(t2.hasMoreTokens()){
		if(t2.nextToken().equals(s2))
			count++;	}
	return count;
}
}