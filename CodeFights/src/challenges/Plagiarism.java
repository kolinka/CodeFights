package challenges;

public class Plagiarism {

	boolean plagiarismCheck(String[] code1, String[] code2) {

		return false;
	}
	
	public static void main(String[] args) {
		String[] code1= {"def is_even_sum(a, b):", 
		        "    return (a + b) % 2 == 0"};
		String[] code2= {"def is_even_sum(summand_1, summand_2):", 
		        "    return (summand_1 + summand_2) % 2 == 0"};
		
		int i;
		for(i=0; i<code1.length; ++i)
			System.out.println(code1[i]);
		for(i=0; i<code2.length; ++i)
			System.out.println(code2[i]);
		
		Plagiarism test1 = new Plagiarism();
		System.out.println(test1.plagiarismCheck(code1, code2));

	}

}
