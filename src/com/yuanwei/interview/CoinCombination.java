package com.yuanwei.interview;

public class CoinCombination {
	
	public int getCoinCombination(int n){
		//Coin value: 2, 3, 5 hardcoded
		if (n<=1) return 0;
		
		int[][] dp = new int[3][n+1];
		dp[0][0]=1;
		
		// Row/Column  0 1 2 3 4 5 6 7 8 9
		//          2  1 0 1 0 1 0 1 0 1 0
		//          3  0 0 0 1 0 1 1 1 1 2
		//          5  0 0 0 0 0 1 0 1 1 1 
		for (int i=2;i<=n;i++){
			if (i>=2) dp[0][i]=dp[0][i-2];
			if (i>=3) dp[1][i]=dp[0][i-3]+dp[1][i-3];
			if (i>=5) dp[2][i]=dp[0][i-5]+dp[1][i-5]+dp[2][i-5];
		}
		return dp[0][n]+dp[1][n]+dp[2][n];
	}

}
