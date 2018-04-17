package challenges;

import java.util.LinkedList;

public class Rating {

	int[] ratingThreshold(double threshold, int[][] ratings) {

	    int i;
	    double average;
	    LinkedList<Integer> results = new LinkedList<Integer>();
	    for(i=0; i<ratings.length; ++i) {
	        average = 0;
	        for(int rate: ratings[i])
	            average+=rate;
	        average/=ratings[i].length;
	        if(average<threshold)
	            results.add(i);
	    }
	    int n = results.size();
	    int[] result = new int[n];
	    for(i=0; i<n; ++i)
	    	result[i]=results.get(i);
	    return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
