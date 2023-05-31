import java.util.Scanner;
class delet{
    public class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node head=null;
//////////////ceation/////////////
    public void creat(){
        int ch;
    Scanner sc=new Scanner(System.in);
    do{
    System.out.print("Enter value: ");
    int data=sc.nextInt();
    node newnode=new node(data);
    if(head==null){
        head=newnode;
    }
    else{
        newnode.next=head;
        head=newnode;
    }
    System.out.println("if you want to print again press 1: ");
    ch=sc.nextInt();
}
while(ch==1);

}

/////////////deletion////////////
    public void delete(){
if(head==null){
    System.out.println("empty");
}
else{
    Scanner sc1=new Scanner(System.in);
    System.out.println("For Deletion, Press: \n1.Beginning \n2.Specific Pos \n3.End");
    int m=sc1.nextInt();
    switch(m){
        case 1:
    node temp=head;
    temp=temp.next;
    head=temp;
    break;
    case 2:
    node temp2=head;
    node ptr1=temp2.next;

    Scanner scc=new Scanner(System.in);
    System.out.println("Enter position: ");
    int pos=scc.nextInt();
    for(int i=0;i<pos-2;i++){
        while(ptr1.next!=null){
        temp2=ptr1;
        ptr1=ptr1.next;    
        }
    }
    temp2.next=ptr1.next;

    break;
    case 3: 
    node temp1=head;
    node ptr=temp1.next;
    while(ptr.next!=null){
        temp1=ptr;
        ptr=ptr.next;

    }    
    temp1.next=null;
    }
}
    }

/////////////traversal////////////    
    public void traver(){
    System.out.println("\nLinked List : ");
    node temp1=head;
    while(temp1!=null){
        System.out.print(temp1.data+" ");
        temp1=temp1.next;
    }

    }



}
class ddemo{
    public static void main(String[] args) {
        delet obj=new delet();
        obj.creat();
        obj.delete();
        obj.traver();
    }
}