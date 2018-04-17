package arcade;

public class CommonCharacterCount {

	static int commonCharacterCount(String s1, String s2) {

	    int i,j, n=s1.length(), m=s2.length(), count=0;
	    char c;
	    StringBuilder sb = new StringBuilder(s2);
	    
	    for(i=0; i<n; ++i) {
	        c=s1.charAt(i);
	        System.out.println(c);
	        j=sb.toString().indexOf(c);
	        System.out.println(j);
	        if(j!=-1) {
	        	count++;
	        	sb.deleteCharAt(j);
	        }
	        System.out.println(sb);
	    }	    
	    return count;
	}
	
	public static void main(String[] args) {
		System.out.println(commonCharacterCount("afsfsda", "sadfew"));

	}

}
