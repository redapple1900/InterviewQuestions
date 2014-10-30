package com.yuanwei.interview;

public class FindMininumInRotatedArray {
    public int findMin(int[] num) {
        
        if (num==null||num.length==0) return Integer.MIN_VALUE;
        
        if (num.length==1) return num[0];
        int low=0,high=num.length-1,mid=0;
        
        while(low<high-1){
            mid = low +(high-low)/2;
            
            if (num[mid]==num[high]) {
                high--;
                continue;
            }
            if (num[mid]==num[low]){
                low++;
                continue;
            }
            if (num[mid]<num[high]&&num[mid]>num[low])
                return num[low];
            else if (num[mid]<num[high]&&num[mid]<num[low]){
                if (num[mid]<num[mid-1]) return num[mid];
                else high=mid-1;
            }else if (num[mid]>num[high]&&num[mid]>num[low]){
                low= mid +1;
            }
        }
        return Math.min(num[low],num[high]);
        
    }

}
