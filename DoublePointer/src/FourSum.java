import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhCoding
 * @Description:
 * @create 0:40
 */
public class FourSum {
    @Test
    public void test(){
        int[] arr = new int[]{5,5,3,5,1,-5,1,-2};
        List<List<Integer>> lists = fourSum(arr, 4);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums==null||nums.length<4) return res;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-3; i++) {
            if (i!=0&&nums[i-1]==nums[i]) continue;
            for (int j = i+1; j <nums.length-2 ; j++) {
                if (j!=i+1&&nums[j-1]==nums[j]) continue;
                twoSum(i,j,target,nums,res);
            }

        }
        return res;
    }
    public void twoSum(int index1,int index2,int target,int[] nums,List list){
        int i=index2+1,j=nums.length-1;
        while (i<j){
            long sum = (long)nums[index1]+(long)nums[index2]+(long)nums[i]+(long)nums[j];

            if (sum<target){
                i++;
            }
            if (sum>target){
                j--;
            }
            if (sum==target){
                list.add(Arrays.asList(nums[index1],nums[index2],nums[i],nums[j]));
                i++;
                while (i+1<j&&nums[i+1]==nums[i])
                    i++;
                j--;
                while (j-1>i&&nums[j-1]==nums[j])
                    j--;
            }
        }
    }
}
