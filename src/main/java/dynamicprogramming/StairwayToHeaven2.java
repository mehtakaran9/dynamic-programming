package dynamicprogramming;

public class StairwayToHeaven2 {

    public static void main(String[] args) {
        int[] fee = {1, 2, 5, 7, 9};
        System.out.println(new StairwayToHeaven2().calculateOptimalSolution(fee));
    }

    private int calculateOptimalSolution(int[] fee) {
        int n = fee.length;
        int[] minFee = new int[n + 1];
        minFee[0] = 0;
        minFee[1] = minFee[2] = fee[0];
        for (int i = 3; i <= n; i++) {
            minFee[i] = Math.min(Math.min(fee[i - 1] + minFee[i - 1], fee[i - 2] + minFee[i - 2]), fee[i - 3] + minFee[i - 3]);
        }
        return minFee[n];

    }
}
