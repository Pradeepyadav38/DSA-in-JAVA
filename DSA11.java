import java.util.Scanner;

class circularlinked{
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
        System.out.println("Enter \n1.Beginning \n2.Specific Pos \n3.End \n4.Exit");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
            newnode.next=head;
            head=newnode;
            tail.next=head;
            break;

            case 2:
            node temp=head;
            node tail=temp.next;
            System.out.print("Enter pos: ");
            int pos=sc.nextInt();
            for(int i=0;i<pos;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
            tail.next=head;
            break;

            case 3:
            node temp1=head;
            while(temp1.next!=head){
                temp1=temp1.next;
            }
            temp1.next=newnode;
            newnode.next=head;
            

        }
    }
    System.out.print("PRESS 1:");
    press=sc.nextInt();
    }
    while(press==1);

    }

    public void traversal(){
    node temp2=head;
    if(head==null){
        System.out.println("empty");
    }
    else{
    do{
        System.out.print(temp2.data+" ");
        temp2=temp2.next;

    }
    while(temp2!=head);
    }
    }
}
class sr{
public static void main(String[] args) {
    circularlinked obj=new circularlinked();
    obj.create();
    obj.traversal();
}
}

