import java.util.Scanner;
                            ////Stack operation Using Array////
class stackarray{
    int n;
    int top;
    int arr[]=new int[10];
    public void push(){
        if(top==n-1){
            System.out.print("overflow");
        }
        else{
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter item:");
            int item=sc.nextInt();
            top=top+1;
            arr[top]=item;
            System.out.print("Item inserted");
        }
    }
    public void pop(){
        if(top==-1){
            System.out.print("underflow");
        }
        else{
            top=top-1;
            System.out.print("item deleted");
        }
    }
    public void display(){
        for(int j=top;j>0;j--){
            System.out.print(arr[j]+" ");
        }
    }
}
class stackcheck{
    public static void main(String[] args) {
        int press;
        stackarray obj=new stackarray();
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
        press=scc.nextInt();
    }
    while(press==0);
    }
}