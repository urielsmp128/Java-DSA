package academy.learningdsa.hastables;

public class SimpleHashtable {

    private StoredEmployee[] hashtable;

    public SimpleHashtable(){
        hashtable = new StoredEmployee[10];
    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    private boolean occupied(int index){
        return  hashtable[index] != null;
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);

        //Linear probing implementation
        if(occupied(hashedKey)){
            int stopIndex = hashedKey;
            if(hashedKey == hashtable.length -1){
                hashedKey = 0;
            }else{
                hashedKey++;
            }
            while (occupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (occupied(hashedKey)){
            System.out.println("Srry, there's already an employee at position " + hashedKey);
        }else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    private int findKey(String key){
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }
        if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
            return  hashedKey;
        }else{
            return -1;
        }
    }

    public Employee get(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }
        return hashtable[hashedKey].employee;
    }

    public Employee remove(String key){
        int hashedKey = findKey(key);
        if (hashedKey == -1){
            return null;
        }

        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;
        return employee;
    }

    public void printHashtable(){
        for(int i = 0; i < hashtable.length;i++){
            if(hashtable[i] == null){
                System.out.println("empty");
            }else {
                System.out.println(hashtable[i].employee);
            }
        }
    }

}
