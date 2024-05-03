package academy.learningdsa.stacks;

public class Main {

    public static void main(String[] args) {

        ArrayStack arrayStack = new ArrayStack(10);

        arrayStack.push(new Employee("Jane", "Jones", 123));
        arrayStack.push(new Employee("John", "Doe", 4567));
        arrayStack.push(new Employee("Mary", "Smith", 22));
        arrayStack.push(new Employee("Mike", "Wilson", 3245));
        arrayStack.push(new Employee("Bill", "End", 78));

        arrayStack.printStack();
        System.out.println("\n" + arrayStack.peek());
        arrayStack.pop();
        System.out.println("\n" + arrayStack.peek());
        arrayStack.pop();
        System.out.println("\n" + arrayStack.peek());
        System.out.println(arrayStack.getSize());
    }
}
