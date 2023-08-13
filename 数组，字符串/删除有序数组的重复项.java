
/*
*
* 题目：
* 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，
* 返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
返回 k 。
*
*
* 解题思路:
* 要求：原地修改，意思是不能使用可操作字符串降低时间？
* 方法：首先想到双指针循环遍历
* 1.定义i,j,进行while循环
* 2.当两指针指向值相等时，j++,i不变
* 3.不相等时，i++,j++，同时将i的下一位的相等的值用不等的值进行覆盖
* 4.返回i+1的值就是最后的结果
* */

public class 删除有序数组的重复项 {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else{
                nums[i+1]=nums[j];
                i++;
                j++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        删除有序数组的重复项 a=new 删除有序数组的重复项();
        int[] nums={1,1,1,3,4};
        int ans=a.removeDuplicates(nums);
        System.out.println(ans);
    }
}
