package arrays;

public class Rotating {

	static int[][] rotateImage(int[][] a) {
	    // for(int i=0; i< tablica.length; i++)
	    // for(int j=0; j< tablica[i].length; j++)
	    //     tablica[i][j] = 0;
	    if(a.length<2)
	        return a;
	    int n = a.length;
	    int half = n/2;
	    int i,j,temp;
	    //z [1:(half-1)][1:(half-1)] do [1:(half-1)][half:(n-1)]	    
	    //z [1:(half-1)][half:(n-1)] do [half:(n-1)][half:(n-1)]
	    //z [half:(n-1)][half:(n-1)] do [half:(n-1)][1:(half-1)]
	    //z [half:(n-1)][1:(half-1)] do [1:(half-1)][1:(half-1)]
	    
	    for(i=0; i<half; ++i)
	    	for(j=0; j<half; ++j) {
	    		temp = a[i][j];
	    		a[i][j] = a[n-1-j][i];
	    		a[n-1-j][i] = a[n-1-i][n-1-j];
	    		a[n-1-i][n-1-j] = a[j][n-1-i];
	    		a[j][n-1-i] = temp;
	    	}
	    if(n%2==1)
	    	for(i=0; i<half; ++i) {
	    		temp = a[i][half];
	    		a[i][half] = a[half][i];
	    		a[half][i] = a[n-1-i][half];
	    		a[n-1-i][half] = a[half][n-1-i];
	    		a[half][n-1-i] = temp;
	    	}
	    return a;
	}
	
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0; i< a.length; i++){
		    for(int j=0; j< a[i].length; j++)
		        System.out.print(a[i][j]);
		    System.out.println();
		}
		rotateImage(a);
		for(int i=0; i< a.length; i++){
		    for(int j=0; j< a[i].length; j++)
		        System.out.print(a[i][j]);
		    System.out.println();
		}
	}

}
