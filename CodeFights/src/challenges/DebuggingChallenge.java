package challenges;

public class DebuggingChallenge {

	String[] taskMaker(String[] source, int challengeId) {
	    int i,j, n=source.length, bugLines=0, challengeLine=-1, index=0, challengeIndex=0, LineToRemove=0;
	    boolean[] isCommented = new boolean[n];
	    for(i=0; i<n; ++i) {
	        index=source[i].indexOf("//DB");
	        System.out.println("in line "+i+" index="+index);
	        if(index!=-1) {
	            bugLines++;	 
	            isCommented[i]=true;
	            System.out.println("bugLines="+bugLines);
	            if(index+5<source[i].length() && source[i].substring(index+5,source[i].indexOf("//",index+6)).equals(Integer.toString(challengeId))) {
	                challengeLine=i;
	                challengeIndex=index;
	                System.out.println("challengeLine="+challengeLine);
	                for(LineToRemove=i; isCommented[LineToRemove]; LineToRemove--);
	                
	            }	            
	        }	        
	    }	    
	            
	    String[] output = new String[n-bugLines];
	    for(i=0, j=0; i<n; ++i) {   		
	    	if(!isCommented[i] && i!=LineToRemove) {
	    		output[j]=source[i];
	    		++j;
	    	}
	    	else if(i==challengeLine) {
	    		System.out.println("i="+i);
	    		System.out.println("challengeIndex="+challengeIndex);
	    		System.out.println("source[i].substring(0, challengeIndex)="+source[i].substring(0, challengeIndex)+".");
	    		System.out.println("source[i].substring(challengeIndex+7+d³.liczby)="+source[i].substring(challengeIndex+7+Integer.toString(challengeId).length()));
	    		output[j]=source[i].substring(0, challengeIndex)+source[i].substring(challengeIndex+7+Integer.toString(challengeId).length());
	    		++j;
	    	}	    		
	    }	    	
	    return output;
	}

	
	public static void main(String[] args) {
//		String[] source = {"ans = 0", 
//		                   "for i in range(n):", 
//		                   "    for j in range(n):", 
//		                   "    //DB 3//for j in range(1, n):", 
//		                   "    //DB 2//for j in range(n + 1):", 
//		                   "        ans += 1", 
//		                   "return ans"};
		
		String[] source = {"abacaba  dabacaba", 
		                    "//DB 5//abacaba  abacabadabacaba", 
		                    "aaaaaaaa", 
		                    "//DB 3//lalalala", 
		                    "codefights", 
		                    "//DB 1//codefights is awesome", 
		                    "//DB 28//    spaces! ! ! ! !  ", 
		                    "//DB 999//reallybignumber"};
		
		for(int i=0; i<source.length; ++i)
			System.out.println(i+" "+source[i]);
		int challengeId = 28;
		DebuggingChallenge test = new DebuggingChallenge();
		String[] result = test.taskMaker(source, challengeId);
		for(int i=0; i<result.length; ++i)
			System.out.println(i+" "+result[i]);
		

	}

}
