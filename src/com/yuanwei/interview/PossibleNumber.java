package com.yuanwei.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PossibleNumber {
	
	public static List<List<Integer>> getPossibleNumber(int n1,int n2,int n3,int n4){
		
		if (n1<0||n2<0||n3<0||n4<0) throw new IllegalArgumentException();
		
		if (n1+n2+n3+n4==4) return Collections.emptyList();
		
		List<Integer> list = new ArrayList<>(6);
		//0:total 1-4 n1-n4 5:last digit
		list.add(n1+n2+n3+n4);
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		list.add(0);
		
		List<List<Integer>> results = new LinkedList<>();
		getPossibleNumberHelper(list,results);
		return results;
	}
	
	private static void getPossibleNumberHelper(List<Integer> list,List<List<Integer>> results){
		if (list.get(0)==0){
			results.add(new ArrayList<Integer>(list));
			return;
		}
		for (int i=1;i<=4;i++){
			if (list.get(i)==0) continue;
			if (list.get(5)==i) continue;
			
			list.set(0, list.get(0)-1);
			list.set(i, list.get(i)-1);
			getPossibleNumberHelper(list,results);
			list.set(i, list.get(i)+1);
			list.set(0, list.get(0)+1);
		}
		
	}

}
