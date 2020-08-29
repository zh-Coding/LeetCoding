/**
 * @author zhCoding
 * @create 2020-08-09 12:56
 */
public class RomanToInt {
    public static void main(String[] args) {
        String s = "MMCMXII";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        if(s==null||s.length()<1) return -1;
        int res = 0;
        for(int i=0;i<s.length();i++){
            if(i==s.length()-1){
                res += getNum(s.charAt(i));
                break;
            }
            if (getNum(s.charAt(i)) < getNum(s.charAt(i+1))){
                res -= getNum(s.charAt(i));
            }else{
                res += getNum(s.charAt(i));
            }
        }
        return res;
    }
    public static int getNum(char Rome){
        switch(Rome){
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                throw new RuntimeException("输入类型不匹配!");
        }
    }
}
