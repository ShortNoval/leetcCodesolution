
/**
 *题目：
 *  给你单链表的头节点 head ，请你反转链表，并返回反转后的链表
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 *
 * 题解
 *(1)定义一个prev,cur,temp用来定义指针
 *(2)cur指向头节点
 *(3)temp用来保存cur的下一个节点，即cur.next
 *(4)因为接下来要改变 cur->next 的指向了，将cur->next 指向pre ，此时已经反转了第一个节点了。
 */


public class 反转链表 {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode temp;
        ListNode cur=head;
        while (cur!=null){
            temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }

}
