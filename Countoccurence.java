//4.	Write a Java program to counts occurrences of a certain character in a given string
package Inheritance;

public class Countoccurence {


   
  public static void main(String args[]) 
  {
 
  String input = "aaaabbcccddd";
  char search = 'a';             // Character to search is 'a'.
  
  int hash_arr[] = new int[26];
  
  for(int i=0;i<input.length();i++)
  {
      hash_arr[input.charAt(i) - 97]++;
  }
  
  int result = hash_arr[search-97]; // we get count value of character from the array.
  
  System.out.println("The Character '"+search+"' appears "+result+" times.");
  }
}