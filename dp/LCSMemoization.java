package dp;

public class LCSMemoization {

	public static void main(String[] args) {

		String s1 = "ABA";
		String s2="AAB";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		String lcs ;
		if(s1.length()>s2.length()) {
			lcs = lcs(c1,c2, 0,0);
		}else
			lcs= lcs (c2,c1,0,0);
		System.out.println((lcs));
		System.out.println(lcs.length());


	}

	private static String lcs(char[] c1, char[] c2, int m, int n) {

		String[][] memo = new String[c1.length][c2.length];
		if(m==c1.length-1 || n==c2.length )
			return "";
		if(memo[m][n]==null)
		{
			if(c1[m] == c2[n])
			{	
			memo[m][n] = c1[m]+lcs(c1,c2,m+1,n+1);
		}else {
					String lcs1 = lcs(c1,c2,m+1,n);
					String lcs2 = lcs(c1,c2,m,n+1);
					memo[m][n]= lcs1.length()>=lcs2.length()?lcs1:lcs2;
			}
		}
		return memo[m][n];
	}
}
