package leecode;

/**
 * 柱状图中最大的矩形
 */
public class LeetCode_84_32 {

    public int largestRectangleArea(int[] heights) {
        int max = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] == 0)
               continue;
            int num = 1;
            for(int j = i+1; j < heights.length; j++){
                if(heights[j] < heights[i])
                    break;
                num++;
            }
            for(int j = i-1; j >= 0; j--){
                if(heights[j] < heights[i])
                    break;
                num++;
            }
            if(num * heights[i] > max)
                max =  num * heights[i];
        }
        return max;
    }

}
