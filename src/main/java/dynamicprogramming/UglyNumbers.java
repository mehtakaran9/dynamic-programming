package dynamicprogramming;

public class UglyNumbers {
  public static void main(String[] args) {
    System.out.println(new UglyNumbers().printNthUglyNumber(150));
  }

  private int printNthUglyNumber(int n) {
    int[] arr = new int[n + 1];
    arr[0] = 1;
    arr[1] = 1;
    int i2 = 1, i3 = 1, i5 = 1;
    int nm2 = i2 * 2;
    int nm3 = i3 * 3;
    int nm5 = i5 * 5;
    for (int i = 2; i <= n; i++) {
      arr[i] = Math.min(Math.min(nm2, nm3), nm5);
      if (arr[i] == nm2) {
        i2++;
        nm2 = arr[i2] * 2;
      }
      if (arr[i] == nm3) {
        i3++;
        nm3 = arr[i3] * 3;
      }
      if (arr[i] == nm5) {
        i5++;
        nm5 = arr[i5] * 5;
      }
    }
    return arr[n];
  }

}
