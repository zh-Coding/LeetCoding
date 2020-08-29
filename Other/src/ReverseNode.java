import java.util.Stack;

/**
 * @author zhCoding
 * @create 2020-08-07 22:18
 */
public class ReverseNode {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(null);
        showNodeList(node1);
        System.out.println("******");
//        reversePrint(node1);
//        System.out.println(reverseNodeList(node1).getVal());
        showNodeList(reverseNodeList(node1));
        showNodeList(node5);
//        System.out.println(p(7));
    }
    public static void reversePrint(Node node){
        if (node.getNext()!=null){
            Node next = node.getNext();
            reversePrint(next);
        }
        System.out.println(node.getVal());
//        Stack<Integer> stack = new Stack<>();
//        while (node!=null){
//            stack.push(node.getVal());
//            node = node.getNext();
//        }
//        while (!stack.empty()){
//            System.out.println(stack.pop());
//        }

    }
    public static Node reverseNodeList(Node node){
//        if (node==null||node.getNext()==null)
//            return node;
//        ListNode pre = node;
//        node = node.getNext();
//        ListNode newNode = reverseNodeList(node);
//        newNode.setNext(pre);
//        pre.setNext(null);
//        return pre;

        if (node.getNext()!=null){
            Node next = reverseNodeList(node.getNext());
            next.setNext(node);
            node.setNext(null);
            return node;
        }
        return node;

//        ListNode pre = null;
//        ListNode next = null;
//        while (node.getNext()!=null){
//            next = node.getNext();
//            node.setNext(pre);
//            pre = node;
//            node = next;
//
//        }
//        if (node.getNext()==null)
//            node.setNext(pre);
//        return pre;

//        ListNode pre = null;
//        ListNode next = null;
//        while (node != null) {
//            next = node.getNext();
//            node.setNext(pre);
//            pre = node;
//            node = next;
//        }
//        return pre;
    }
    public static void showNodeList(Node node){
        if (node.getNext()!=null){
            System.out.print(node.getVal()+"->");
            showNodeList(node.getNext());
        }else{
            System.out.println(node.getVal());
        }
    }
    public static int p(int n){
        if (n==1) return 1;
        if (n==0) return 1;
        return p(n-1)+p(n-2);
    }
}
class Node{

    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
