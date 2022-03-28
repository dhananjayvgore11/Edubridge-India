//6.	Write a Java program to sort in ascending and descending order by length of the given array of strings.
//Sample Output:
//Original unsorted colors: [Green, White, Black, Pink, Orange, Blue, Champagne, Indigo, Ivory]
//Sorted color (descending order): [Champagne, Orange, Indigo, Green, White, Black, Ivory, Pink, Blue]
//Sorted color (ascending order): [Pink, Blue, Green, White, Black, Ivory, Orange


package Inheritance;
import java.util.Arrays;
public class Ascending {



   private static String[] strs = {"Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory"};
    
    public enum sort_asc_dsc{
       ASC, DESC
   }
    
    public static void main(String[] args) {
       System.out.println("\nOriginal unsorted colors: " + Arrays.toString(strs));
        sort_array_by_length(strs, sort_asc_dsc.DESC);
       System.out.println("\nSorted color (descending order): " + Arrays.toString(strs));
       sort_array_by_length(strs, sort_asc_dsc.ASC);
       System.out.println("\nSorted color (ascending order): " + Arrays.toString(strs));            
   }
   public static void sort_array_by_length(String[] strs, sort_asc_dsc direction) {
       if (strs == null || direction == null || strs.length == 0) {
           return;
       }
       if (direction.equals(sort_asc_dsc.ASC)) {
           Arrays.sort(strs, (String str1, String str2)
                   -> Integer.compare(str1.length(), str2.length()));
       } else if (direction.equals(sort_asc_dsc.DESC)) {
           Arrays.sort(strs, (String str1, String str2)
                   -> (-1) * Integer.compare(str1.length(), str2.length()));
       }
   }
}