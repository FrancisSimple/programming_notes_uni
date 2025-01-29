import java.util.*;

class TestLists{
    public static void main(String[] args){
        // testing the arraylist
        List<String> list = new ArrayList<String>();
        list.add("Accra");
        list.add("Kumasi");
        list.add("Tamale");
        System.out.println(list);

        // testing the linkedlist
        LinkedList<Object> linkedList = new LinkedList<Object>(list);
        linkedList.add(1,"Takoradi");
        linkedList.removeLast();
        linkedList.addFirst("Ho");
        System.out.println(linkedList);
        System.out.println(list);
    }
}