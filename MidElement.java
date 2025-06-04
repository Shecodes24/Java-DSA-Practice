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

    public void addFirst(int data)
    {   
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next =  head;
        head = newNode;
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

    public int mid()
    {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            if(fast != null)
            {
                slow = slow.next;
            }
        }
        return slow.data;
    }

    public static void main(String[] args)
    {
        Linkedlist ll = new Linkedlist();
        ll.addFirst(50);
        ll.addFirst(40);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.display();
        System.out.println("Middle Element: "+ll.mid());
    }
}
