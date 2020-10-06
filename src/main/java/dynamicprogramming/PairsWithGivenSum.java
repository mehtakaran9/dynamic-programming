package dynamicprogramming;

public class PairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1};
        int sum = 6;
        System.out.println(new PairsWithGivenSum().findNumberOfPairsWithGivenSum(arr, sum));

    }
    
    private int findNumberOfPairsWithGivenSum(int[] arr, int sum) {
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = sum - arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(a == arr[j]) {
                    totalPairs++;
                }
            }
        }
        return totalPairs;
	}
    
}
