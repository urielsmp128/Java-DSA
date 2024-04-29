package academy.learningdsa.Lists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args){

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add((new Employee("John", "Doe", 4567)));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        // Iterating through the employee List
        for(Employee employee: employeeList){
            System.out.println(employee);
        }

        //Getting a specific employee
        System.out.println(employeeList.get(1));

        //Checking if the list is empty
        System.out.println(employeeList.isEmpty());

        //Update employee data
        employeeList.set(1, new Employee("John", "Adams", 4568));
        System.out.println("\n Update made: \n");
        for(Employee employee: employeeList){
            System.out.println(employee);
        }

        //Get the size of the list
        System.out.println("\n Size of the list: \n" + employeeList.size());

        //Transforming our list to an array of employee objects
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employeeArray){
            System.out.println(employee);
        }

        //Evaluating if an employee object exists in the employeeList
        System.out.println("\n" + employeeList.contains(new Employee("Mary", "Smith", 22)));

        //Look for an employee having the index as param
        System.out.println("\n" + employeeList.indexOf(new Employee("John", "Adams", 4568)) + "\n");

        //Remove employee from the list
        employeeList.remove(2);

        for(Employee employee: employeeList){
            System.out.println(employee);
        }


    }

}
