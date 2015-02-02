package com.yuanwei.interview;

public class LongestCommonString {
	
	public String getLCS(String s1,String s2){
		if (s1==null||s2==null) return null;
		int l1 = s1.length(),l2=s2.length();
		
		int[][] matrix = new int[l1+1][l2+1];
		
		int max=0,start=-1;
		matrix[0][0]=0;
		
		for (int i=1;i<=l1;i++) matrix[i][0]=0;
		for (int i=1;i<=l2;i++) matrix[0][i]=0;
		
		for (int i=1;i<=l1;i++){
			for (int j=1;j<=l2;j++){
				if (s1.charAt(i-1)==s2.charAt(j-1)){
					matrix[i][j]=matrix[i-1][j-1]+1;
					max=Math.max(matrix[i][j],max);
					start=i-max-1;
				}
				else
					matrix[i][j]=0;
			}
		}
		return s1.substring(start,start+max);
	}

}
