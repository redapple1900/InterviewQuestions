package com.yuanwei.interview;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainTest {
	
	private static int sum=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		NestedIntegerList ni0 = new NestedIntegerList(new LinkedList<NestedInteger>());	
		NestedIntegerList ni1 = new NestedIntegerList(new LinkedList<NestedInteger>());		
		NestedIntegerList ni2 = new NestedIntegerList(2);
		NestedIntegerList ni3 = new NestedIntegerList(new LinkedList<NestedInteger>());
		
		ni1.add(1);
		ni1.add(1);
		
		ni3.add(1);
		ni3.add(1);
		
		ni0.add(ni1);ni0.add(ni2);ni0.add(ni3);
		
		printNestedInteger(ni0);
		
		System.out.print("\n");
		for (NestedInteger ni:ni0.getList())
			depthSum(ni,1);
		
		System.out.print(sum);
		System.out.print("\n");
		System.out.print(depthSum2(ni0.getList()));
		System.out.print("\n");
		int[] array = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		ShuffleDeck.shuffle(array);
		for (Integer i:array)
		System.out.print(i+" ");
		
		char[] array1= {'c', 'f', 'j', 'p', 'v'};
		FindLetter.findLetter(array1, 'a')+" ");
		FindLetter.findLetter(array1, 'c')+" ");
		FindLetter.findLetter(array1, 'k')+" ");
		FindLetter.findLetter(array1, 'z')+" ");
		char[] array2={'a','c'};
		FindLetter.findLetter(array2, 'a')+" ");
		FindLetter.findLetter(array2, 'b')+" ");
		FindLetter.findLetter(array2, 'c')+" ");
		char[] array3={'d'};
		FindLetter.findLetter(array3, 'd')+" ");
		FindLetter.findLetter(array3, 'a')+" ");
		*/


		/*
		fa.getFactor(134837824);
		fa.getFactor(60);
		fa.getFactor(25);
		fa.getFactor(31);
		fa.getFactor(24);
		fa.getFactor(123);
		fa.getFactor(18432425);
		*/
		Factorization f = new Factorization();
		System.out.println(f.getFactorCombination(24));
		System.out.println(f.getFactorCombination(60));
		FindMininumInRotatedArray fira = new FindMininumInRotatedArray();
		int[] num ={1,3,4,5,6,7,4,2,1};
		int[] num1 ={8,2,2,2,2,2,2,3,4,4,5,6,7};
		int[] num2 = {6,7,8,3,3,3,3,3,3,4,5,6,7};
		int[] num3 = {2,2,2,2,2,2,2,2};
		int[] num4 = {3,1,2,5};
		
		System.out.println(fira.findMin(num3));
		System.out.println(fira.findMin(num2));
		System.out.println(fira.findMin(num1));
		//System.out.println(fira.findMin(num));
		
		FindPeak fp = new FindPeak();
		
		System.out.println(fp.getPeak(num));
		
		int[] array=ProductOfOther.getProductOfOther(num2);
		
		for (Integer k:array)
			System.out.print(k+" ");
		System.out.println();
		System.out.println(PossibleNumber.getPossibleNumber(2, 2, 1, 1));
		System.out.println(PossibleNumber.getPossibleNumber(1, 1, 1, 1));
		System.out.println(PossibleNumber.getPossibleNumber(1, 1, 1, 0));
		System.out.println(PossibleNumber.getPossibleNumber(1, 1, 0, 0));
		System.out.println(PossibleNumber.getPossibleNumber(1, 0, 0, 0));
		System.out.println(PossibleNumber.getNumberOfPossibleCombinations(2, 2, 2, 0));
		System.out.println(PossibleNumber.getNumberOfPossibleCombinations(2, 2, 1, 0));
		System.out.println(PossibleNumber.getNumberOfPossibleCombinations(2, 2, 0, 0));
		System.out.println(PossibleNumber.getNumberOfPossibleCombinations(2, 2, 2, 2));
		System.out.println(PossibleNumber.getNumberOfPossibleCombinations(2, 2, 2, 1));
		System.out.println(PossibleNumber.getNumberOfPossibleCombinations(2, 2, 1, 1));
		System.out.println(PossibleNumber.getNumberOfPossibleCombinations(2, 1, 1, 1));
		System.out.println(PossibleNumber.getNumberOfPossibleCombinations(2, 1, 1, 0));
		System.out.println(PossibleNumber.getNumberOfPossibleCombinations(2, 1, 0, 0));
		System.out.println(PossibleNumber.getNumberOfPossibleCombinations(2, 0, 0, 0));
		System.out.println(PossibleNumber.getNumberOfPossibleCombinations(1, 1, 1, 1));
		System.out.println(PossibleNumber.getNumberOfPossibleCombinations(1, 1, 1, 0));
		System.out.println(PossibleNumber.getNumberOfPossibleCombinations(1, 1, 0, 0));
		System.out.println(PossibleNumber.getNumberOfPossibleCombinations(1, 0, 0, 0));
		
		OneEditDistance oed = new OneEditDistance();
		System.out.println(oed.isOneEditDistance("aabbc", "aabe"));
		System.out.println(oed.isOneEditDistance("aab", "aa"));
		System.out.println(oed.isOneEditDistance("aab", "aaa"));
		
	}
	/*
	private static void printNestedInteger(NestedInteger nestedInteger){
		if (!nestedInteger.isInteger()){
			for (NestedInteger ni:nestedInteger.getList()){
				printNestedInteger(ni);
			}
		}else System.out.print(nestedInteger.getInteger());
	}
	
	private static void  depthSum(NestedInteger input,int layer){
		if (!input.isInteger()){
			for (NestedInteger ni:input.getList()){
				depthSum(ni,layer+1);
			}
		}else {
			sum+=input.getInteger()*layer;
		}
	}
	private static int depthSum2(List<NestedInteger> input){
		int curr=input.size();
		int next=0;
		int ladder=1;
		int sum=0;
		Queue<NestedInteger> queue = new ArrayDeque<NestedInteger>();
		
		queue.addAll(input);
		while (!queue.isEmpty()){
			NestedInteger ni= queue.poll();

			if (!ni.isInteger()){
				next+=ni.getList().size();
				queue.addAll(ni.getList());
			}else {
				sum+=ni.getInteger()*ladder;
			}
			if (--curr==0){
				curr=next;
				next=0;
				ladder++;
			}
		}
		return sum;
	}
	*/

}
