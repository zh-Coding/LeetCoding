public class MyAtoi8 {
	public static void main(String[] args) {
		String str = "-2147483649";
		Solution sol = new Solution();
		System.out.println("输出:"+sol.myAtoi(str));
		System.out.println(Integer.MIN_VALUE);
	}
}
class Solution {
    public int myAtoi(String str) {
    	if(str.length()<1||str.trim().length()==0) return 0;
    	String s = "";
    	if(str.charAt(0)!=' ') {
    		return initNum(str, 0, s);
//    		char c = str.charAt(0);
//    		if(c==43||c==45||(c>=48&&c<=57)) {
//    			s = s + c;
//    			for(int i=0;i<str.length()-1;i++) {
//    				int d = str.charAt(i+1);
//    				if (d>=48&&d<=57) {
//    					s += d-48;
//    				}else {
//    					break;
//    				}
//    			}
//    			return Integer.parseInt(s);
//    		}else {
//    			return 0;
//    		}
    		
//    		char[] array = str.toCharArray();
//            for(int i=0;i<array.length;i++){
//                
//            }
    	}else {
    		int t = 1;
    		while(str.charAt(t)==' '){
    			t++;
    		}
    		return initNum(str, t, s);
    	}
    	
    }
    public int initNum(String str,int t,String s) {
    	char c = str.charAt(t);
    	if(c==43||c==45||(c>=48&&c<=57)) {
			s = s + c;
			for(int i=t;i<str.length()-1;i++) {
				int d = str.charAt(i+1);
				if (d>=48&&d<=57) {
					if(s.length()>1&&Long.parseLong(s)*10+(d-48)>Integer.MAX_VALUE)  return Integer.MAX_VALUE;
                    if(s.length()>1&&Long.parseLong(s)*10-(d-48)<Integer.MIN_VALUE)  return Integer.MIN_VALUE;
					s += d-48;
				}else {
					break;
				}
			}
			return ((s.charAt(0)==43||s.charAt(0)==45)&&s.length()==1) ? 0 : Integer.parseInt(s);
		}else {
			return 0;
		}
    }
}