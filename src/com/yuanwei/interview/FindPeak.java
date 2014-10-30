package com.yuanwei.interview;

public class FindPeak {
	
	public int getPeak(int[] array){
		if (array==null||array.length==0) throw new NullPointerException();
		if (array.length==1) return array[0];
		if (array.length==2) return Math.max(array[0], array[1]);
		
		int high=array.length-1,low=0,mid=0;
		
		while(low<=high){
			
			mid = low +(high-low)/2;
			
			if (array[mid]<array[mid+1])
				low=mid+1;
			else  if (array[mid]<array[mid-1])
				high=mid-1;
			else 
				return array[mid];
		}
		return array[low];
		
	}

}
