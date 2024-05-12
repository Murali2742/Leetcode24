package leetcode;


public class Solution {
	
    public int maxSubArray(int[] nums) {

    	//kadanes algorithms
    	
         int msf=Integer.MIN_VALUE;
         int meh=0;

        for(int i=0;i<nums.length;i++)
        {

            meh=meh+nums[i];
            if(meh>msf)
            {
                msf=meh;
            }
            if(meh<0)
            {
                meh=0;
            }
            

        }

        
        
        return msf;





        
    }
}