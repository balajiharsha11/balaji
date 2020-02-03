public class str16 {
public static void main(String[] args) {
	String srch="MaanVeerSinghKhurana";
	String s1="Veer";
	String s2="Singh";
	int n=searchString(srch,s1,s2);
	if(n==1)
		System.out.println(s1+" comes before "+s2);
	else
		System.out.println(s2+" comes before "+s1);
}
public static int searchString(String srch, String s1, String s2) {
	int n=0;
	int n1=srch.indexOf(s1);
	int n2=srch.indexOf(s2);
	if(n1<n2)
		n=1;
	else
		n=2;
	return n;
}
}