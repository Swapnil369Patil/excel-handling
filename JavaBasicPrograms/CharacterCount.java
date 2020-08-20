package JavaBasicPrograms;

import java.util.HashMap;

//WAP to count occurance of each character in a string

public class CharacterCount {
	
	public static void main (String[]args) {
		
		String str="Swapnil ArunPatil";
		
		String str1="Swapnil ArunPatil";
		HashMap <Character,Integer> charcount=new HashMap <>();
		
		for (Character c : str.toCharArray()) {
			
			if (charcount.containsKey(c))
			{
				charcount.put(c, charcount.get(c)+1);
			}
			
			else {
				
				charcount.put(c,1);
			}
			
		}
		
		System.out.println(charcount);
		System.out.println(str.length());
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.substring(0,7));
		System.out.println(str.trim());
		System.out.println(str.replace(" ", "India"));

	}
}
