package academy.learningdsa.hastables;

public class MainChaining {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ChainedHashtable chainedHashtable = new ChainedHashtable();
        chainedHashtable.put("Jones", janeJones);
        chainedHashtable.put("Doe", johnDoe);
        chainedHashtable.put("Wilson", mikeWilson);
        chainedHashtable.put("Smith", marySmith);

        chainedHashtable.printHashtable();

    }
}
