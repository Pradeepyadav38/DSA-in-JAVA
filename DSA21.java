import java.util.Scanner;
                           ////Queue Data structure using Array////
class queue{
    int n=5;
    int front=-1;
    int rear=-1;
    int a[]=new int[n];
    void enque(){
       if(rear==(n-1)){
            System.out.println(" Queue is overflow ");
        }
        else{
            Scanner sc=new Scanner(System.in);
            System.out.println("enter value: ");
            int item=sc.nextInt();
            if(front==-1 && rear==-1){
                front=0;
                rear=0;
             a[rear]=item;
                
            }
            else{
            rear=rear+1;
            a[rear]=item;
        }
    }
    }
    void deqeue(){
        if(front==-1 && rear==-1){
            System.out.println("overflow condition");
        }
        else{
            front=front+1;
        }
    }

    void display(){
        for(int i=front;i<=rear;i++){
            System.out.print(a[i]+" ");
        }
    }
}
class q{
    public static void main(String[] args) {
        int press;
        queue obj=new queue();
        Scanner scc=new Scanner(System.in);
        do{
        System.out.println("Press : 1.Enqueue 2.dequeue 3.Display 4.Exit");
        int ch=scc.nextInt();
        switch(ch){
            case 1:
            obj.enque();
            break;
            case 2:
            obj.deqeue();
            break;
            case 3:
            obj.display();
            break;
            case 4:
            System.out.println("Exit Successfully");
        }
        System.out.println("\nPress 0-For Main Menu");
        press=scc.nextInt();
    }
    while(press==0);
    }
    }
