import java.util.Scanner;

class array{
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
    }
}