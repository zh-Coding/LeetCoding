import org.junit.Test;

import javax.xml.bind.annotation.XmlAnyAttribute;

/**
 * 给定一个排序的数组，找出其中两个元素和为特定值的元素
 * @author zhCoding
 * @Description:
 * @create 22:41
 */
public class TwoArrSum {

    @Test
    public void test1(){
        int[] arr = new int[]{1,3,5,10,18,19,27,54};
        System.out.println(twoArrSum(arr, 21));
    }

    public String twoArrSum(int[] arr,int dest){
        if (arr==null||arr.length<2)
            return null;
        int i=0,j=arr.length-1;
        String ans=null;
        while (i<j){
            if (arr[i]+arr[j]>dest) j--;
            if (arr[i]+arr[j]<dest) i++;
            if (arr[i]+arr[j]==dest){
                ans = "arr["+i+"]="+arr[i]+"  arr["+j+"]="+arr[j];
                break;
            }
        }
         return ans;
    }
}
