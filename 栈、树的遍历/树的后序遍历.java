import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class 树的后序遍历 {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();//首先将根节点出栈
            result.add(node.val);//将栈顶元素放入result队列中
            for (Node child : node.children) {//遍历孩子节点
                stack.push(child);//然后将孩子节点一个一个放入栈中
            }
        }

        Collections.reverse(result);//倒序输出，保证根节点最后被输出
        return result;//在Java中，Collections是一个实用工具类，提供了许多静态方法用于操作和处理集合（Collection）对象。它提供了一系列方法来对集合进行排序、查找、填充、拷贝等操作
    }
}