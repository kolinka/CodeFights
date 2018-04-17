package challenges;

import java.util.Arrays;
import java.util.LinkedList;

public class ProCategories {

	String[][][] proCategorization(String[] pros, String[][] preferences) {
		int i,j, numberOfPros=pros.length;
		LinkedList<String> categories = new LinkedList<String>();
		for(i=0; i<numberOfPros; ++i)
			for(String category: preferences[i])
				if(!categories.contains(category))
					categories.add(category);
		System.out.println(categories);
		String[] cats = new String[categories.size()];
		categories.toArray(cats);
		Arrays.sort(cats);
		for(String str: cats)
			System.out.print(str+", ");		
		
		String[][][] result = new String[cats.length][2][1];
		for(i=0; i<cats.length; ++i)
			result[i][0][0] = cats[i];
		System.out.println("tyle sie udalo");		
		
		LinkedList<String> prosOfCategory = new LinkedList<String>();
		j=0;
		for(i=0; i<cats.length; ++i) {
			for(j=0; j<numberOfPros; ++j) {
//				System.out.println("numberOfPros="+numberOfPros);
				System.out.println("j="+j);
				if(inIs(preferences[j], cats[i])) {
					System.out.println(cats[i]+" is in preferences of "+j);
					prosOfCategory.add(pros[j]);
				}
				else System.out.println(cats[i]+" is NOT in preferences of "+j);
			}
			System.out.println("i="+i+" "+prosOfCategory);
			result[i][1] = new String[prosOfCategory.size()];
			for(j=0; j<prosOfCategory.size(); ++j)
				result[i][1][j] = prosOfCategory.get(j);
			prosOfCategory.clear();
		}		
		return result;
	}
	
	boolean inIs(String[] preferences, String category) {
		for(int i=0; i<preferences.length; ++i)
			if(preferences[i].equals(category))
				return true;
		return false;
	}
	
	public static void main(String[] args) {
		String[] pros = {"Jack", "Leon", "Maria"};
		String[][] preferences = {{"Computer repair", "Handyman", "House cleaning"},
		                          {"Computer lessons", "Computer repair", "Data recovery service"},
		                          {"Computer lessons", "House cleaning"}};
		ProCategories instance = new ProCategories();
		String[][][] categorization = instance.proCategorization(pros, preferences);
		int i,j,k;
		for(i=0; i<categorization.length; ++i)
			for(j=0; j<categorization[i].length; ++j)
				for(k=0; k<categorization[i][j].length; ++k)
					System.out.println("i="+i+", j="+j+", k="+k+": "+categorization[i][j][k]);

	}

}
