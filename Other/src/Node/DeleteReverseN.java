package Node;

import org.junit.Test;

/**
 * 19. 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * 给定的 n 保证是有效的。
 * 进阶：
 * 你能尝试使用一趟扫描实现吗？
 *
 * @author zhCoding
 * @Description:
 * @create 23:37
 */
public class DeleteReverseN {
    int i;
    ListNode thead;


    @Test
    public void test(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        listNode1.next= listNode2;
        listNode2.next= listNode3;
        listNode3.next= listNode4;
        listNode4.next= listNode5;
        listNode5.next= listNode6;
        ListNode.showNodeList(listNode1);
        ListNode res = removeNthFromEnd(listNode1, 6);
        System.out.println(res.val);
        ListNode.showNodeList(res);
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            i = 0;
            return null;
        }

        head.next = removeNthFromEnd(head.next, n);
        i++;  // 归的过程中会按倒序依次增加序号
        if (i == n) return head.next;  // 此时的节点为待删除节点，返回其next节点跨过待删除节点，达到删除节点的目的
        return head;
    }

//    public ListNode toNode(ListNode head, int n) {


//        if (listNode.next == null) {
//            return listNode;
//        }
//        toNode(listNode.next,n);
//        if (k==n) listNode.next= listNode.next.next;
//        k++;
//        if (k==n&& listNode ==thead){
//            ListNode head= listNode.next;
//            listNode.next=null;
//            return head;
//        }
//        return listNode;
//    }
}
