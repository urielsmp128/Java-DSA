package academy.learningdsa.hastables;

public class SimpleHashtable {

    private Employee[] hashtable;

    public SimpleHashtable(){
        hashtable = new Employee[10];
    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null){
            System.out.println("Srry, there's already an employee at position " + hashedKey);
        }else {
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    public void printHashtable(){
        for(Employee employee: hashtable){
            System.out.println(employee);
        }
    }


}
