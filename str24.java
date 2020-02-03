public class str24 {
public static void main(String[] args) {
	String ip1="cowboy";
	String ip2="cow";
	System.out.println(printingStringDependingOncharCount(ip1,ip2));
}
public static String printingStringDependingOncharCount(String ip1,String ip2) {
	StringBuffer sb=new StringBuffer();
	int n1=ip2.length();
	if(n1==3)
		for(int i=0;i<n1-1;i++)
			sb.append(ip1.substring(0, n1));
	else if(n1==2)
		for(int i=0;i<n1+1;i++)
			sb.append(ip1.substring(0, n1));
	return sb.toString();
}
}