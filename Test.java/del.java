

public class del {
    public ListNode removeNthFromEnd(ListNode head, int n){
        if(head.next== null){
            return null;
        }
        //sizew
int size=0;
ListNode curr = head;
while(curr != null){
    curr = curr.next;
    size++;
}
if(n == size){
    return head.next;
}
int indexToSearch = size-n;
ListNode prev = head;
curr = head;
int i = 1;
while(i< indexToSearch){
prev = prev.next;
i++;
    }
    prev.next = prev.next.next;
    return  head;
    
}
}