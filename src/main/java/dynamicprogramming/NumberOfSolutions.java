package dynamicprogramming;

public class NumberOfSolutions {
  public static void main(String[] args) {
    int[] coeff = {2, 2, 5};
    int rhs = 4;
    System.out.println(new NumberOfSolutions().findNumberOfSolutions(coeff, rhs));
  }

  private int findNumberOfSolutions(int[] coeff, int rhs) {
    int[] dp = new int[rhs + 1];
    dp[0] = 1;
    for (int i = 0; i < coeff.length; i++) {
      for (int j = coeff[i]; j <= rhs; j++) {
        dp[j] += dp[j - coeff[i]];
      }
    }
    return dp[rhs];
  }

}
