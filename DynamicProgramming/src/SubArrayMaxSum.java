import org.junit.Test;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 *
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 * @author zhCoding
 * @Description:
 * @create 22:07
 */
public class SubArrayMaxSum {
    @Test
    public void test1(){
        int[] arr = new int[]{6,-5,0,1,3,-5,-1,2};
        System.out.println(subArrayMaxSum(arr));
    }
    public int subArrayMaxSum(int[] arr){
        if (arr.length<1) return -1;
        int maxSum = arr[0];
        int res = 0;
        for (int i = 1; i < arr.length; i++) {

            maxSum= Math.max(maxSum+arr[i],arr[i]);
            res = Math.max(res,maxSum);
        }
        return res;
    }
}
