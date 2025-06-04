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
    public void kthNode(int k)
    {
        int n = 1;
        Node temp = head;
        while(temp.next != null)
        {
            if((n+1)%k == 0)
            {
                temp.next = temp.next.next;
                n++;
                continue;
            }
            temp = temp.next;
            n++;
        }
    }
    public static void main(String[] args)
    {
        Linkedlist ll = new Linkedlist();
        ll.addFirst(100);
        ll.addFirst(90);
        ll.addFirst(80);
        ll.addFirst(70);
        ll.addFirst(60);
        ll.addFirst(50);
        ll.addFirst(40);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.display();
        ll.kthNode(4);
        ll.display();
    }
}

/*
OUTPUT:
k = 4
10--->20--->30--->40--->50--->60--->70--->80--->90--->100--->null
10--->20--->40--->50--->70--->80--->100--->null
*/
