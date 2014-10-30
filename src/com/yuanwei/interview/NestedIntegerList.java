package com.yuanwei.interview;

import java.util.LinkedList;
import java.util.List;

public class NestedIntegerList implements NestedInteger{
	private boolean isInteger;
	private int value;
	private List<NestedInteger> nestedIntegerList;
	public NestedIntegerList(int num){
		isInteger=true;
		this.value=num;
	}
	public NestedIntegerList(List<NestedInteger> list){
		isInteger=false;
		setNestedIntegerList(new LinkedList<NestedInteger>(list));
	}

	@Override
	public boolean isInteger() {
		// TODO Auto-generated method stub
		return isInteger;
	}

	@Override
	public Integer getInteger() {
		// TODO Auto-generated method stub
		if (this.isInteger)
		return value;
		
		return null;
	}

	@Override
	public List<NestedInteger> getList() {
		// TODO Auto-generated method stub
		if (!this.isInteger)
		return nestedIntegerList;
		
		return null;
	}
	
	public void add(NestedInteger nestedInteger){
		if (!this.isInteger)
		this.nestedIntegerList.add(nestedInteger);
	}
	public void add(int i){
		if (!this.isInteger)
		this.nestedIntegerList.add(new NestedIntegerList(i));
	}

	public List<NestedInteger> getNestedIntegerList() {
		return nestedIntegerList;
	}

	public void setNestedIntegerList(List<NestedInteger> nestedIntegerList) {
		this.nestedIntegerList = nestedIntegerList;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
