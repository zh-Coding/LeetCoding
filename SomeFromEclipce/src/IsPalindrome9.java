public class IsPalindrome9 {
	public static void main(String[] args) {
		int x = 1001; 
		Solution9 sol = new Solution9();
		System.out.println(sol.isPalindrome(x));
	}
}
class Solution9 {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int y= x;
        int ans = 0;
        int temp = 0;
        while( x!=0 ){
            temp = x % 10;
            x /= 10;
            ans = ans*10+temp;
        }
        return (ans == y) ? true : false;

    }
}
