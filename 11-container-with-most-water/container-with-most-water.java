class Solution {
    public int maxArea(int[] height) {
        int n = height.length, left = 0, right = n-1;
        int max =0, dis = n -1;
        while(left < right){
            if(height[left] <= height[right]){
                int xx = height[left] * dis;
                max = Math.max(xx,max);
                left++;
            }
            else{
                if(height[left] > height[right]){
                int xx = height[right] * dis;
                max = Math.max(xx,max);
                right--;
            }
            }
            dis--;
        }
        return max;
    }
    
}