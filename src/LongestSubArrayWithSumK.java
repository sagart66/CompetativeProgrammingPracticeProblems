/* Very good example to solve subarray problems in O(n) */
import java.util.*;
import java.lang.*;


class LongestSubArrayWithSumK {
    public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int noOfCases = sc.nextInt();
        for (; noOfCases > 0; noOfCases--) {
            int sz = sc.nextInt();
            int sumReq = sc.nextInt();
            int[] arr = new int[sz];
            int sum = 0;
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            int maxLen = 0;
            for (int i=0; i<sz; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];

                if (sum == sumReq) {
                    maxLen = i+1;
                }

                if (!map.containsKey(sum)) {
                    map.put(sum, i);
                }

                if (map.containsKey(sum - sumReq) && maxLen < (i - map.get(sum - sumReq))) {
                    maxLen = (i - map.get(sum - sumReq));
                }
            }
            System.out.println(maxLen + "");
        }
    }
}