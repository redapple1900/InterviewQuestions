package com.yuanwei.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CircularBuffer<T> {
	
	private int start;
	private int end;
	private int size;
	private final int capacity;
	private Object[] list;
	
	public CircularBuffer(int capacity){
		this.start=0;
		this.end=0;
		this.size=0;
		this.capacity=capacity;
		this.list = new Object[capacity];
	}
	
	public void put(T value){
		list[end]=value;
		if (this.size==capacity){
			start++;
			System.out.println("CircularBuffer:"+size+" "+capacity+" "+start);
			
			start%=capacity;
			
		}else{
			size++;
		}
		end++;
		end%=capacity;
	}
	
	public T peek(){
		if (size==0) throw new NoSuchElementException();
		
		return (T) list[start];
	}
	
	public T peekFirst(){
		if (size==0) throw new NoSuchElementException();
		
		return (T) list[start];
	}
	
	public  T peekLast(){
		if (size==0) throw new NoSuchElementException();
		
		if (end==0) return (T) list[capacity-1];
		
		return (T) list[end-1];
	}
	
	public T poll(){
		if (size==0) throw new NoSuchElementException();
		
		T t = (T)list[start];
		start++;
		start%=capacity;
		size--;
		
		return t;	
	}
	public T pollLast(){
		if (size==0) throw new NoSuchElementException();
		
		T t = (T)peekLast();
		
		if (end==0) end=capacity-1;
		end--;
		
		size--;
		
		return t;
	}
	public boolean isEmpty(){
		return this.size==0;
	}
	public boolean isFull(){
		return this.size==this.capacity;
	}
	
	public int size(){
		return this.size;
	}
	
	
	

}
