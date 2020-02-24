package node;

import person.Person;

public class Node {

    private Person data;
    private Node next;
    private Node previous;

    public Node(Person data) {
        this.data = data;
    }

}