import java.util. *;

class TestIterator{
    public static void main(String[] args){
        Collection<String> collection = new ArrayList<String>();
        collection.add("Accra");
        collection.add("Kumasi");
        collection.add("Tamale");
        collection.add("Takoradi");
        collection.add("Ho");
        collection.add("Sunyani");

        collection.forEach(e -> System.out.print(e.toUpperCase() + " "));
    }
}

