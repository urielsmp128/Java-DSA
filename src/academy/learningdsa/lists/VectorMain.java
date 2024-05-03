package academy.learningdsa.lists;

import java.util.List;
import java.util.Vector;

public class VectorMain {

    public static void main(String[] args) {

        // Just looking at the Vector interface implementation, and how its methods are synchronized
        List<Employee> employeeList = new Vector<>();

        // Every operation or method is pretty much the same so no need to implement it
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add((new Employee("John", "Doe", 4567)));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

    }
}
