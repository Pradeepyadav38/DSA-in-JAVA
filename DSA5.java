import java.util.Scanner;

class singlelinklist {
    public class node { // node creation in linkedlist
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    node head = null; // for head is equal to null

    public void creation() {
        int choi;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("enter the value: ");
            int data = sc.nextInt();
            node newnode = new node(data); //passing value of data means node via consructor
            if (head == null) {
                head = newnode;  //putting first node value to the head
            } else {
                newnode.next = head; 
                head = newnode;
            }

            System.out.println("if you want to insert again, press 1:");
            choi = sc.nextInt();
        }

        while (choi == 1);

    }

    public void traversal() {
        node temp = head;
        if (head == null) {
            System.out.println("empty linked list");
        }
         else
          {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

}

class si {
    public static void main(String[] args) {
        singlelinklist obj = new singlelinklist();
        obj.creation();
        obj.traversal();
    }
}
