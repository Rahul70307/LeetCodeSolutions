package Arrays;

import java.util.*;

public class TwoSumUniquePair {

    public static  List<List<Integer>> twosum(int [] arr, int target) {
        int left =0;
        int right =arr.length-1;
        Arrays.sort(arr);

        List<List<Integer>> res = new ArrayList<>();

        while(left<right){
            if(left!=0 && arr[left]==arr[left-1]){
                left++;
                continue;
            }


            int sum = arr[left]+ arr[right];
            if(sum==target){
                List<Integer> subres = new ArrayList<>();
                subres.add(arr[left]);
                subres.add(arr[right]);
                res.add(subres);

            }else if (sum<target){
                left++;
            }else{
                right--;
            }
        }
        return res;

    }
}
