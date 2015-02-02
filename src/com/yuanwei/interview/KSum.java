package com.yuanwei.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KSum {
	
	public List<List<Integer>> getKSum(int[] num,int k){
		if (num==null||num.length<k) return Collections.emptyList();
		
		Arrays.sort(num);
		List<Integer> work = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		
		getKSumHelper(num,0,k,0,work,result);
		
		return result;
	}
	private void getKSumHelper(int[] num, int start,int k,int sum,List<Integer> list,List<List<Integer>> result){
		
		if (k==2){
			int i=start,j=num.length-1,target=0;
			
			while (i<j){
				if (i>start&&num[i]==num[i-1]){i++;continue;}
				if (j<num.length-1&&num[j]==num[j+1]){j--;continue;}
				target = sum+num[i]+num[j];
				
				if (target>0)
					i++;
				else if (target<0)
					j--;
				else{
					List<Integer> temp = new ArrayList<>(list);
					temp.add(num[i++]);
					temp.add(num[j--]);
					result.add(temp);
				}
			}
			return;
		}
		
		for (int i=start;i<num.length+1-k;i++){
			if (i>start&&num[i]==num[i-1]) continue;
			list.add(num[i]);
			getKSumHelper(num,i+1,k-1,sum+num[i],list,result);
			list.remove(list.size()-1);
		}
		
	}

}
