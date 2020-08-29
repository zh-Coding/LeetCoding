import org.junit.Test;

/**
 * @author zhCoding
 * @create 2020-08-15 0:32
 */
public class Find2DArray {

    @Test
    public void test1(){
        int[][] arr= new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(find2DArray(arr, 7));
    }

    public boolean find2DArray(int[][] arr,int n){


        int t = 0,s=0;
        for (int i = arr[0].length-1; i >=0 ; i--) {
            if (arr[0][i]==n)
                return true;
            if (arr[0][i]<n){
                s=i;
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][s]==n){
                return true;
            }
            if (arr[i][s]>n){
                if (i-1<0){
                    t=i;
                }else {
                    t = i-1;

                }
            }
        }

        for (int i = t; i <arr.length ; i++) {
            for (int j = 0; j <=s ; j++) {
                if (arr[i][j]==n){
                    return true;
                }
            }
        }

        return  false;

    }
}
