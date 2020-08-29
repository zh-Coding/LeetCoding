import java.util.List;
import java.util.Stack;

/**
 * @author zhCoding
 * @Description:
 * @create 21:14
 */
public class FastSlowPointer {
    class ListNode{
        public int val;
        ListNode next = null;

        public ListNode(int val){
            this.val = val;
        }
    }
    public boolean checkPalindrom(ListNode node){
        if (node==null) return false;
        if (node.next==null) return true;
        ListNode fast = node;
        ListNode slow = node;
        Stack<ListNode> stack = new Stack<>();
        while (fast!=null&&fast.next!=null){
            stack.push(slow);
            slow=slow.next;
            fast=fast.next.next;
        }
        if (fast!=null){
            slow=slow.next;
        }
        while (!stack.empty()){
            if (stack.pop().val!=slow.val){
                return false;
            }
            slow=slow.next;
        }
        return true;
    }

    public boolean checkPalindrom2(ListNode node){
        if (node==null) return false;
        if (node.next==null) return true;
        ListNode fast = node;
        ListNode slow = node;
        ListNode pres = null;
        ListNode pre = null;
        while (fast!=null&&fast.next!=null){
            pres = slow;
            slow=slow.next;
            fast=fast.next.next;
            pres.next = pre;
            pre = pres;
        }
        if (fast!=null){
            slow=slow.next;
        }
        while (pres!=null){
            if (pres.val!=slow.val){
                return false;
            }
            pres = pres.next;
            slow=slow.next;
        }
        return true;

    }

    public static void main(String[] args) {
        ListNode node1 = new FastSlowPointer().new ListNode(1);
        ListNode node2 = new FastSlowPointer().new ListNode(2);
        ListNode node3 = new FastSlowPointer().new ListNode(3);
        ListNode node4 = new FastSlowPointer().new ListNode(3);
        ListNode node5 = new FastSlowPointer().new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        System.out.println(new FastSlowPointer().checkPalindrom2(node1));
//        System.out.println(new FastSlowPointer().checkPalindrom(node1));
    }
}
