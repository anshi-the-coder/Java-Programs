public class palindrome {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
         
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode findMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;

        while(hare.next != null && ){
            hare = hare.next.next;
            turtle = turtle.next;   
        }
    }
    public boolean isPalindrome(ListNode head){
        if(head == null || head.next == null){
            return true;
        }
        ListNode middle = findMiddle(head); // 1st half ka end
       ListNode secondhalfstart =  reverse(middle.next);

       List firsthalfstart = head;
       while(secondhalfstart = null){
        if(firsthalfstart.val != secondhalfstart.val){
            return false;
        }
        firsthalfstart = firsthalfstart.next;
        secondhalfstart = secondhalfstart.next;
       }
       return true;

    }
    
}
