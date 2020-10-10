package dynamicprogramming;

public class MaxSumOfPathInRightTriangle {
  public static void main(String[] args) {
    int tri[][] = {{1}, {1, 2}, {4, 1, 2}, {2, 3, 1, 1}};
    System.out.println(new MaxSumOfPathInRightTriangle().calculateMaxSum(tri, 4));
  }

  private int calculateMaxSum(int[][] tri, int n) {
    int maxSum = 0;
    int counter = 0;
    int iterator = n - 1;
    for (int i = n - 1; i > 0; i--) {
      if (maxSum < tri[n - 1][i]) {
        maxSum = tri[n - 1][i];
        counter = i;
      }
    }

    while (iterator > 0) {
      iterator--;
      if (counter - 1 >= 0) {
        if (tri[iterator][counter - 1] > tri[iterator][counter]) {
          counter--;
        }
      }
      maxSum += tri[iterator][counter];
    }
    return maxSum;


  }
}
