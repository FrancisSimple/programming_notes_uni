import java.util.*;
public class TestIterator{
    public static void main(String[] args) {
        //creating the simple collection
        //note collection is an interface
        //arraylist is a concrete class of this interface
        Collection<String> myCollection = new ArrayList<>();
        myCollection.add("Zongo");
        myCollection.add("Zongo2");
        myCollection.add("Zongo3");

        //calling the iterator method to return an iterator for this collection.
        //each collection has an iterator that can be obetor like this.
        Iterator<String> myIterator = myCollection.iterator();
        /*
         * a better way to get the above iterator is as follows:
         * var myIterator = myCollection.iterator();
         * the var will allow the system to catch the data type at once.
         */
        //iterator is used to check availability of next item
        while (myIterator.hasNext()) {
            System.out.print("next item is "+myIterator.next());
        }
        // it checks from the door of the collection. 
        //this means the first "next item" is the first element.
        System.out.println();
    }
}

//output
/*
 * next item is Zongonext item is Zongo2next item is Zongo3
 */
