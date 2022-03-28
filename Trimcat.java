//1. String Processing - TrimCat
//Write a program to read a string and return a new string which is made of
//every alternate characters starting with the first character. For example
//NewYork will generate Nwok, and Samurai will generate Smri.
//Include a class UserMainCode with a static method getAlternateChars which
//accepts the string. The return type is the modified string.
//Create a Class Main which would be used to accept the string and call the
//static method present in UserMainCode.
//Input and Output Format:
//Input consists of a string.
//Output consists of string.
//Refer sample output for formatting specifications.
//Sample Input 1:
//Hello
//Sample Output 1:
//Hlo



package StringSB;


import java.util.Scanner;

public class Trimcat {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(alternatingChar(s));
  }

  public static String alternatingChar(String s)
                {

                             String s1=s.replaceAll(" ", "");
                                StringBuffer sbf = new StringBuffer();
                                for(int i = 0; i < s.length() ; i=i+2)
                                {
                                                sbf.append(s.charAt(i));
                                                                                
                                }
                                String str = sbf.toString();
                                return str;
                }
}