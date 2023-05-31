import java.util.Scanner;
                           ////Insertion at Specific in Doubly linked list////     
class doubspec{
    class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    node head=null;
    node tail=null;

    public void create(){
        int ch;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("Enter Value: ");
        int data=sc.nextInt();
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            node temp1=head;
            System.out.println("Enter Pos: ");
            int pos=sc.nextInt();
            for(int i=0;i<pos;i++){
                temp1=temp1.next;
            }
            head.next=newnode;
            newnode.prev=head;
            newnode.next=temp1;

        }
        System.out.println("Press 1: ");
        ch=sc.nextInt();
    }
    while(ch==1);
    }
    public void trav(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
class ppp{
    public static void main(String[] args) {
        doubspec obj=new doubspec();
        
        obj.create();
        obj.trav();
    }
}