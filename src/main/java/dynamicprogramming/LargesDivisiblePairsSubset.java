package dynamicprogramming;

import java.util.HashMap;

public class LargesDivisiblePairsSubset {
  public static void main(String[] args) {
    int[] arr = {10, 5, 3, 15, 20} ;
    System.out.println(new LargesDivisiblePairsSubset().findLargestDivisiblePairsSubset(arr));
  }

  private int findLargestDivisiblePairsSubset(int[] arr) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    int n = arr.length;
    int[][] dp = new int[n][n];
    for (int i = 0; i < n; i++) {
      dp[i][0] = ((arr[i] % arr[0] == 0) || (arr[0] % arr[i] == 0)) ? 1 : 0;
    }
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n; j++) {
        if ((arr[i] % arr[j] == 0) || (arr[j] % arr[i] == 0)) {
          dp[i][j] = dp[i][j - 1] + 1;
        } else {
          dp[i][j] = dp[i][j - 1];
        }
      }
      if (hashMap.containsKey(dp[i][n-1])) {
        hashMap.put(dp[i][n-1], hashMap.get(dp[i][n-1]) + 1);
      } else {
        hashMap.put(dp[i][n-1], 1);
      }
    }
    int max = 1;
    for (Integer key : hashMap.keySet()) {
      if (hashMap.get(key) > max) {
        max = key;
      }
    }
    return max;

  }
}
