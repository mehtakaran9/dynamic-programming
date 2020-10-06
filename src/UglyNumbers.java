public class UglyNumbers {
    public static void main(String[] args) {
        System.out.println(new UglyNumbers().printNthUglyNumber(150));
    }

    private int printNthUglyNumber(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        int i = 2;
        int start = 2;
        while(start <= n) {
            int temp = i;
            if (temp % 2 == 0) {
                while(temp % 2 == 0) {
                    temp = temp / 2;
                }
            }
            if (temp % 3 == 0) {
                while(temp % 3 == 0) {
                    temp = temp / 3;
                }
            }
            if (temp % 5 == 0) {
                while(temp % 5 == 0) {
                    temp = temp / 5;
                }
            }
            if(temp == 1) {
                arr[start] = i;
                start++;
            }
            i++;
        }
        return arr[n];
    }
    
}
