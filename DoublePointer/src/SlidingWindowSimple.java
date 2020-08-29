import java.util.Arrays;

/**
 * 寻找两个字符串的最大相同子串
 * <p>
 * 比如  str1 = "xxxxxxxxzcphelloapie"  和 str2 = "cpasdhelloas;f"
 * 的最大相同子串就是"hello"
 *
 * @author zhCoding
 * @create 2020-08-03 18:27
 */
public class SlidingWindowSimple {
    public static void main(String[] args) {
        String str1 = "fasflkjhello1sada.bbbbbbsadsadcccccc";
        String str2 = "pokgperhello1ljalkanbbbbbbwrwetwetzxcccccc";

        Solution2 sol2 = new Solution2();
        String[] res = sol2.getMaxSameSub(str1, str2);
        System.out.println(Arrays.toString(res));
    }
}

class Solution2 {
    public String[] getMaxSameSub(String str1, String str2) {
        if (str1==null||str2==null) return null;
        String ans = "";
        int subLen = 0;
        //首先分出两个字符串长短
        String longStr = (str1.length() >= str2.length()) ? str1 : str2;
        String shortStr = (str1.length() < str2.length()) ? str1 : str2;
        for (int i = 0; i < shortStr.length(); i++) {
            for (int x = 0, y = shortStr.length()-i; y <= shortStr.length(); x++, y++) {
                String sub = shortStr.substring(x, y);
                if (longStr.contains(sub)) {
                    subLen = sub.length();
                    ans = ans + sub;
                }
            }
            if (ans!="")
                break;
        }
        System.out.println(ans+" "+subLen);
//        return null;
        if (ans == null){
            return null;
        }else {
            String[] res = new String[ans.length() / subLen];
            int t = 0;
            while (t<ans.length()/subLen) {
                res[t] = ans.substring(t * subLen, (t + 1) * subLen);
                t++;
            }
            return res;
        }
    }
}