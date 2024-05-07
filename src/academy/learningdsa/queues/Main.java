package academy.learningdsa.queues;

public class Main {

    public static void main(String[] args) {

        ArrayQueue arrayQueue = new ArrayQueue(10);

        arrayQueue.add(new Employee("Jane", "Jones", 123));
        arrayQueue.add(new Employee("John", "Doe", 4567));
        arrayQueue.add(new Employee("Mary", "Smith", 22));
        arrayQueue.add(new Employee("Mike", "Wilson", 3245));
        arrayQueue.add(new Employee("Uriel", "Madrigal", 1818));

        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();

        arrayQueue.add(new Employee("Jane", "Jones", 123));

        arrayQueue.printQueue();


    }
}
