import java.util.Scanner;
                       ///circular linked list inserting at end///
class cirend{
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
        int press;
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
            tail.next=newnode;
            tail=newnode;
            newnode.next=head;
            
        }
        System.out.print("press 1:");
        press=sc.nextInt();
    }
    while(press==1);
}
    public void tran(){
        node temp=head;
            do{
            System.out.print(temp.data+" ");
            temp=temp.next;
            }
            while(temp!=head);
    }
}
class f{
    public static void main(String[] args) {
        cirend obj=new cirend();
        obj.create();
        obj.tran();
    }
}
