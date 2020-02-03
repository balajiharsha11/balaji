public class str27 {
public static void main(String[] args) {
	String s1="education";
	System.out.println(vowelsCheck(s1));
}
public static boolean vowelsCheck(String s1) {
	boolean b=false;
	int n1=0,n2=0,n3=0,n4=0,n5=0;
	for(int i=0;i<s1.length();i++){
		char c=s1.charAt(i);
		if(c=='a' || c=='A')
			n1++;
		if(c=='e' || c=='E')
			n2++;
		if(c=='i' || c=='I')
			n3++;
		if(c=='o' || c=='O')
			n4++;
		if(c=='u' || c=='U')
			n5++;}
	if(n1==1 && n2==1 && n3==1 && n4==1 && n5==1)
		b=true;
	return b;
}
}