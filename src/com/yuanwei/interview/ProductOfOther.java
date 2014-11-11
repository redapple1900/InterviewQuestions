package com.yuanwei.interview;

public class ProductOfOther {
	
	public static int[] getProductOfOther(int[] A){
		
		if (A==null) throw new NullPointerException();
		
		int[] left = new int[A.length];
		
		left[0]=1;
		for (int i=1,len=A.length;i<len;i++)
		{
			left[i]=left[i-1]*A[i-1];
		}
		
		int right=1;
		for (int i=A.length-1;i>=0;i--){
			left[i]*=right;
			right*=A[i];
		}
		
		
		return left;
	}

}
