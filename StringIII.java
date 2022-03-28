package StringSB;
import java.util.*;

public class StringIII {


	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    String s1 = s.replaceAll("[x]", "");
	    String s2 = s.replaceAll("[^x]", "");
	    
	    System.out.println(s1 + s2);
	  }
	}
