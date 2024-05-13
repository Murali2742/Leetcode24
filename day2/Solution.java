package day2;

class Solution {
    public int removeDuplicates(int[] nums) {
    	
    	//. Remove Duplicates from Sorted Array
    	
    	
        int count=0;
        int arr[] = new int[10];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[count]=nums[i];
                count++;
            }
            else{
                continue;
            }
        }
        nums[count++]=nums[nums.length-1];
    
        return count;
        
    }
}
