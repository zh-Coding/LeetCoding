/*
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。

比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
L   C   I   R
E T O E S I I G
E   D   H   N
之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
请你实现这个将字符串进行指定行数变换的函数：
string convert(string s, int numRows);
示例 1:
输入: s = "LEETCODEISHIRING", numRows = 3
输出: "LCIRETOESIIGEDHN"
 */
public class ZigZagConversion6 {
	public static void main(String[] args) {
//		String s = "AB";
		String s = "LEETCODEISHIRING";
		int n = 4;
		Solution6 sol6 = new Solution6();
		String t = sol6.zigzagConversion(s, n);
		System.out.println(t);
		StringBuffer yy = new StringBuffer();
		yy.append(" + DASLHJGLA");
		System.out.println(yy);
		yy.delete(0, 1);
		System.out.println(yy);
		System.out.println(yy.charAt(0));
	}
}
class Solution6{
	public String zigzagConversion(String s,int rowNum){
		if(s.length()<=rowNum||rowNum==1)return s;
		StringBuilder[] array = new StringBuilder[rowNum];
		for (int i = 0; i < array.length; i++) {
			array[i] = new StringBuilder();
		}
		int dir = 1;
		int index = 0;
		int j = 0;
		String str = "";
		while(j<s.length()){
			array[index].append(s.charAt(j));
			index += dir;
			if(index==0||index==rowNum-1) dir = -dir;
			j++;
		}
		for (int i = 0; i < array.length; i++) {
			str += array[i];
		}
		return str;
	}
}