import java.util.Scanner;
                            ////CircularQueue using Array////
class circularqueue{
    int n=3;
    int front=-1;
    int rear=-1;
    int a[]=new int[n];
    void enqueue(){
        if(front==(rear+1)%n){
            System.out.println("overflow");
        }
        else{
            Scanner sc=new Scanner(System.in);
            System.out.println("---------------");
            System.out.print("Enter Data: ");
            int data=sc.nextInt();
            System.out.println("---------------");
            if(front==-1 && rear==-1){
                front=0;
                rear=0;
                a[rear]=data;
            }
            else{
                rear=(rear+1)%n;
                a[rear]=data;
            }
        }
    }
    void dequeue(){
        if(rear==-1 && front==-1){
            System.out.println("Underflow");
        }
        else if(front==rear){
           System.out.println("Underflow");
           front=-1;
           rear=-1;
        }
        else{
            front=(front+1)%n;
        }
    }
    void display(){
        System.out.println("-------Queue-------");
        int i=front;
       while( i!=rear){
    System.out.print(a[i]+" ");
    i=(i+1)%n;
     }
    System.out.println(a[i]);
    System.out.println("-------------------");
}

}
class cq{
    public static void main(String[] args) {
        int ch;
        System.out.println("                                   ----------------------------------");
        System.out.println("                                   ----Circular Queue Using Array----");
        System.out.println("                                   ----------------------------------");
        circularqueue obj=new circularqueue();
        Scanner scc=new Scanner(System.in);
        do{
        System.out.println("Press:- 1.Enquqe 2.Dequeue 3.Display 4.Exit ");  
        int press=scc.nextInt();
        switch(press){
            case 1:obj.enqueue();
            break;
            case 2:obj.dequeue();
            break;
            case 3:obj.display();
            break;
            case 4:
            System.out.println("Exit Successfully");
        }
        System.out.print("Press 0 --> Main Menu: ");
        ch=scc.nextInt();
    }
    while(ch==0);
    }
}
