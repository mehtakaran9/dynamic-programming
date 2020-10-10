package dynamicprogramming;

public class MaximumLengthChainOfPairs {
  static class Pair {
    private final int start;
    private final int end;

    public Pair(int start, int end) {
      this.start = start;
      this.end = end;
    }

    public int getStart() {
      return start;
    }

    public int getEnd() {
      return end;
    }
  }

  public static void main(String[] args) {
    Pair[] pairs =
        {new Pair(5, 24), new Pair(15, 28), new Pair(39, 60), new Pair(27, 40), new Pair(50, 90)};
    System.out.println(new MaximumLengthChainOfPairs().longestChainPairs(pairs));
  }

  private int longestChainPairs(Pair[] pairs) {
    int n = pairs.length;
    int[][] dp = new int[n][n];
    for (int i = 0; i < n; i++) {
      dp[i][0] = 1;
    }

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (pairs[i].getEnd() < pairs[j].getStart()) {
          dp[i][j] = dp[i][j - 1] + 1;
        }
      }
    }

    int max = 0;
    for (int i = 0; i < n; i++) {
      max = Math.max(dp[i][n - 1], max);
    }
    return max;
  }
}
