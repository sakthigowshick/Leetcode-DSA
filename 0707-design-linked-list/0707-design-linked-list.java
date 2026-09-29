class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
            this.next=null;
        }
    }
    Node head;
    int size;

    public MyLinkedList() {
        this.head=null;
        this.size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=this.size) return -1;
        Node curr=this.head;
        for(int i=0;i<index;i++)
        {
            curr=curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        newNode.next=this.head;
        this.head=newNode;
        this.size++;
    }
    
    public void addAtTail(int val) {
        Node newNode=new Node(val);
        if(this.head==null)
        {
            this.head=newNode;
        }
        else
        {
            Node curr=this.head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=newNode;
        }
        this.size++;
    }
    
    public void addAtIndex(int index, int val) {
        Node newNode=new Node(val);
        if(index<0 || index>this.size) return;
        else if(index==0)
        {
            this.addAtHead(val);
            return;
        }
        else if(index==this.size)
        {
            this.addAtTail(val);
            return;
        }
        else
        {
            Node curr=this.head;
            for(int i=0;i<index-1;i++)
            {
                curr=curr.next;
            }
            newNode.next=curr.next;
            curr.next=newNode;
        }
        this.size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=this.size) return;
        else if(index==0)
        {
            this.head=this.head.next;
        }
        else
        {
            Node curr=this.head;
            for(int i=0;i<index-1;i++)
            {
                curr=curr.next;
            }
            curr.next=curr.next.next;
        }
        this.size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */