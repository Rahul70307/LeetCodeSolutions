package Arrays;

import java.util.Arrays;

public class SumOfSubsequenceWidths {
    public int sumSubseqWidths(int[] nums) {
        Arrays.sort(nums);
        long ans=0;
        long mod = 1000000007;
        int n = nums.length;
        long [] pow = new long[nums.length];
        pow[0]= 1;
        for(int i= 1;i<nums.length;i++){
            pow[i]= (pow[i-1]*2)%mod;
        }
        for( int i = 0; i<nums.length; i++){
            ans = (ans+nums[i]*pow[i]-nums[i]*pow[n-i-1])%mod;
        }
        return (int)ans;

    }
}
