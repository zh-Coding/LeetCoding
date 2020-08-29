import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 * @Description
 * @author Administrator
 * @date 2020年7月22日下午8:35:56
 */
/*
 * 88. 合并两个有序数组
给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
说明:

初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 */
public class Merge {
	public static void main(String[] args) {
		int[] nums1 = new int[]{1,2,3,0,0,0,0};
		int m=3;
		int[] nums2 = new int[] {2,4,5,6};
		int n = 4;
        merge(nums1,m,nums2,n);
		
	}
	  public static void merge(int[] nums1, int m, int[] nums2, int n) {
		  int temp[] = new int[m];
		  System.arraycopy(nums1, 0, temp, 0, m);
		  int p1 = 0;
		  int p2 = 0;
		  int p = 0;
		  while(p1<m&&p2<n) {
			  if(temp[p1]>nums2[p2]) {
				  nums1[p]=nums2[p2];
				  p2++;
				  p++;
			  }
			  if(temp[p1]<=nums2[p2]) {
				  nums1[p]=temp[p1];
				  p1++;
				  p++;
			  }
		  }
		  if (p1 < m)
		      System.arraycopy(temp, p1, nums1, p1 + p2, m + n - p1 - p2);
		    if (p2 < n)
		      System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
		    System.out.println(Arrays.toString(nums1));
		    for(int i=0;i<m+n;i++) {
		    System.out.println(nums1[i]);
		    }
		  String str = "明月几时有，把酒问青天";
				  System.out.println("该字符串的长度为："+str.length());
				  System.out.println(str.charAt(0));
	  }
}
