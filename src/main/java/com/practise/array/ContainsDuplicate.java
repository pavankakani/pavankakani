package com.practise.array;

import java.util.HashSet;
import java.util.Set;

/*
 * Given an integer array nums, return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 * 
 * Example 1:

		Input: nums = [1,2,3,1]
		Output: true
		Example 2:
		
		Input: nums = [1,2,3,4]
		Output: false
		Example 3:
		
		Input: nums = [1,1,1,3,3,4,3,2,4,2]
		Output: true
 * 
 */

public class ContainsDuplicate {
	
	public boolean containsDuplicate(int[] nums) {
	     Set<Integer> s = new HashSet();
	        for(int i=0;i<nums.length;i++){
	         if(!s.add(nums[i])){
	             return true;
	         }
	            
	        }
	        return false;
	    }
	
	
	public int maxSubArray(int[] nums) {
        int max = nums[0];
      for(int i=0;i<nums.length;i++){
         int num =nums[i];
          for(int j=i+1;j<nums.length;j++){
        	  System.out.println("i,j"+nums[j]);
               num =num+nums[j];
               
               if(max<num){
                   max = num;
               } 
               
               if(nums[j]>max) {
            	   max = nums[j];
               }

          }
          System.out.println(max);
          
      }   
        return max;
    }
	
	public static void main(String[] args) {
		ContainsDuplicate containsDuplicate = new  ContainsDuplicate();
		containsDuplicate.maxSubArray(new int[] {-2,1});
	}
}
