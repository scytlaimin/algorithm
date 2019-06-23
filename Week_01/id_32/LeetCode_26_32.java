package leecode;

import java.util.HashMap;

/**
 * 删除排序数组中的重复项
 */
public class LeetCode_26_32 {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j])
                nums[++i] = nums[j];
        }
        return i+1;
    }

}
