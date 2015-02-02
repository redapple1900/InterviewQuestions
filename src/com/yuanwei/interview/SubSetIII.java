package com.yuanwei.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SubSetIII {
	
	public List<List<Integer>> getSubset(int[] num, int k){
		if (num==null||num.length<k) return Collections.emptyList();
		List<List<Integer>> result = new LinkedList<>();
		List<Integer> work = new ArrayList<>(k);
		Arrays.sort(num);
		getSubsetHelper(num,k,0,work,result);
		
		return result;
		
		
	}
	private void getSubsetHelper(int[] num,int k, int start,List<Integer> work,List<List<Integer>> result){
		if (k==0){
			result.add(new ArrayList<Integer>(work));
			return;
		}
		for (int i=start;i<num.length+1-k;i++){
			if (i>start&&num[i]==num[i-1]) continue;
			
			work.add(num[i]);
			getSubsetHelper(num,k-1,i+1,work,result);
			work.remove(work.size()-1);
		}
		
	}

}
