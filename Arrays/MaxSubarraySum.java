public class MaxSubarraySum {
    public static int maxSubarraySumBrute(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int curSum = 0;
                for (int k = i; k <= j; k++) {
                    curSum += arr[k];
                }
                if (maxSum < curSum) {
                    maxSum = curSum;
                }
            }
        }
        return maxSum;
    }

    public static int maxSubarraySumPrefix(int arr[]) {
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int curSum = (i == 0) ? pref[j] : pref[j] - pref[i - 1];
                if (curSum > maxSum) {
                    maxSum = curSum;
                }
            }
        }

        return maxSum;
    }

    public static int kadaneSubarraySum(int arr[]) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            if (curSum > maxSum) {
                maxSum = curSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        int maxmSum = kadaneSubarraySum(arr);
        System.out.println(maxmSum);
    }
}
