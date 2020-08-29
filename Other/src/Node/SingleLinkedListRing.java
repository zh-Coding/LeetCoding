package Node;

import org.junit.Test;

/**
 * @author zhCoding
 * @Description:
 * @create 22:44
 */
public class SingleLinkedListRing {
    @Test
    public void test1(){
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
        listNode6.next= listNode3;
        System.out.println(singleLinkedListRing(listNode1));
    }
    public boolean singleLinkedListRing(ListNode listNode){
        if (listNode ==null|| listNode.next.next==null) return false;
        ListNode slow = listNode;
        ListNode fast = listNode;

        while (fast!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
}
