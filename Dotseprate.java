//8. Name Shrinking
//Write a program that accepts a string as input and converts the first two
//names into dot-separated initials and printa the output.
//Input string format is 'fn mn ln'. Output string format is 'ln [mn's
//1st character].[fn's 1st character]'
//Include a class UserMainCode with a static method getFormatedString which
//accepts a string. The return type (String) should return the shrinked
//name.
//Create a Class Main which would be used to accept Input String and call
//the static method present in UserMainCode.
//Input and Output Format:
//Input consists of a string.
//Output consists of a String.
//Refer sample output for formatting specifications.
//Sample Input:
//Sachin Ramesh Tendulkar
//Sample Output:
//Tendulkar R.S

package StringSB;




//Java program to print the initials
//of a name with the surname
import java.util.*;

class Dotseprate {
	public static void printInitials(String str)
	{
		int len = str.length();

		// to remove any leading or trailing spaces
		str = str.trim();

		// to store extracted words
		String t = "";
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);

			if (ch != ' ') {

				// forming the word
				t = t + ch;
			}

			// when space is encountered
			// it means the name is completed
			// and thereby extracted
			else {
				// printing the first letter
				// of the name in capital letters
				System.out.print(Character.toUpperCase(t.charAt(0))
								+ ". ");
				t = "";
			}
		}

		String temp = "";

		// for the surname, we have to print the entire
		// surname and not just the initial
		// string "t" has the surname now
		for (int j = 0; j < t.length(); j++) {

			// first letter of surname in capital letter
			if (j == 0)
				temp = temp + Character.toUpperCase(t.charAt(0));

			// rest of the letters in small
			else
				temp = temp + Character.toLowerCase(t.charAt(j));
		}

		// printing surname
		System.out.println(temp);
	}

	public static void main(String[] args)
	{
		String str = "Dhananjay Vijay Gore";
		printInitials(str);
	}
}
