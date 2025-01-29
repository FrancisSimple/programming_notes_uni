import java.util.*;

public class TestForEach {
    public static void main(String[] args) {
        Collection<String> myCollection = new ArrayList<>();
        myCollection.add("Zongo");
        myCollection.add("Zongo2");
        myCollection.add("Zongo3");

        /*
         * this is another method in the collection
         * it can be used at the place of iterator
         * use it when a simple "void" operation needs to be done.
         */
        myCollection.forEach(e -> System.out.println(e));
    }
}

//output
/*
    Zongo
    Zongo2
    Zongo3
 */

