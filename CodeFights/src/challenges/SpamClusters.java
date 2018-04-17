package challenges;

import java.util.ArrayList;
import java.util.HashSet;

public class SpamClusters {

	int[][] spamClusterization(String[] requests, int[] ids, double threshold) {
		int i, j, k, n=requests.length;
		String word;
		ArrayList<HashSet<String>> sets = new ArrayList<HashSet<String>>();	//each String request (requests[i]) will be represented by a Hashset set (sets[i]) of String words
		System.out.println("n="+n);
		
		//splitting each request from request into a set of words named sets[i]
		
		for(i=0; i<n; ++i) {
			//preparing a new set to be able to contain requests[i] as words
			HashSet<String> set = new HashSet<String>();
			sets.add(set);
			System.out.println("i="+i);
			System.out.println("request["+i+"]="+requests[i]);
			System.out.println("request["+i+"].length="+requests[i].length());
			//all the words should be in lower case, so we can do it before splitting requests
			requests[i]=requests[i].toLowerCase();
			j=-1;
			
			//splitting requests[i] into a set of words
			while(j<requests[i].length()) {
				++j;
				System.out.println("j="+j);
				word="";
				for(; j<requests[i].length() && String.valueOf(requests[i]).charAt(j)>='a' && String.valueOf(requests[i]).charAt(j)<='z'; ++j) {
					System.out.println("String.valueOf(requests["+i+"]).toLowerCase().charAt("+j+")="+String.valueOf(requests[i]).toLowerCase().charAt(j));
					word+=requests[i].charAt(j);
				}
				System.out.println("word="+word);
				if(word.length()>0) 
					sets.get(i).add(word);
				System.out.println(sets.get(i));
			}
		}
		
		//checking if all the requests are properly splitted
		for(i=0; i<n; ++i)
			System.out.println(i+" "+sets.get(i));
		
		//creating initial array of clusters of ids. Then I'll concatenate them if corresponding requests will be too similar
		ArrayList<ArrayList<Integer>> clusters = new ArrayList<ArrayList<Integer>>();
		for(i=0; i<n; ++i) {
			ArrayList<Integer> singleton = new ArrayList<Integer>();
			singleton.add(ids[i]);
			clusters.add(singleton);
		}
		
		//porównywanie ka¿dej pary requestów o indeksach i,j
		for(i=0; i<n-1; ++i)
			for(j=i+1; j<n; ++j) {
				System.out.println("jaccard("+i+","+j+")="+jaccard(sets.get(i), sets.get(j)));	//just checking
				System.out.println(jaccard(sets.get(i), sets.get(j))>=threshold);	//just checking
				if(jaccard(sets.get(i), sets.get(j))>=threshold)
					if(clusters.get(i).size()>clusters.get(j).size()) {
						//???
						//przenieœ jeden cluster do drugiego tak, ¿eby rozmiary clusterów sz³y niemalej¹co lub nierosn¹co. Sprawdz tresc zadania
					}
					else ;//to samo tylko odwrotnie i i j
			}
		
		//teraz wybierz wszystkie clusters rozmiaru wiêkszego ni¿ 1 i posortuj ids w ka¿dym z nich
		
		//przenieœ otrzyman¹ tablicê ArrayList<ArrayList<Integer>> clusters do tablicy int[][] result
		
//		return result; // a co dalej, to wykreœl
		
		
//		int[] clusterOf = new int[n];
//		for(i=0; i<n; ++i)
//			clusterOf[i]=i;
//		//clustering the requests by Jaccard index of each pair of requests:
//		for(i=0; i<n-1; ++i)
//			for(j=i+1; j<n; ++j) {
//				System.out.println("jaccard("+i+","+j+")="+jaccard(sets.get(i), sets.get(j)));
//				System.out.println(jaccard(sets.get(i), sets.get(j))>=threshold);
//				if(jaccard(sets.get(i), sets.get(j))>=threshold)
//					clusterOf[j]=clusterOf[i];
//			}
//		for(i=0; i<n; ++i)
//			System.out.println("clusterOf["+i+"]="+clusterOf[i]);
//		
//		int numberOfClusters=0;
//		for(i=0; i<n; ++i)
//			if(clusterOf[i]>numberOfClusters)
//				numberOfClusters=clusterOf[i];
//		++numberOfClusters;
//		
		
		ArrayList<ArrayList<Integer>> authors = new ArrayList<ArrayList<Integer>>();		
		int[][] result = new int[1/*numberOfClusters*/][1];
		
//		int[] clusterSize = new int[numberOfClusters];
		
		
//		for(i=0; i<numberOfClusters; ++i) {
//			for(j=0; j<n; ++j)
//				if(clusterOf[j]==i)
//					clusterSize[i]++;
//			if(clusterSize[i]>1) {
//			result[i] = new int[clusterSize[i]];
//			k=0;
//			for(j=0; j<n; ++j)
//				if(clusterOf[j]==i) {
//					result[i][k]=ids[j];
//					++k;
//				}
//			}
//		}
		
	    return result;
	}
	
	double jaccard(HashSet<String> setA, HashSet<String> setB) {
		int union = setA.size();
		int intersection = 0;
		for(String word: setB) {
			if(setA.contains(word))
				++intersection;
			else ++union;
		}
//		System.out.println("intersection/union="+intersection+"/"+union+"="+(double)intersection/union);
		return (double)intersection/union;
	}
	
	public static void main(String[] args) {
		int i,j;
		String[] requests = {"I need a new window.", 
		                     "I really, really want to replace my window!", 
		                     "Replace my window.", 
		                     "I want a new window.", 
		                     "I want a new carpet, I want a new carpet, I want a new carpet.", 
		                     "Replace my carpet"};
		int[] ids = {374, 2845, 83, 1848, 1837, 1500};
		double threshold = 0.5;
		SpamClusters test = new SpamClusters();
		int[][] spam = test.spamClusterization(requests, ids, threshold);
		for(i=0; i<spam.length; ++i) {
			for(j=0; j<spam[i].length; ++j)
				System.out.print(spam[i][j]+" ");
			System.out.println(" ");
		}
	}

}
