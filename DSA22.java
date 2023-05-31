import java.util.Scanner;
                            ////Queue Data structure using Linked List////
class linkedqueue{
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node front =null;
    node rear=null;

    void enqueue(){
        int press;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("Enter the value: ");
        int data=sc.nextInt();
        node newnode=new node(data);
        if(front==null){
                front=newnode;
                rear=newnode;
            }
        else{
           node temp=front;
           while(temp.next!=null){
            temp=temp.next;
           }
           temp.next=newnode;
           newnode.next=null;
        }
    
    System.out.print("press 1:");
    press=sc.nextInt();
}
while(press==1);
    }


    void dequeue(){
        if(front==null && rear==null){
            System.out.println("underflow ");
        }
        else{
            front=front.next;
        }
    }



    void display(){
        node temp=front;
        while(front!=null){
            System.out.print(front.data+" ");
            front=front.next;
        }
    }
}
class quq{
    public static void main(String[] args) {
        linkedqueue obj=new linkedqueue();
        int presss;
       
        Scanner scc=new Scanner(System.in);
        do{
        System.out.println("Press : 1.Enqueue 2.dequeue 3.Display 4.Exit");
        int ch=scc.nextInt();
        switch(ch){
            case 1:
            obj.enqueue();
            break;
            case 2:
            obj.dequeue();
            break;
            case 3:
            obj.display();
            break;
            case 4:
            System.out.println("Exit Successfully");
        }
        System.out.println("\nPress 0: For Main Menu");
        presss=scc.nextInt();
    }
    while(presss==0);
    }
    }
