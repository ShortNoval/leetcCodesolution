import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class 商品折扣后的最终价格 {
    /*

    题目
    给你一个数组 prices ，其中 prices[i] 是商店里第 i 件商品的价格。
商店里正在进行促销活动，如果你要买第 i 件商品，那么你可以得到与 prices[j]
相等的折扣，其中 j 是满足 j > i 且 prices[j] <= prices[i] 的 最小下标，
如果没有满足条件的 j ，你将没有任何折扣。请你返回一个数组，数组中第 i 个元素
是折扣后你购买商品 i 最终需要支付的价格。

示例 1：
输入：prices = [8,4,6,2,3]
输出：[4,2,4,2,3]
解释：
商品 0 的价格为 price[0]=8 ，你将得到 prices[1]=4 的折扣，所以最终价格为 8 - 4 = 4 。
商品 1 的价格为 price[1]=4 ，你将得到 prices[3]=2 的折扣，所以最终价格为 4 - 2 = 2 。
商品 2 的价格为 price[2]=6 ，你将得到 prices[3]=2 的折扣，所以最终价格为 6 - 2 = 4 。
商品 3 和 4 都没有折扣。

题解：
要求：
(1)j>i
(2)prices[j]<=prices[i]的最小下标
思路：
(1)建一个栈
(2)将prices倒序入栈
(3)当栈为空时，将该元素倒序放入ans数组中，并将该元素入栈，
(4)不为空时，判断当前元素与栈顶元素的大小，若栈顶元素大，栈顶元素出栈，该元素入栈，保证栈顶元素一定为
    最小值,
(5)栈顶元素为最小值，下一步操作中栈顶一定要放入结果数值中，并保证再遇到下一个比栈顶最小值时，栈顶元素
    保持不变


     */
    public int[] finalPrices(int[] prices) {
        //构造单项栈
        int n = prices.length;
        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() > prices[i]) {//此处用循环以保证栈顶元素一定为最小值
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? prices[i] : prices[i] - stack.peek();
            stack.push(prices[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] prices={8,4,6,2,3};
        商品折扣后的最终价格 a=new 商品折扣后的最终价格();
        int [] ans= a.finalPrices(prices);
        System.out.println(Arrays.toString(ans));
    }
}
