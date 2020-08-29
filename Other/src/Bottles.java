/**
 * @author zhCoding
 * @Description:
 * @create 23:18
 */
public class Bottles {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 10, 81, 0,59};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(getBottles(arr[i]));
        }
    }

    public static int getBottles(int n) {
        if (n < 2) return 0;
        int res = 0;
        while (n / 3 != 0) {
            res += n / 3;
            n = n / 3 + n % 3;
        }
        if (n == 2) res++;
        return res;
    }
}
