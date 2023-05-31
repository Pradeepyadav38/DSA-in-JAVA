import java.util.Scanner;

                        ///////circular linked list deletion at specific//////////

class cirspedel{
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

    

    public void deletion(){
        node temp=head;
        
        if(head==null){
            System.out.println("Empty linked linklist");
        }
        else{
            Scanner sc1=new Scanner(System.in);
            System.out.println("Enter position: ");
            int pos=sc1.nextInt();
            node temp1=head;
            node ptr=temp1.next;
            for(int i=0;i<pos-1;i++){
                temp=ptr;
                ptr=ptr.next;
            }
            temp.next=ptr.next;
           
        }
    }


    public void trav(){
        node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
           }   
           while(temp!=head);
        
    }
}
class cirspec{
    public static void main(String[] args) {
        cirspedel obj=new cirspedel();
        obj.create();
        
        obj.deletion();
        obj.trav();
    }
}

