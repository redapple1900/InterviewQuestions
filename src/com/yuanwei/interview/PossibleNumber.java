package com.yuanwei.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PossibleNumber {

	public static int getNumberOfPossibleCombinations(int n1,int n2,int n3,int n4){
		if (n1<0||n2<0||n3<0||n4<0) throw new IllegalArgumentException();
		
		if (n1+n2+n3+n4==0) return 0;
		
		//List<Integer> list = new ArrayList<>(6);
		//0:total 1-4 n1-n4 
		int[] array = new int[6];
		array[0]=n1+n2+n3+n4;
		array[1]=n1;array[2]=n2;array[3]=n3;array[4]=n4;
		array[5]=0;
		/*
		list.add(n1+n2+n3+n4);
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		list.add(0);
		*/
		int[] result = new int[1];
		getPossibleNumberHelper2(array,result);
		return result[0];
	}
	
	public static List<List<Integer>> getPossibleNumber(int n1,int n2,int n3,int n4){
		
		if (n1<0||n2<0||n3<0||n4<0) throw new IllegalArgumentException();
		
		if (n1+n2+n3+n4==0) return Collections.emptyList();
		
		List<Integer> list = new ArrayList<>(5);
		//0:total 1-4 n1-n4 
		
		list.add(n1+n2+n3+n4);
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		List<Integer> work = new LinkedList<>();
		List<List<Integer>> results = new LinkedList<>();
		getPossibleNumberHelper(work,list,results);
		return results;
	}
	
	

	private static void getPossibleNumberHelper(List<Integer> work,List<Integer> list,List<List<Integer>> results){
		if (list.get(0)==0){
			results.add(new ArrayList<Integer>(work));
			return;
		}
		for (int i=1;i<=4;i++){
			if (list.get(i)==0) continue;
			if (work.size()>0&&work.get(work.size()-1)==i) continue;
			
			list.set(0, list.get(0)-1);
			list.set(i, list.get(i)-1);
			work.add(i);
			getPossibleNumberHelper(work,list,results);
			list.set(i, list.get(i)+1);
			list.set(0, list.get(0)+1);
			work.remove(work.size()-1);
		}
		
	}
	
	private static void getPossibleNumberHelper2(int[] array,int[] result){
		if (array[0]==0){
			result[0]++;
			return;
		}
		int k=array[5];
		for (int i=1;i<=4;i++){
			if (array[i]==0) continue;
			if (k==i) continue;
			
			
			array[0]--;
			array[i]--;
			array[5]=i;
			getPossibleNumberHelper2(array,result);
			array[i]++;
			array[0]++;
			array[5]=k;
		}
		
	}

}
