package chandriki2;

public class sorted_rotated_array {

	    public boolean check(int[] nums) {
	        int c=0,k=0;
	        int p=nums.length-1;
	        for(int i=1;i<nums.length;i++)
	        {
	            if(nums[k]<=nums[i])
	            {
	            k++;
	            }
	              else if(nums[k]>nums[i] && nums[0]<nums[p])
	            {
	               return false;
	            }
	            else if(nums[k]>nums[i])
	            {
	               k++;
	               c++;
	            }
	            
	        }
	        if(c>1)
	            {
	                return false;
	            }
	        return true;
	    
	}

}
