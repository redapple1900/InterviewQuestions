package com.yuanwei.interview;

public class OneEditDistance {
	
	public boolean isOneEditDistance(String s, String l) {
		if (s==null||l==null) throw new NullPointerException();
		int len_s = s.length(), len_l = l.length();
		if (len_s > len_l) return isOneEditDistance(l, s);
		int shift = len_l-len_s,count=1,i=0,j=0;
		if (shift > 1) return false;
		
		while (i<len_s){
			if (s.charAt(i)==l.charAt(j)){
				i++;
				j++;
			}else if (count==1){
				i+=(1-shift);
				j++;
				count--;
			}else{
				count--;
				break;
			}
		}
		
		return j+count==len_l;
		}

}
