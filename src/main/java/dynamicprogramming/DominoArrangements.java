package dynamicprogramming;

/**
 * @author karan.mehta
 */
public class DominoArrangements {
  public static void main(String[] args) {
    System.out.println(new DominoArrangements().calculateUniqueWays(5));
  }

  private int calculateUniqueWays(int n) {
    int[] arr = new int[n + 1];
    arr[0] = 1;
    arr[1] = 1;
    for (int i = 2; i <= n; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }
    return arr[n];
  }
}