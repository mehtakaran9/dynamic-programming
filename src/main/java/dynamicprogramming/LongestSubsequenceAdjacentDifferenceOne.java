package dynamicprogramming;

public class LongestSubsequenceAdjacentDifferenceOne {
  public static void main(String[] args) {
    int[] arr = {10, 9, 4, 5, 4, 8, 6};
    System.out
        .println(new LongestSubsequenceAdjacentDifferenceOne().printLongestSubsequenceLength(arr));
  }

  private int printLongestSubsequenceLength(int[] arr) {
    int n = arr.length;
    int[][] dp = new int[n][n];

    for (int i = 0; i < n; i++) {
      dp[i][0] = 1;
    }

    for (int i = 0; i < n; i++) {
      int last = arr[i];
      for (int j = i + 1; j < n; j++) {
        dp[i][j] = dp[i][j - 1];
        if (Math.abs(last - arr[j]) == 1) {
          dp[i][j] += 1;
          last = arr[j];
        }
      }
    }

    int max = 0;
    for (int i = 0; i < n; i++) {
      max = Math.max(dp[i][n-1], max);
    }
    return max;
  }
}
