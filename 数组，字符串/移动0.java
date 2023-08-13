import java.util.Arrays;

public class 移动0 {
    /*
    题目:
    给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
请注意 ，必须在不复制数组的情况下原地对数组进行操作。

    解题思路:
    要求：不复制数组，也就是原地修改值
    方法：1.从第一个开始for循环
         2.碰到非零元素时，将他放入前面的零元素位置
         3.此时需要一个k值来记录遍历的位置
         4.遍历数组结束后，处理后面还未被k记录的位置
         5.返回数组


     */
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=0){
                nums[k++]=nums[i];
            }
        }
        while (k< nums.length){
            nums[k++]=0;
        }
        }


    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        移动0 solution = new 移动0();
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
