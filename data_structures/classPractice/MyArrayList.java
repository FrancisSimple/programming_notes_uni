public class MyArrayList<T> {
    private T[] data; // Internal array to store elements of type T
    private int size; // Current number of elements in the list
    private static final int INITIAL_CAPACITY = 10; // Default initial capacity

    // Default constructor
    @SuppressWarnings("unchecked")
    public MyArrayList() {
        data = (T[]) new Object[INITIAL_CAPACITY]; // Create an array of type T with default capacity
        size = 0;
    }

    // Constructor with specified initial capacity
    @SuppressWarnings("unchecked")
    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Initial capacity cannot be negative");
        }
        data = (T[]) new Object[initialCapacity]; // Create an array of type T with specified capacity
        size = 0;
    }

    // Constructor that takes an array of elements
    @SuppressWarnings("unchecked")
    public MyArrayList(T[] elements) {
        if (elements == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        data = (T[]) new Object[elements.length]; // Create a new array of the same size
        // Manually copy elements from the input array to the internal array
        for (int i = 0; i < elements.length; i++) {
            data[i] = elements[i];
        }
        size = elements.length; // Set the size to the number of elements
    }

    // Add an element to the end of the list
    public void add(T element) {
        if (size == data.length) {
            resize(); // Resize the array if it's full
        }
        data[size] = element;
        size++;
    }

    // Resize the internal array
    @SuppressWarnings("unchecked")
    private void resize() {
        int newCapacity = data.length * 2; // Double the capacity
        T[] newData = (T[]) new Object[newCapacity]; // Create a new array of type T
        // Manually copy elements from the old array to the new array
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData; // Replace the old array with the new one
    }

    // Get the element at a specific index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return data[index];
    }

    // Remove the element at a specific index and return it
    @SuppressWarnings("unchecked")
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        T removedElement = data[index];
        size--; // Decrement the size
        //new list with the size
        T[] newData = (T[]) new Object[size];
        // Shift elements to the left to fill the gap
        index = 0;
        for (T element: data) {
            if (element != removedElement && index < size) {
                newData[index] = element;
                index++;
            }
        }
        data = newData;
        
        return removedElement;
    }

    // Get the current size of the list
    public int size() {
        return size;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Display the list contents
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // Update the element at a specific index
    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        data[index] = element;
    }
}