import java.util.Scanner;

                         ///////circular linked list deletion at beginning//////////

class cirbegdel{
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
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
            newnode.next=head;
        }
        else{
            newnode.next=head;
            head=newnode;
            tail.next=head;

        }
    System.out.print("press 1:");
   ch=sc.nextInt();
    }
    while(ch==1);

    }

    public void trav(){
        node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
           }   
           while(temp!=head);
        
    }

    public void deletion(){
        node temp=head;
        
        if(head==null){
            System.out.println("Empty linked linklist");
        }
        else{
            temp=temp.next;
            head=temp;
            tail.next=head;
        }
    }

}
class cirdel{
    public static void main(String[] args) {
        cirbegdel obj=new cirbegdel();
        obj.create();
        
        obj.deletion();
        obj.trav();
    }
}