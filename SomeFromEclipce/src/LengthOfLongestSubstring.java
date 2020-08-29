/**
 * 
 * @Description
 * @author Administrator
 * @date 2020年7月22日下午3:29:33
 */
/*
 * 3. 无重复字符的最长子串
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class LengthOfLongestSubstring {
	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
	public static int lengthOfLongestSubstring(String s) {
		if(s==null||s.length()==0)
		return 0;
		int len=0,maxLen = 0;//count=0;
		
		String preStr = "";
		for (int i = 0; i < s.length(); i++) {
			String cur = String.valueOf(s.charAt(i));
			if(preStr.contains(cur)) {
//				count = 0;
//				len = preStr.length()-preStr.lastIndexOf(cur);
//				if(len>maxLen)
//					maxLen=len;
//				preStr += cur;
				preStr =  preStr.substring(preStr.lastIndexOf(cur) + 1);
                preStr += cur;
			}else if(!preStr.contains(cur)) {
				preStr += cur;
//				count++;
			}
			
			if (preStr.length() > maxLen) {
                maxLen = preStr.length();
            }
		}
//		if(count>maxLen)maxLen=count+1;
		return maxLen;
	}
}
