import java.util.Scanner;

                       /////circular liked list insertion at beginning/////
class circular{
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
            newnode.next=head;
            head=newnode;
            tail.next=head;
        }
        System.out.print("press 1: for insert agian");
        choi=sc.nextInt();
    }
    while(choi==1);
    }

    public void traversal(){
        node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        while(temp!=head);
    }
}
class pppppppppppp{
    public static void main(String[] args) {
        circular obj=new circular();
        obj.creation();
        obj.traversal();
    }
}