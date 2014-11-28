package com.yuanwei.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Factorization {
	
	public List<Integer> getFactor(int n){
		if (n<=0) return Collections.emptyList();

		
		List<Integer> list = new ArrayList<>();
		
		if (n==1){
			list.add(1);
			return list;
		}
		
		while (n%2==0){
			list.add(2);
			n/=2;
		}
		for (int i=3;i<=(int)Math.sqrt(n);i+=2){
			
			while (n%i==0){
				list.add(i);
				n/=i;
			}
		}
		if (n>1) list.add(n);
		
		return list;
	}
	public int getMaxFactor(int n){
		if (n<=0) return 0;
		
		if (n==1) return 1;
		
		int result=0;
		for (int i=(int)Math.sqrt(n);i>1;i--){
			if (n%i==0){
				result=i;
				break;
			}
		}
		return result;
	}
	
	public List<List<Integer>> getFactorCombination(int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getFactorCombinationHelper(n, n/2, result, new LinkedList<Integer>());
        return result;
    }
    private void getFactorCombinationHelper(int n, int start, List<List<Integer>> result, LinkedList<Integer> sub) {
        if(n==1) {
            result.add(new ArrayList<Integer>(sub));
            return;
        }
       
        for(int i = start; i >= 2; i--) {
            if(n % i != 0) continue;
            sub.add(i);
            getFactorCombinationHelper(n / i, Math.min(i, n/i/2), result, sub);
            sub.removeLast();
        }
    }

}
