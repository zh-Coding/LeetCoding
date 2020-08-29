import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhCoding
 * @Description:
 * @create 1:20
 */
public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum tsum = new ThreeSum();
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        tsum.threeSum(nums);
        tsum.res.forEach(System.out::println);
    }
    List<List<Integer>> res;

    public List<List<Integer>> threeSum(int[] nums){
        if (nums==null||nums.length<3) return null;
        res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0) break;
//            if (nums[i]==nums[i+1]){
//                continue;
//            }
//            twoSum(nums,i);  这样会有漏
            //正确：
            if(i==0||nums[i]!=nums[i-1])
                twoSum(nums,i);
        }
        return res;
    }
    public void twoSum(int[] nums,int index){
        int i=index+1,j=nums.length-1,target=(-(nums[index]));
        long sum=0;
        while (i<j){
            sum=(long)nums[i]+(long)nums[j];
            if (target==sum){
                res.add(Arrays.asList(index,nums[i],nums[j]));
            }
            while (i+1<j&&nums[i]==nums[i+1]) i++;
            while (j-1>i&&nums[j]==nums[j-1]) j--;
            if (sum>target){
                j--;
            }else {
                i++;
            }
        }
    }
}
class Solution001 {
    List<List<Integer>> res;
    public List<List<Integer>> threeSum(int[] nums) {
        res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break; // min > 0 后续没必要找了
            if (i == 0 || nums[i] != nums[i - 1]) twoSum(nums, i); // 1层去重
        }

        return res;
    }

    public void twoSum(int[] nums, int index) {
        int i = index + 1, j = nums.length - 1, item = nums[index], target = -item;
        long sum;

        while (i < j) {
            sum = (long) nums[i] + (long) nums[j];
            if (sum == target) {
                res.add(Arrays.asList(item, nums[i], nums[j]));
                // 2层去重，111333这种情况，只需要算一次，i,j 移动到 最内部 1，3
                while (i + 1 < j && nums[i+1] == nums[i]) i++;
                while (j - 1 > i && nums[j-1] == nums[j]) j--;
            }

            if (sum > target) j--;
            else i++;
        }
    }
}
