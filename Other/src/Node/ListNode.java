package Node;

/**
 * @author zhCoding
 * @Description:
 * @create 22:42
 */
public class ListNode {

    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public static void showNodeList(ListNode listNode){
        if (listNode.getNext()!=null){
            System.out.print(listNode.getVal()+"->");
            showNodeList(listNode.getNext());
        }else{
            System.out.println(listNode.getVal());
        }
    }
}
