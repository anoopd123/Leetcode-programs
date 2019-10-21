package Leetcode_Problems;

class Code1 {
    public static int[] twoSum(int[] nums, int target) {
        
        int ind1=0;
        int ind2=0,flag=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=1;j<nums.length;j++)
            {
               int  sum=nums[i]+nums[j];
                if(sum==target)
                {
                    flag=1;
                    ind1=i;
                    ind2=j;
                    break;
                }
            }
            if(flag==1)  break;

        }
        int ans[]={ind1,ind2};
        return ans;
    }
    public static void main(String args[])
    {
    	int que[]= {2, 6, 11, 7};
    	int[] ans=twoSum(que,9);
    	for(int z=0;z<ans.length;z++) {
    	System.out.println(ans[z]);
    	}
    }
}