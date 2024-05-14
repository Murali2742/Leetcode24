package day3;

//sort colors

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int arr[]=new int[10];
        for(int i=0;i<n;i++)
        {
            arr[nums[i]]+=1;
        }
        int s=0;
        for(int i=0;i<3;i++)
        {

            for(int j=0;j<arr[i];j++)
            {
                nums[s]=i;
                s++;

            }
            

        }

    }
}