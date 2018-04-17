package katas;

public class Nawiasy {

		  public static boolean groupCheck(String s){
//		    boolean curlyIsOpen=false, roundIsOpen=false, squareIsOpen=false;
		    int i,j=0,k, n=s.length();
		    if(n/2+n/2<n)
		    	return false;
		    char c;
		    char[] lastOpened = new char[s.length()];
		    for(i=0; i<n; ++i) {
//			    if(s.charAt(i)=='}' && !curlyIsOpen || s.charAt(i)==')' && !roundIsOpen || s.charAt(i)==']' && !squareIsOpen)
//			    	return false;
			    c=s.charAt(i);
			    System.out.println("charAt["+i+"]="+c);
			    for(k=0; k<=j; ++k)
			    	System.out.println("lastOpened["+k+"]="+lastOpened[k]);
			    switch(c) {
			    	case '}':
			    		if(j>n/2 || j<1 || lastOpened[j-1]!='{') { 
			    			System.out.println("in lastOpened["+(j-1)+"]="+lastOpened[j-1]);
			    			return false;
			    		}
			    		else --j;
			    		break;
			    	case ')':
			    		if(j>n/2 || j<1 || lastOpened[j-1]!='(') return false;
			    		else --j;
			    		break;
			    	case ']':
			    		if(j>n/2 || j<1 || lastOpened[j-1]!='[') return false;
			    		else --j;
			    		break;
			    	default:
			    		lastOpened[j]=c;
			    		++j;		    		
			    
			    }
		    }
		    return true;
		  }

	
	public static void main(String[] args) {
//		Nawiasy instance = new Nawiasy();
		System.out.println(groupCheck("({}{])"));
		System.out.println(groupCheck("({}[])"));
		System.out.println(groupCheck("()"));
	}

}
