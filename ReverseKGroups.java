public class Linkedlist
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
    //public static Node tail;

    public void addFirst(int data)
    {   
        Node newNode = new Node(data);
        newNode.next =  head;
        head = newNode;
        return;
    }

    public void display()
    {
        if(head == null)
        {
            System.out.println("No Elements in LinkedList");
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"--->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public Node reverseK(Node head, int k)
    {
        Node temp = head;
        int i = 0;
        while(i < k)
        {
            if(temp == null)
            {
                return head;
            }
            temp = temp.next;
            i++;
        }
        Node prevNode = reverseK(temp, k);
        temp = head;
        Node NextNode;
        i = 0;
        while(i<k)
        {
            NextNode = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = NextNode;
            i++;
        }
        return prevNode;
    }

    public static void main(String[] args)
    {
        Linkedlist ll = new Linkedlist();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.display();
        head = ll.reverseK(head, 3);
        ll.display();
    }
}

/*
OUTPUT:
Before: 1--->2--->3--->4--->5--->null
After:  3--->2--->1--->4--->5--->null
  */
