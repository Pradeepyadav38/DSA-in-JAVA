import java.util.Scanner;

                        ////Insertion at beginning in Doubly linked list////

class doubly {
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
            head.prev=newnode;
            newnode.next=head;
            head=newnode;

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
class d{
    public static void main(String[] args) {
        doubly obj=new doubly();
        obj.create();
        obj.trav();
    }
}
