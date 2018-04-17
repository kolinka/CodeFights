package arcade;

public class AlmostIncreasing {

	boolean almostIncreasingSequence(int[] sequence) {
	    int i,n=sequence.length;
	    // for(i=1; i<n; ++i)
	    //     if(sequence[i-1]>=sequence[i] && trash!=i-1)
	    //         trash = i;
	    int stops=0;
//	     for(i=1; i<n; ++i)
//	         if(sequence[i-1]>=sequence[i]) {
//	             stops++;
//	             if(i+1<n && sequence[i-1]>=sequence[i+1] && i-1>0)
//	                 return false;
//	         }
	        
//	     if(stops>1) return false;
//	     return true;
	    
	    if(n>1 && sequence[0]>=sequence[1]) {
	        for(i=2; i<n; ++i)
	            if(sequence[i-1]>=sequence[i])
	                return false;
	        return true;
	    }
	    
	        for(i=2; i<n; ++i)
	            if(sequence[i-1]>=sequence[i]) {
	                stops++;
	                if(i+1<n && sequence[i-1]>=sequence[i+1] && sequence[i-2]>=sequence[i])
	                    return false;
	                if(i+1<n && sequence[i-1]<sequence[i+1])
	                	++i;
	            }
	        if(stops>1) return false;
	        return true;
	    
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
