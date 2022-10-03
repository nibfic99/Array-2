
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums.length==0||nums==null)
        {
            return new ArrayList<>();
        }
        
        List<Integer>result=new ArrayList<>();
        
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]>0)
            {
                nums[idx]=nums[idx]*-1;
            }
        }
         for(int i=0;i<n;i++)
                               {
                                   if(nums[i]>0)
                                   {
                                       result.add(i+1);
                                   }
             else
             {
                 nums[i]=nums[i]*-1;
             }
                               }
        return result;
    }
}