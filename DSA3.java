import java.util.Scanner;

class arrayinsert{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of an array: ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("enter the element: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("The element is");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }

                                ///////insertion//////
    int ar[]=new int[n+1];
    System.out.println("Enter the position where you want to insert: ");
    int pos=sc.nextInt();
    System.out.println("enter the value you want to insert: ");
    int val=sc.nextInt();
    for(int i=0;i<n+1;i++){
        if(i<pos){
            ar[i]=arr[i];
        }
        else if(i==pos){
            ar[i]=val;
        }
        else{
            ar[i]=arr[i-1];
        }
    }
    System.out.println("The element is");
    for(int i=0;i<n+1;i++){
        System.out.print(ar[i]+" ");
    }
    }
}
