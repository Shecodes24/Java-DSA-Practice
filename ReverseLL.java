public class LinkedList
{
    public static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void addFirst(int data)
    {   
        Node newNode = new Node(data);
        newNode.next =  head;
        head = newNode;
        return;
    }

    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"--->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public Node reverse()
    {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.addFirst(50);
        ll.addFirst(40);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        System.out.print("Before Reversal: ");
        ll.display();
        head = ll.reverse();
        System.out.print("\nAfter Reversal: ");
        ll.display();
    }
}

/*
OUTPUT:
Before Reversal: 10--->20--->30--->40--->50--->null
After Reversal: 50--->40--->30--->20--->10--->null
*/
