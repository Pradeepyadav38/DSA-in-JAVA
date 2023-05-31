import java.util.Scanner;

class arraydelete{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter the elements: ");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The elements are: ");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        //Deletion//
        System.out.println("\nEnter the position where you want to delete: ");
        int pos=sc.nextInt();
        int b[]=new int[size-1];
        for(int i=0;i<size;i++){
            if(i<pos){
                b[i]=a[i];
            }
            else if(i==pos){
                continue;
            }
            else{
                b[i-1]=a[i];
            }
        }
        System.out.println("after delelting elements are: ");
        for(int i=0;i<size-1;i++){
            System.out.print(b[i]+" ");
        }
    }
}