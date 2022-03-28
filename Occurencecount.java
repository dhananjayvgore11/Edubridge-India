package StringSB;
import java.io.*;



import java.util.Scanner;
import java.util.StringTokenizer;
public class Occurencecount {
	public static int compareDashes(String s1,String s2) {
		int ans=0; 
		StringTokenizer t=new StringTokenizer(s1);
		while(t.hasMoreTokens()){
			String s3=t.nextToken();
			if(s3.equals(s2))
				ans++;
			}

return ans;
}
public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	String s1=in.nextLine();
	String s2=in.nextLine();
	System.out.println(Occurencecount.compareDashes(s1,s2));in.close();
	}
}
