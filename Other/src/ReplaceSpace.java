import org.junit.Test;

/**
 * @author zhCoding
 * @Description:
 * @create 0:50
 */
public class ReplaceSpace {
    @Test
    public void test1(){
        String str = "We are happy.";
        System.out.println(replaceSpace(str));
    }
    public StringBuilder replaceSpace(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' '){
                sb.append("%20");
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb;
    }


}
