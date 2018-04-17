package arcade;

public class AllLongests {

	static String[] allLongestStrings(String[] inputArray) {
	    int i=0, max=0, count=0;
	    for(String s: inputArray)
	        if(s.length()>max) {
	            max=s.length();
	            count=1;
	        }
	        else if(s.length()==max)
	        	count++;
	    String[] output = new String[count];
	    for(String s: inputArray)
	    	if(s.length()==max) {
	    		output[i++]=s;
	    	}
	    		
	    return output;
	}
	
	public static void main(String[] args) {
		String[] input = {"a", "aba", "a", "ada"};
		String[] result = allLongestStrings(input);
		System.out.println(result.length);
		for(String s: result)
			System.out.println(s);
	}

}
