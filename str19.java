public class str19 {
public static void main(String[] args) {
	String[] s1={"2AA","12","A2C","C5a"};
	getSum(s1);	}
public static void getSum(String[] s1) {
	int sum=0;
	for(int i=0;i<s1.length;i++)
		for(int j=0;j<s1[i].length();j++){
			char c=s1[i].charAt(j);
			if(Character.isDigit(c)){
				String t=String.valueOf(c);
				int n=Integer.parseInt(t);
				sum=sum+n; } }
	System.out.println(sum);	}
} 