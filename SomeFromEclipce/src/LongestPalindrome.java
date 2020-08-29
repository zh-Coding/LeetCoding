public class LongestPalindrome {
	public static void main(String[] args) {
		
	}
	public static String longestPalindrome(String s) {
		int len = s.length();
		if(len<2) {
			return s;
		}
		int maxLen = 1;
		int begin = 0;
		
		char[] charArray = s.toCharArray();
		for(int i=0;i<len-1;i++) {
			int oddLen = aroundCenter(charArray,i,i);
			int evenLen = aroundCenter(charArray,i,i+1);
			
			int curMaxLen = Math.max(oddLen, evenLen);
			if(curMaxLen > maxLen) {
				maxLen = curMaxLen;
				//纸上画图发现规律
				begin = i - (maxLen-1)/2;
			}
		}
		return s.substring(begin,begin+maxLen);
	}
	private static int aroundCenter(char[] charArray, int left, int right) {
		int len = charArray.length;
		int i= left;
		int j= right;
		while(i>=0 && j<len) {
			if(charArray[i]==charArray[j]) {
				i--;
				j++;
			}else {
				break;
			}
		}
		//跳出while循环时，恰好满足s.charAt(i)!=s.charAt(j)
		//回文串长度应该是 j-1-(i+1)-1=j-i-1
		return j-i-1;
	}
}
