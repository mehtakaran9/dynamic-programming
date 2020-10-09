package dynamicprogramming;

public class MaximumPathSumInATriangle {
  public static void main(String[] args) {
    int tri[][] = { {1, 0, 0},
        {4, 8, 0},
        {1, 5, 3} };
    System.out.println(new MaximumPathSumInATriangle().calculateMaxPathSum(tri, 2, 2));
  }

  private int calculateMaxPathSum(int[][] tri, int m, int n) {
    int maxSum = tri[0][0];
    int j = 0;
    for (int i = 1; i <= m; i++) {
      if(tri[i][j] < tri[i][j+1]) {
        maxSum += tri[i][j+1];
        j=j+1;
      } else {
        maxSum += tri[i][j];
      }
    }
    return maxSum;
  }
}
