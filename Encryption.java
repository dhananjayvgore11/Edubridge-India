//2. String Encryption
//Given an input as string and write code to encrypt the given string using
//following rules and return the encrypted string:
//1. Replace the characters at odd positions by next character in alphabet.
//2. Leave the characters at even positions unchanged.
//Note:
//- If an odd position charater is 'z' replace it by 'a'.
//- Assume the first character in the string is at position 1.
//Include a class UserMainCode with a static method encrypt which accepts a
//string.
//The return type of the output is the encrypted string.
//Create a Main class which gets string as an input and call the static
//method encrypt present in the UserMainCode.
//Input and Output Format:
//Input is a string .
//Output is a string.
//Sample Input 1:
//curiosity
//Sample Output 1:
//dusipsjtz
//Sample Input 2:
//zzzz
//Sample Output 2:
//azaz

package StringSB;
import java.util.Scanner;

public class Encryption {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String s1 = sc.nextLine();

System.out.println(stringFormatting(s1));
}
public static String stringFormatting(String s1) {
StringBuffer sb=new StringBuffer();
for(int i=0;i<s1.length();i++){
char c=s1.charAt(i);
if(i%2==0){
if(c==122)
c=(char) (c-25);
else{
c=(char) (c+1);}
sb.append(c);}
else
sb.append(c);}
return sb.toString();
}
}