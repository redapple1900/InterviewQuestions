package com.yuanwei.interview;

public class FindLetter {
	
	
	public static char findLetter(char[] array,char c){
		if (array==null||array.length==0) return 'a';
		
		int low=0,high=array.length-1,mid=0;
		
		if (array[0]>c||array[high]<=c) return array[0];
		
		while(low<=high){
			mid=low+(high-low)/2;
			
			if (array[mid]<=c&&array[mid+1]>c)
				return array[mid+1];
			else if (array[mid]>c)
				high=mid;
			else if (array[mid+1]<=c)
				low=mid+1;
			else;
		}
		return array[low];
		
		
	}

}
