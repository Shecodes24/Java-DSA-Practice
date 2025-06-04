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

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addPos(int index, int data)
    {
        if(index < 0)
        {
            System.out.println("Invalid Position");
            return;
        }
        Node newNode = new Node(data);
        int i = 0;
        Node temp = head;
        while(i < index - 1)
        {
            temp = temp.next;
            i++;
        }
        if(temp == null)
        {
            System.out.println("Invalid Position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void delFirst()
    {
        head = head.next;
    }

    public void delLast()
    {
        Node temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void delPos(int index)
    {
        if(index < 0)
        {
            System.out.println("Invalid Position");
            return;
        }
        else if(index == 1)
        {
            delFirst();
            return;
        }
        Node temp = head;
        int i = 0;
        while(i < index-1)
        {
            temp = temp.next;
            i++;
        }
        if(temp == null)
        {
            System.out.println("Invalid Position");
            return;
        }
        temp.next = temp.next.next;
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
  
    public static void main(String[] args)
    {
        Linkedlist ll = new Linkedlist();
        ll.addFirst(20);
        ll.display();
        ll.addFirst(10);
        ll.display();
        ll.addLast(40);
        ll.display();
        ll.addPos(1, 30);
        ll.display();
        ll.addFirst(60);
        ll.display();
        ll.addFirst(80);
        ll.display();
        ll.addLast(70);
        ll.display();
        ll.addPos(1, 50);
        ll.display();
        ll.delFirst();
        ll.display();
        ll.delLast();
        ll.display();
        ll.delPos(2);
        ll.display();
    }
}    

/*
OUTPUT:
AddFirst(20): 20--->null
AddFirst(10): 10--->20--->null
AddLast(40): 10--->20--->40--->null
AddPos(1,30): 10--->30--->20--->40--->null
AddFirst(60): 60--->10--->30--->20--->40--->null
DelFirst(): 10--->30--->20--->40--->null
DelLast(): 10--->30--->20--->null
DelPos(2): 10--->30--->null
*/
