package dynamicprogramming;

public class SequencesWithProductLessThanK {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    int n = 10;
    System.out.println(new SequencesWithProductLessThanK().numberOfSequences(arr, n));
  }

  private int numberOfSequences(int[] arr, int n) {
    int[][] dp = new int[arr.length][n + 1];

    for (int j = 1; j <= n; j++) {
      dp[0][j] = j > arr[0] ? 1 : 0;
    }

    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j <= n; j++) {
        int conditionalCount = j > arr[i] ? 1 : 0;
        dp[i][j] = dp[i - 1][j] + dp[i - 1][j / arr[i - 1]] + conditionalCount;
      }
    }
    return dp[dp.length - 1][n];
  }
}
