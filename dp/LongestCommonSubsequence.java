package dp;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {

	public static void main(String[] args) {

		String s1 = "XASTMLS";
		String s2="ABSTRS";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		List<Character> lcs ;
		if(s1.length()>s2.length()) {
			lcs = lcs(c1,c2, 0,0);
		}else
			lcs= lcs (c2,c1,0,0);
		System.out.println((lcs));
	}

	private static List<Character> lcs(char[] c1, char[] c2, int m, int n) {
		List<Character> lcsList = new ArrayList<Character>();
		int lcs = 0;
		for(int i=m ; i< c1.length ; i++) {
			for(int j=n ; j< c2.length ; j++) {

				if(c1[i] == c2[j]) {
					lcsList.add(c1[i]);
					lcsList.addAll(lcs(c1, c2, i+1,j+1));
					return lcsList;

				}else {
					List<Character> lcs1 =  lcs(c1, c2, i+1,j);
					List<Character> lcs2 =  lcs(c1, c2, i,j+1);

					if(lcs1.size() >= lcs2.size())
						lcsList = lcs1;
					else
						lcsList = lcs2;
					return lcsList;
				}
			}
		}

		return lcsList;
	}

}
