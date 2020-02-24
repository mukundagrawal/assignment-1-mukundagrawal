package node;

import person.Person;

public class Node {

    private Person data;
    private Node next;
    private Node previous;

    public Node(Person data) {
        this.data = data;
    }

    public Person getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setData(Person data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}