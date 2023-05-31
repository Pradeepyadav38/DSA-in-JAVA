import java.util.Scanner;

class tree_creation{
    
    static node create(){
        Scanner sc=new Scanner(System.in);
        node root=null;
        System.out.println("ENter the data: ");
        int data=sc.nextInt();
        if(data==-1)
            return null;
        root=new node(data);
        System.out.println("ENter left child of the node: "+root);
        root.left=create();
        System.out.println("ENter right child of the node: "+root);
        root.right=create();
         return root;
    }
    public static void main(String[] args) {
        node root=create();
    }
}
 class node{
    int data;
    node right,left;
    node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
