package academy.learningdsa.hastables;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashtable ht = new SimpleHashtable();

        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);

        ht.printHashtable();
        System.out.println("-----------");

        System.out.println(ht.get("Wilson"));
        System.out.println(ht.get("Smith"));
        System.out.println("-----------");


        ht.remove("Wilson");
        ht.remove("Jones");

        System.out.println("-----------");

        ht.printHashtable();
        System.out.println("-----------");

        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
    }
}
