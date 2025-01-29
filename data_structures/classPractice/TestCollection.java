import java.util. *;

class TestCollection{
    public static void main(String[] args){
        ArrayList<String> mylist1 = new ArrayList<String>();
        mylist1.add("Hello");
        mylist1.add("World");
        mylist1.add("Java");
        mylist1.add("Programming");
        System.out.println("Original List: "+mylist1);
        System.out.println("Is Hello in the list? "+mylist1.contains("Hello"));
        mylist1.remove("Hello");
        System.out.println("Number of items in the list: "+mylist1.size());

        // collection now
        Collection<String> mylist2 = new ArrayList<String>();
        mylist2.add("Tokyo");
        mylist2.add("Paris");
        mylist2.add("New York");
        System.out.println("Cities inside a collection: "+mylist2);

        // creating a clone
        //this warning is to ensure that we ignore the warning on data type casting.
        @SuppressWarnings("unchecked")
        ArrayList<String> clone1 = (ArrayList<String>)mylist1.clone();
        clone1.addAll(mylist2);
        System.out.println("Cloned List: "+clone1);

    }
}