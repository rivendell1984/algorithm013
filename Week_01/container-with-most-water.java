class Solution {

    public int maxArea(int[] height) {

        int maxArea = 0;

        for(int start = 0; start < height.length-1; start++) {

            for(int index =start; index< height.length; index++) {
                int currentArea = (index - start)*Math.min(height[start], height[index]);

                if(currentArea > maxArea){
                    maxArea = currentArea;
                }
            }

        }
        return maxArea;
    }
}