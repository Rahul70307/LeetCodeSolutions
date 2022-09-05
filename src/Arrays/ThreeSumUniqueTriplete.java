package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumUniqueTriplete {
    public static List<List<Integer>> twosum(int[] arr, int si, int ei, int target) {
        int left = si;
        int right = ei;
        Arrays.sort(arr);

        List<List<Integer>> res = new ArrayList<>();

        while (left < right) {
            if (left != 0 && arr[left] == arr[left - 1]) {
                left++;
                continue;
            }


            int sum = arr[left] + arr[right];
            if (sum == target) {
                List<Integer> subres = new ArrayList<>();
                subres.add(arr[left]);
                subres.add(arr[right]);
                res.add(subres);

            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return res;

    }
    public static List<List<Integer>> threesum(int[] arr,  int target){
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;
        if(n<3){
            return  res;
        }

        for( int i=0; i< n-3; i++){
            int val= arr[i];
            int newTarget= target- val;
            List<List<Integer>> subres = twosum(arr,i+1, n-1, newTarget);

            for( List<Integer> list : subres){
                list.add(val);
                res.add(list);
            }
        }
        return res;
    }


}
