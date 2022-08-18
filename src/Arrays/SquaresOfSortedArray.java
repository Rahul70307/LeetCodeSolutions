//977. Squares of a Sorted Array
//https://leetcode.com/problems/squares-of-a-sorted-array/
package Arrays;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {

        int i =0;
        int j = nums.length-1;
        int index = nums.length-1;
        int [] res = new int[nums.length];
        while( i<=j){

            if(nums[i]*nums[i] >nums[j]*nums[j]){
                res[index]=nums[i]*nums[i];
                i++;
            }
            else{
                res[index]=nums[j]*nums[j];
                j--;
            }
            index--;
        }
        return res;

    }

}
