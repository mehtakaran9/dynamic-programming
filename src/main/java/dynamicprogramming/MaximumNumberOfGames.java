package dynamicprogramming;

public class MaximumNumberOfGames {
  public static void main(String[] args) {
    System.out.println(new MaximumNumberOfGames().calculateMaxGames(6));
  }

  private int calculateMaxGames(int n) {
    float[] arr = new float[n + 1];
    arr[0] = 0;
    arr[1] = 0;
    arr[2] = 1;
    for (float i = 3; i <= n; i++) {
      arr[(int) i] = 1 + arr[Math.round(i / 2)];
    }
    return (int) arr[n];
  }
}
