import java.util.Scanner;
                        ////Stack operation Using Linked list////
class stacklinklist{
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node top=null;

    void push(){
        int press;
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter value: ");
            int data=sc.nextInt();
            node newnode=new node(data);
            if(top==null){
                top=newnode;
            }
            else{
                newnode.next=top;
                top=newnode;

            }
           
        
        
    }
    void pop(){
        if(top==null){
            System.out.println("Stack is Empty");
        }
        else{
        node temp=top;
        temp=temp.next;
        top=temp;
        }
        
    }


    void display(){
        node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
class stackusinglink{
    public static void main(String[] args) {
        int pres;
        stacklinklist obj=new stacklinklist();
        Scanner scc=new Scanner(System.in);
        do{
        System.out.println("Press : 1.Push 2.Pop 3.Display 4.Exit");
        int ch=scc.nextInt();
        switch(ch){
            case 1:
            obj.push();
            break;
            case 2:
            obj.pop();
            break;
            case 3:
            obj.display();
            break;
            case 4:
            System.out.println("Exit Successfully");
        }
        System.out.println("\nPress 0-For Main Menu");
        pres=scc.nextInt();
    }
    while(pres==0);
    }
}
    

