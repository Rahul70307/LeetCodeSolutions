//11. Container With Most Water
//https://leetcode.com/problems/container-with-most-water/
package Arrays;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int i=0;
        int j= height.length-1;
        int maxvol=Integer.MIN_VALUE;
        while(i<=j){
            int vol = (j-i)*Math.min(height[i],height[j]);
            if(vol>maxvol){
                maxvol=vol;
            }
            if(height[i]>=height[j]){
                j--;
            }
            else
                i++;
        }return maxvol;
    }
}
