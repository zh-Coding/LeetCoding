/**
 * @author zhCoding
 * @create 2020-08-09 12:55
 */
public class LongestCommonPrefix {
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null||strs.length<1) return "";
        String buf = strs[0];
        int len = strs[0].length();
        for (int i = 0; i < len; i++) {
            char c = buf.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || c != strs[j].charAt(i)){
                    return buf.substring(0,i);
                }

            }
        }
        return buf;
    }
}