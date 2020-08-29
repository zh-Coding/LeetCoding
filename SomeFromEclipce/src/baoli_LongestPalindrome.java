import java.util.Arrays;

/**
 * 
 * @Description
 * @author Administrator
 * @date 2020年7月22日下午10:20:22
 */
/*
 * 5. 最长回文子串
给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

示例 1：

输入: "babad"
输出: "bab"
注意: "aba" 也是一个有效答案。
 */
public class baoli_LongestPalindrome {
	public static void main(String[] args) {
		String s = "abababcccc";
		String str = longestPalindrome(s);
		System.out.println(str);
		
	}
	//暴力解法
	public static String longestPalindrome(String s) {
		int len = s.length();
		if(len<2) {
			return s;
		}
		int maxlen = 1;
		int begin = 0;
		//s.charAt(i) 每次都会检查数组下标越界，因此先转换成字符数组，这一步非必需
		char[] charArray = s.toCharArray();
		
		//枚举所有长度严格大于1的子串 charArray[i..j]
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if(j-1+1>maxlen && validPalindromic(charArray,i,j)) {
					maxlen = j-i+1;
					begin = i;
				}
			}
		}
		
		return s.substring(begin,begin+maxlen);
	}
	private static boolean validPalindromic(char[] charArray, int left, int right) {
		while(left<right) {
			if(charArray[left] != charArray[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
