package Contacts;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import node.Node;
import person.Person;


    public class MyContactList {
        Scanner sc = new Scanner(System.in);

        private int size;
        private Node head;
        private Node tail;

        MyContactList() {
            head = null;
            size = 0;
        }

        public boolean isEmpty() {
            if (size == 0)
                return true;

            return false;
        }

        public void addContact() {
            char choice;

            System.out.println("You have chosen to add a new contact : ");

            System.out.print("First Name :");
            String fn = sc.nextLine();

            System.out.print("Last Name :");
            String ln = sc.nextLine();

            boolean a = true;
            ArrayList<String> cn = new ArrayList<>();

            do {
                String regex = "[0]?(\\+91)?[6-9][0-9]{9}";
                Pattern p = Pattern.compile(regex);

                while (a) {
                    System.out.print("Contact Number :");
                    String no = sc.nextLine();
                    if (no.matches(regex)) {
                        cn.add(no);
                        a = false;
                    } else
                        System.out.println("Enter valid phone number.");
                }
                System.out.print("Would you like to add another contact number? (y/n) :");
                choice = sc.next().charAt(0);
                sc.nextLine();
                a = true;
            }
            while (choice == 'y');


            String eid = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
            Pattern p = Pattern.compile(eid);
            a = true;
            String email = null;
            while (a) {
                System.out.print("Email ID :");
                String id = sc.nextLine();
                if (id.matches(eid)) {
                    email = id;
                    a = false;
                } else
                    System.out.println("Enter valid email.");
            }


            Node node = new Node(new Person(fn, ln, cn, email));

            if (isEmpty()) {
                node.setPrevious(null);
                node.setNext(null);
                head = node;
                tail = node;
            } else {

                Node head_t = head;
                for (int i = 0; i < size; i++) {
                    if ((node.getData().getF_name() + node.getData().getL_name()).compareToIgnoreCase((head_t.getData().getF_name() + head_t.getData().getL_name())) <= 0) {
                        if (head_t == head) {
                            node.setPrevious(null);
                            node.setNext(head);
                            head.setPrevious(node);
                            head = node;
                        } else {
                            node.setPrevious(head_t.getPrevious());
                            node.setNext(head_t);
                            head_t.getPrevious().setNext(node);
                            head_t.setPrevious(node);
                        }
                    } else if (head_t == tail) {
                        node.setNext(null);
                        node.setPrevious(tail);
                        tail.setNext(node);
                        tail = node;
                    }
                    head_t = head_t.getNext();
                }

            }

            size++;

            System.out.println("Added Successfully !\n\n");

        }


    }