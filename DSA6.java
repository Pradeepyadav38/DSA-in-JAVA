import java.util.Scanner;

class insertion {
    public class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    node head = null;

    public void creation() {
        int press;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the value: ");
            int data = sc.nextInt();
            node newnode = new node(data);
            if (head == null) {
                head = newnode;
            } 
            else 
            {
                System.out.println("Insertion :\n 1.Beginning \n 2.Specific Position \n 3.At end \n 4.Exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        newnode.next = head;
                        head = newnode;
                        break;

                    case 2:
                        node temp1 = head;
                        System.out.println("Enter the position where you want to insert: ");
                        int pos = sc.nextInt();
                        for (int i = 0; i < pos-1; i++) {
                            temp1 = temp1.next;
                        }
                        newnode.next = temp1.next;
                        temp1.next = newnode;
                        break;
                    case 3:
                        node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = newnode;
                        break;
                    
                       
                }
            }
            System.out.println("Press 0 if you want to insert again: \nPress any Key if you want to Print: ");
            press = sc.nextInt();

        } 
        while (press == 0);

    }

    public void traversal() {
        node temp = head;
        System.out.println("LINKED LIST");
        while (temp != null) {
            System.out.print(+temp.data+" ");
            temp = temp.next;
        }

    }

}

class tempp {
    public static void main(String[] args) {
        insertion obj = new insertion();
        obj.creation();
        obj.traversal();
    }
}
