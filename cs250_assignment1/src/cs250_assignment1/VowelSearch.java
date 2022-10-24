/**
 * 
 */
package cs250_assignment1;

/**
 * @author jlvar
 *
 */
public class VowelSearch {

	public static void main(String[] args) {
		String s = "Ephesians";
		String s2 = s.toUpperCase();
		System.out.println("This program counts the number of vowels in the defined string:");
		System.out.println(s);
		int count = 0;
		
		for (int i = 0; i < s2.length(); i++)
		{
			if (s2.charAt(i) == 'A')
			{
				count++;
			}
			if (s2.charAt(i) == 'E')
			{
				count++;
			}
			if (s2.charAt(i) == 'I')
			{
				count++;
			}
			if (s2.charAt(i) == 'O')
			{
				count++;
			}
			if (s2.charAt(i) == 'U')
			{
				count++;
			}
			}
		System.out.println("The number of vowels in the string is: " + count);
			}

	}
