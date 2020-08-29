package Node;

import org.junit.Test;

/**
 * @author zhCoding
 * @Description:
 * @create 0:37
 */
public class TheReverseK {

    ListNode res = null;
    int t =0;

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
        showNodeList(listNode1);
        theReverseK(listNode1,7,1);
        System.out.println(res.val);
    }

    public int theReverseK(ListNode listNode, int k, int t){
        if (listNode ==null) return -1;
        if (listNode.next!=null){
            int k1 = theReverseK(listNode.next, k,t+1);
            k1--;
            if (k1==0) res = listNode;
            return k1;
        }
        if (t<k)
            throw new RuntimeException("k值比链表长度还大");
        k--;
        if (k==0) res = listNode;
        return k;
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

