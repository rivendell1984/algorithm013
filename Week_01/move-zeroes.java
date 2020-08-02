import java.util.*;

class Solution {

    public void moveZeroes(int[] nums) {
        int cusor = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0) {
                int temp = nums[cusor];
                nums[cusor] = nums[i];
                nums[i] = temp;
                cusor++;
            }
        }
    }

}