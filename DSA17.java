import java.util.Scanner;

                        ////Insertion at end in Doubly linked list////

class enddoubly {
    static class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data=data;
            node next=null;
            node prev=null;
        }
    }
    node head=null;
    node tail=null;

    public void create(){
        int ch;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("Enter value: ");
        int data=sc.nextInt();
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.prev=tail;
            tail=newnode;

        }
        System.out.print("press 1: ");
        ch=sc.nextInt();
    }
    while(ch==1);
    }
    public  void trav(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    
}
class dd{
    public static void main(String[] args) {
        enddoubly obj=new enddoubly();
        obj.create();
        obj.trav();
    }
}

