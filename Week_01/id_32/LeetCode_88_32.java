package leecode;

import java.util.HashMap;

/**
 * 合并两个有序数组
 */
public class LeetCode_88_32 {

    /**
     * 双指针( 1 ms )
     */
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] rs = new int[m+n];
        int i1 = 0,i2 = 0;
        for(int i = 0; i < m+n; i++){
            if(i1 < m  && i2 < n ){
                if(nums1[i1] <= nums2[i2])
                    rs[i] = nums1[i1++];
                else
                    rs[i] = nums2[i2++];
            }else{
                if(i1 == m)
                    rs[i] = nums2[i2++];
                else if(i2 == n)
                    rs[i] = nums1[i1++];
            }
        }
        System.arraycopy(rs, 0, nums1, 0, rs.length);
    }

    /**
     * 暴力解( 4 ms )
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m; i < nums1.length; i++){
            nums1[i] = nums2[i-m];
        }
        for(int i = 0; i < nums1.length-1; i++){
            for (int j = 0; j < nums1.length-i-1; j++){
                if(nums1[j] > nums1[j+1]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
        }
    }

}
