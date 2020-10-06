package dynamicprogramming;

import java.util.Arrays;

public class MaxProduct {

  public static void main(String[] args) {
    MaxProduct ns = new MaxProduct();
    System.out.println(ns.noSplitting(9));
  }


  private int noSplitting(int N) {

    // Initializing maxProduct array and filling all with Integer.MIN_VALUE

    int[] maxProduct = new int[N + 1];
    Arrays.fill(maxProduct, Integer.MIN_VALUE);

    // Base cases
    maxProduct[1] = 0;
    maxProduct[2] = 1;

    // 'i' is for setting the number to be split
    for (int i = 3; i <= N; i++) {
      // 'j' fixes the first split to be made
      for (int j = 1; j <= (i - 1); j++) {
        maxProduct[i] = Math.max(j * maxProduct[i - j], Math.max(j * (i - j), maxProduct[i]));
      }
    }
    return maxProduct[N];
  }

}
