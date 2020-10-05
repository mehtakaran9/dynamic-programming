public class BurglarProblem {
    public static void main(String[] args) {
        int[] houses = {3, 8, 10, 4, 1, 7, 2};
        System.out.println(new BurglarProblem().burglarNightOut(houses));
    }

    private int burglarNightOut(int[] houses) {
        int n = houses.length;
        int[] looted = new int[n+1];
        looted[0] = houses[0];
        looted[1] = houses[1];
        looted[2] = Math.max(houses[0] + houses[2], houses[1]);
        for (int i = 3; i < n; i++) {
            looted[i] = Math.max(houses[i-1] + looted[i-3], houses[i] + looted[i-2]);
            //calculate the max money a burglar can get out of the houses array with no consecutive robs
        }
        return looted[n-1];
    }

}
