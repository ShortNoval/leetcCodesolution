import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 二叉树的中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                // 如果当前节点不为空，将其压入栈，继续处理左子树
                stack.push(root);
                root = root.left;
            } else {
                // 当前节点为空，表示左子树已经遍历完成，需要处理栈中的节点
                TreeNode node = stack.pop();
                ans.add(node.val); // 将当前节点的值添加到结果列表中
                root = node.right; // 处理右子树
            }
        }

        return ans;
            }
        }



