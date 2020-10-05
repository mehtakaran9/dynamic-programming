public class StairwayToHeaven {

    private int stairwayToHeaven(int n) {

        int[] ways = new int[n+1];
        if(n >= 2) {
            ways[0] = 1;
            ways[1] = 1;
            for (int i = 2; i < n+1; i++) {
                ways[i] = ways[i-2] + ways [i-1];
            }
            return ways[n];
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(new StairwayToHeaven().stairwayToHeaven(3));
    }
}
