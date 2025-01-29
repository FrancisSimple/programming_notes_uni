class Test {
    public <T> void m1() { // Generic method without parameters
    try {
            T instance = (T) new Object();
            System.out.println("Created an instance of type: " +
            instance.getClass().getName());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.<String>m1(); // Specify the type parameter as String
        test.<Integer>m1(); // Specify the type parameter as Integer
    }
}

