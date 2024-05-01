package academy.learningdsa.Lists;

import java.util.NoSuchElementException;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size = 0;

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if (head == null){
            head = node;
            tail = node;
            size++;
        }else {
            head.setPrev(node);
            node.setNext(head);
            head = node;
            size++;
        }
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if (tail == null){
            addToFront(employee);
        } else{
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
            size++;
        }
    }

    public EmployeeNode removeFromFront(){
        if (head == null){
            throw new NoSuchElementException("No elements to remove in an empty Linked List");
        }
        EmployeeNode temp = head;
        head = head.getNext();
        temp.setNext(null);
        head.setPrev(null);
        size--;
        return temp;
    }

    public EmployeeNode removeFromEnd(){
        if (tail == null){
            throw new NoSuchElementException("No elements to remove in an empty Linked List");
        } else{
            EmployeeNode temp  = tail;
            tail = tail.getPrev();
            tail.setNext(null);
            temp.setPrev(null);
            size--;
            return temp;
        }
    }

    public void printList(){
        EmployeeNode current = head;
        while ( current != null){
            System.out.println(current.getEmployee());
            current = current.getNext();
        }
    }

    public static void main(String[] args) {

        EmployeeDoublyLinkedList employeeDoublyLinkedList = new EmployeeDoublyLinkedList();
        employeeDoublyLinkedList.addToEnd(new Employee("Uriel","Madrigal", 1234));
        employeeDoublyLinkedList.addToEnd(new Employee("Elsa", "Garzon", 4567));
        employeeDoublyLinkedList.addToEnd(new Employee("Juan", "Garcia", 6987));
        employeeDoublyLinkedList.removeFromEnd();

        //employeeDoublyLinkedList.printList();
        //System.out.println(employeeDoublyLinkedList.getSize());

        System.out.println(employeeDoublyLinkedList.tail.getNext());

    }
}
