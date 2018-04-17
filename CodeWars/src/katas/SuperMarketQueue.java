package katas;

public class SuperMarketQueue {

	    public int solveSuperMarketQueue(int[] customers, int n) {
	      int[] tills = new int[n];
	      int i,j, imin=0, max=0;
    	  System.out.println("imin="+imin);
	      for(i=0; i<customers.length; ++i) {    		 
	    	  for(j=0; j<n; ++j) {
    			  System.out.println(j+" till="+tills[j]);
	    		  if(tills[j]<tills[imin]) {
	    			  imin = j;    			  
	    		  }	    		 
	    	  }
	    	  System.out.println("imin="+imin);
    		  System.out.println(i+" customer="+customers[i]);
	    	  tills[imin]+=customers[i];
	      }		  
	      for(int till: tills)
	    	  if(till>max)
	    		  max=till;
	      return max;
	    }	    
	
	public static void main(String[] args) {
		int[] customers = {2, 3, 6, 4, 13, 26};
		SuperMarketQueue queue = new SuperMarketQueue();
		int time =queue.solveSuperMarketQueue(customers, 2);
		System.out.println(time);

	}

}
