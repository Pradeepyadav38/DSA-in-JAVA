import java.util.*;
class CircularLinkedList{
    public class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node head=null;
    node tail=null;

                                    /////Insertion/////

    public void creation(){
        int choi;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("Enter the value: ");
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
        System.out.print("press 1: for insert agian");
        choi=sc.nextInt();
    }
    while(choi==1);
    }

                                    //////Deletion/////

    public void deletion(){
        node temp=head;
        
        if(head==null){
            System.out.println("Empty linked linklist");
        }
        else{
            Scanner scc=new Scanner(System.in);
            System.out.println("Enter \n1.Beginning \n2.Specific Pos \n3.End \n4.Exit");
            int ch=scc.nextInt();
            switch(ch){
                case 1:
                temp=temp.next;
                head=temp;
                tail.next=head;
                break;
    
                case 2:
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
                break;
    
                case 3:
                node temp2=head;
                node ptr2=temp2.next;
                while(ptr2.next!=head){
                temp2=ptr2;
                ptr2=ptr2.next;
                }
                temp2.next=head;
                tail=head;
                
    
            }
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
class mainall{
    public static void main(String[] args) {
        CircularLinkedList obj=new CircularLinkedList();
        obj.creation();
        obj.deletion();
        obj.trav();
    }
}
