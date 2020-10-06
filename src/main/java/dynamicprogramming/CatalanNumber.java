package dynamicprogramming;

public class CatalanNumber {
    //number sequence problem to calculate nth catalan number 
    public static void main(String[] args) {
        System.out.println(new CatalanNumber().printNthCatalanNumber(5));
    }

    private int printNthCatalanNumber(int n) {
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            for (int j = 0; j <= i-1; j++) {
                arr[i] += arr[j] * arr[i-j-1];
            }
        }
        return arr[n];
    }
    
}
