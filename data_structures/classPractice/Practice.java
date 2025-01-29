
import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

        //using the methods sample
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3));


        //using the defined methods.
        print_objects(list);

        //using the wildcard method
        System.out.println("Using wildcard method");
        printList(list);

    }

    static <E> void print_objects(List<E> list) {

        for (E element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static void printList(List<?> list) {
        
        for (Object element : list) {
            System.out.print(element+ " ");
        }
        System.out.println();
    }
}
