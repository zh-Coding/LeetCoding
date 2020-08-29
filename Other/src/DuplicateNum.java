import jdk.nashorn.internal.ir.ReturnNode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author zhCoding
 * @create 2020-08-14 0:23
 */
public class DuplicateNum {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,2,3};
        System.out.println(dupNum(numbers));
        System.out.println(getDup(numbers, numbers.length));
    }
    //low  hashset
    public static int dupNum(int[] numbers){
        if (numbers==null||numbers.length<1) return -1;
        for (int n:numbers){
            if (n>numbers.length-1||n<1)
                return -1;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int n:numbers){
            if (set.contains(n)){
                return n;
            }
            set.add(n);
        }


        throw new RuntimeException("没有重复数字");
    }
    //good
    public static int getDup(int[] numbers,int len){
        if (numbers==null||numbers.length<1) return -1;
        for (int n:numbers){
            if (n>numbers.length-1||n<1)
                return -1;
        }
        int start = 1;
        int end = len-1;
        while (start<end){
            int middle = ((end-start)>>1) +start;
            int count = countRange(numbers,len,start,middle);
            if (end==start){
                if (count>1)
                    return start;
                else
                    break;
            }
            if (count>(middle-start+1)){
                end = middle;
            }else {
                start = middle +1;
            }
        }
        return  -1;
    }
    private static int countRange(int[] numbers,int len,int start,int end){
        if(numbers==null) return 0;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (numbers[i]>=start&&numbers[i]<=end)
                count++;
        }
        return count;
    }
//    public static int dupNum2(int[] numbers){
//        if (numbers==null||numbers.length<1) return -1;
//        for (int n:numbers){
//            if (n>numbers.length-1||n<1)
//                return -1;
//        }
//        int count=0;
//        for (int n:numbers){
//            if (n<numbers.length/2&&count<numbers.length/2){
//                count++;
//            }
//        }
//        if (count>)
//        return -1;
//    }
//    private int res(int[] numbers,int nlen){
//        int count =0;
//        for (int n:numbers){
//            if (n<nlen/2&&count<nlen/2){
//                count++;
//            }
//        }
//        if (count<nlen/2)
//        return -1;
//    }
}