package academy.learningdsa.Lists;

import java.util.NoSuchElementException;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size = 0;

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while(current != null){
            System.out.print(current.getEmployee() + " - > ");
            current = current.getNext();
        }
    }

    public  void addToFront(Employee employee){

        EmployeeNode node = new EmployeeNode(employee);

        if ( getSize() == 0){
            head = node;
            size++;
        }else {
            node.setNext(head);
            head = node;
            size++;
        }
    }

    public EmployeeNode removeFromFront(){
        if (isEmpty()) {
            throw new NoSuchElementException("There is not elements in the list to remove");
        } else if (getSize() == 1) {
            head = null;
            this.size--;
            return  head;
        }
        EmployeeNode temp = head;
        head = temp.getNext();
        temp.setNext(null);
        this.size--;
        return temp;

    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        EmployeeNode current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(node);
        this.size++;
    }

    public EmployeeNode removeAtAEnd(){
        if (isEmpty()) {
            throw new NoSuchElementException("There is not elements in the list to remove");
        } else if (getSize() == 1) {
            removeFromFront();
        }
        EmployeeNode current = head;
        while(current.getNext().getNext() != null){
            current = current.getNext();
        }
        EmployeeNode temp = current.getNext();
        current.setNext(null);
        this.size--;
        return temp;


    }

    public static void main(String[] args) {

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();

        employeeLinkedList.addToFront(new Employee("Uriel", "Madrigal", 1234));
        employeeLinkedList.addToFront(new Employee("Elsa", "Garzon", 4321));
        employeeLinkedList.addToFront(new Employee("John", "Doe", 5246));

        employeeLinkedList.printList();
        System.out.println(employeeLinkedList.getSize());
        System.out.println(" ");

        employeeLinkedList.removeFromFront();
        System.out.println(" ");
        employeeLinkedList.printList();
        System.out.println(employeeLinkedList.getSize());

        employeeLinkedList.addToEnd(new Employee("Gabriel", "Soto", 9598));
        System.out.println(" ");
        employeeLinkedList.printList();
        System.out.println(employeeLinkedList.getSize());

        System.out.println(" ");
        employeeLinkedList.removeAtAEnd();
        employeeLinkedList.printList();
        System.out.println(employeeLinkedList.getSize());




    }
}
