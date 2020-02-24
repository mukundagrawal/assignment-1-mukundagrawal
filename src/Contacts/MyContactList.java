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

        MyContactList()
        {
            head=null;
            size=0;
        }

        public boolean isEmpty()
        {
            if(size==0)
                return true;

            return false;
        }

    }