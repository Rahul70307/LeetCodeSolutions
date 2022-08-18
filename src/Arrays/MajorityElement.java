//169. Majority Element
//https://leetcode.com/problems/majority-element/submissions/

package Arrays;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        int val= nums[0];
        int count = 1;
        int i =1;

        while(i<=nums.length-1){
            if(nums[i]==val){
                count++;
            }else{
                count--;
                if(count<=0){
                    val=nums[i];
                    count =1;
                }
            }
            i++;
        }
        return val;

    }
}
