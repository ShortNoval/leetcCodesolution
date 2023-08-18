/**
 * 题解：
 * 给你一个链表的头节点 head 和一个整数 val ，
 * 请你删除链表中所有满足 Node.val == val 的
 * 节点，并返回 新的头节点
 * 输入：head = [1,2,6,3,4,5,6], val = 6
 * 输出：[1,2,3,4,5]
 *
 * 题解
 * (1)由于与数组或者字符串不一样，不能一个一个进行遍历，所以优先遍历头节点
 * (2)若头节点等于关键值，则next，判断下一位，为空时，循环结束
 * (3)当头节点值不为关键值时，定义pre=head,cur=head.next指针
 * (4)进入循环判断，当cur.val等于关键值时，要略过当前值，pre应该指向cur的下一个值，也就是
 * pre=cur.next
 * (5)在不等的情况下，判断下一位，移动pre的值
 * (6)最后移动cur的值到下一位。循环结束返回head
 *
 *
 */

public class 移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
        //从第一个开始扫描，对头节点进行操作
        while (head!=null&&head.val==val){
            head=head.next;
        }
        if(head==null){
            return head;
        }
        //当头节点不为空，且头节点不再为val时
        ListNode pre=head;
        ListNode cur=head.next;
        while (cur!=null){
            if(cur.val==val){
                pre.next=cur.next;
            }else {
                pre=cur;
            }
            cur=cur.next;
        }
        return head;
    }
}
