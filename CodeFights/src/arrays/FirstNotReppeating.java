package arrays;

import java.util.LinkedHashMap;

public class FirstNotReppeating {
	static char firstNotRepeatingCharacter(String s) {
		int i;
	    int len = s.length();
	    System.out.println(len);
	    
	    LinkedHashMap<Character, Integer> chars = new LinkedHashMap<Character, Integer>();
	    
	    for(i=0; i<len; i++)
	        if(chars.containsKey(s.charAt(i)))
	        	chars.put(s.charAt(i), 2);
	        else chars.put(s.charAt(i), 1);
	    
	    for(char c: chars.keySet())
	    	if(chars.get(c)==1)
	    		return c;
	
	    return '_';
	}
	
	public static void main (String[] args) {
		System.out.println(firstNotRepeatingCharacter("ajfsjsda"));
	}
}
