// 80. Remove Duplicates from Sorted Array II

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/


package Arrays;

public class RemoveDuplicateFromSortedArrayii {

    public int removeDuplicates(int[] nums) {
        int oindex = 0;
        int i =0;

        while(i< nums.length){
            int fre= 1;
            int val= nums[i];
            while(i< nums.length-1 && nums[i]==nums[i+1]){
                fre++;
                i++;
            }
            fre = Math.min(fre,2);

            while(fre-->0){
                nums[oindex]=val;
                oindex++;
            }
            i++;

        }
        return oindex;
    }
}
