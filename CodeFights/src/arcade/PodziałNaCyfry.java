package arcade;

public class Podzia³NaCyfry {

	static boolean isLucky(int n) {
	    int right=0, left=0;
	    
	    if(n==0) return true;
	    //right
	    
	    if(n<100) {
	        right=n%10;
	        n/=10;
	        left=n%10;
	    }
	    else if(n<10000) {
	        right=n%10;
	        n/=10;
	        right+=n%10;
	        n/=10;
	        left+=n%10;
	        n/=10;
	        left+=n%10;
	    }
	    else {
	        right=n%10;
	        n/=10;
	        right+=n%10;
	        n/=10;
	        right+=n%10;
	        n/=10;
	        left+=n%10;
	        n/=10;
	        left+=n%10;
	        n/=10;
	        left+=n%10;
	    }
	    return right==left;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
