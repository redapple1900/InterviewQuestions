package com.yuanwei.interview;

import java.util.Random;

public class ShuffleDeck {
	
	
	public static void shuffle(int[] array){
		if (array==null||array.length==0) return;
		
		Random r = new Random(System.currentTimeMillis());
		
		int len=array.length,j,temp;
		
		for (int i=len-1;i>0;i--){
			j=r.nextInt(i);
			
			temp=array[j];
			array[j]=array[i];
			array[i]=temp;
			
		}

	}

}
