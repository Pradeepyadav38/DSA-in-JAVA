import java.util.Scanner;
                                 /////deltion at beginning//// 
class deletion{
    public class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node head=null;


    public void creation(){
        int cho;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("enter the value: ");
        int data=sc.nextInt();
        node newnode=new node(data);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    
        System.out.println("If you want to enter again press 1: ");
        cho=sc.nextInt();
    } 
    while(cho==1);
    }

    public void traversal(){
        node temp=head;

        if(head==null){
            System.out.println("empty");
        }
        else{

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
    }
}

public void delete(){
    if(head==null){
        System.out.println("empty");
    }
    else{
        node temp1=head;
        temp1=temp1.next;
        head=temp1;
    }
}
public void traversal1(){
    System.out.println("\n after deletion");
    node temp1=head;

    if(head==null){
        System.out.println("empty");
    }
    else{

    while(temp1!=null){
        System.out.print(temp1.data+" ");
        temp1=temp1.next;
    }
    
}
}





}
class ttttt{
    public static void main(String[] args) {
        deletion obj=new deletion();
        obj.creation();
        obj.traversal();
        obj.delete();
        obj.traversal1();
    }
}
