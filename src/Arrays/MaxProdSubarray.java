//152. Maximum Product Subarray

//https://leetcode.com/problems/maximum-product-subarray/

package Arrays;

public class MaxProdSubarray {



    public int maxProduct(int[] nums) {

        int ans = Integer.MIN_VALUE;
        int prod= 1;
        for( int i =0 ; i< nums.length; i++){
            prod = prod* nums[i];
            ans = Math.max(ans , prod);
            if(prod==0){
                prod =1;
            }
        }
        prod=1;
        for( int i=nums.length-1;i>=0;i--){
            prod = prod* nums[i];
            ans = Math.max(ans , prod);
            if(prod==0){
                prod =1;
            }
        }
        return ans;
    }
}
