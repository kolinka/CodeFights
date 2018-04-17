package challenges;

public class Walk {

	static double rWalk(int n) {
	    int i, meetingWalks=0, allWalks=2;
	    //allWalks = 2^(2n)
	    allWalks = potega(2,n)*potega(2,n);
	    System.out.println("allWalks="+allWalks);
	    
	    //meetingWalks = sum_{i=1}^n (n po i)^2
	    //(n po i) = newton(n, i)
	    for(i=0; i<=n; ++i)
	        meetingWalks+=newton2(n,i);
	    System.out.println("meetWalks="+meetingWalks);
	    
	    return 100*(double)meetingWalks/allWalks;
	}

	static int potega(int x, int n) {
	    if(n==0)
	        return 1;
	    if(n==1)
	        return x;
	    int potega = potega(x, n/2)*potega(x, n/2);
	    if(n%2==1)
	        potega*=x;
	    return potega;
	}

	static int newton2(int n, int i) {    //= n!/(i!*(n-i)!)
	    int j, licznik=1, mianownik=1, startLicznika, koniecMianownika;
	    if(i>n/2) {
	        startLicznika = i+1;
	        koniecMianownika = n-i;
	    }
	    else {
	        startLicznika = n-i+1;
	        koniecMianownika = i;
	    }
//	    System.out.println("startLicznika "+startLicznika);
//	    System.out.println("koniecMianownika "+koniecMianownika);
	    for(j=startLicznika; j<=n; ++j)
	        licznik*=j;
	    for(j=2; j<=koniecMianownika; ++j)
	        mianownik*=j;
	    System.out.println("("+n+" po "+i+") = "+licznik/mianownik);
	    return (licznik/mianownik)*(licznik/mianownik);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pro = rWalk(2);
		System.out.println("probability = "+pro);
		pro = rWalk(3);
		System.out.println("probability = "+pro);
		pro = rWalk(4);
		System.out.println("probability = "+pro);
	}

}
