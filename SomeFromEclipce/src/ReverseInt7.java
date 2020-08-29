/*
 * 7. 整数反转
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
示例 1:
输入: 123
输出: 321
 * 注意:

假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。

 */
public class ReverseInt7 {
	public static void main(String[] args) {
		int x = 681532;
		Solution7 solu = new Solution7();
		int rev = solu.reverse(x);
		System.out.println(rev);
	}
}
class Solution7 {
    public int reverse(int x) {
    //        int rev = 0;
    //     while (x != 0) {
    //         int pop = x % 10;
    //         x /= 10;
    //         if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
    //         if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
    //         rev = rev * 10 + pop;
    //     }
    //     return rev;
    // }
        if(x>-10&&x<10) return x;
        int ans = 0;
        while(x!=0){
            int pop = x%10;
            //if(ans*10/10!=ans){
            if(ans>Integer.MAX_VALUE/10||(ans==Integer.MAX_VALUE/10&&pop>=8))return 0;
            if(ans<Integer.MIN_VALUE/10||(ans==Integer.MIN_VALUE/10&&pop<=-9))return 0;
            ans = ans*10 + pop;
            x /= 10; 
        }
        return ans;
    }
}