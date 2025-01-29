import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeHours {

    public static void main(String[] args) {

        // creating the scanner object
        Scanner input = new Scanner(System.in);

        // creating an arraylist to store the employees
        ArrayList<Employee> employees = new ArrayList<Employee>();

        // creating a while loop to take number of users daily information
        boolean asking = true;
        takeUserData: while (asking) {

            // prompting the user to enter the employee's name
            System.out.print("Enter the employee's name (q to exit): ");
            String employeeName = input.next();
            // if the user enters q, the loop will break
            if (employeeName.equals("q")) {
                
                asking = false;
                break takeUserData;
            } 
            // if the user enters a name, the program will prompt the user to enter the
            // number of hours for each day
            else {
                System.out.println("Enter number of hours for employer " + employeeName);
                Employee employee = new Employee(employeeName);
                for (Day day : Day.values()) {
                    
                    // taking the number of hours for each day
                    //Error checking should the user not enter hours in integer format
                    takeHour: while (true) {
                        try {
                            // primting the day from the Day enum class
                            System.out.print(day + ": ");
                            int hours = input.nextInt();
                            employee.addHours(hours);
                            break takeHour;
                        } 
                        // error message when user enters a wrong value
                        catch (Exception e) {
                            System.out.println("Invalid input. Please enter integer value");
                            //clear the buffer
                            input.nextLine();
                            // a chance is given the user to enter correct value for that day
                            continue takeHour;
                        }
                    }

                }
                // adding the employee to the list of employees
                employees.add(employee);
            }

        }

        // printing the employee's information
        sortEmployees(employees);
        input.close();

    }

    // method that sorts employees according to hours:
    public static void sortEmployees(ArrayList<Employee> employees) {

        // getting the number of hours for each employee into a list
        ArrayList<Integer> hours = new ArrayList<Integer>();
        for (Employee employee : employees) {
            hours.add(employee.getTotalHours());
        }
        // sort the hours list using the imported collections class
        Collections.sort(hours);
        Collections.reverse(hours);
        for (int hour : hours) {
            for (Employee employee : employees) {
                if (employee.getTotalHours() == hour) {
                    employee.printMessage();
                }
            }
        }
    }

}


// employee class
class Employee {

    private String name;
    // a list of number of hours
    private ArrayList<Integer> hours = new ArrayList<Integer>();

    public Employee(String name) {
        this.name = name;
    }

    // get total hours
    public int getTotalHours() {
        int total = 0;
        for (int hour : hours) {
            total += hour;
        }
        return total;
    }

    // get name
    public String getName() {
        return name;
    }

    // adding hours to the list of hours for this employee
    public void addHours(int hour) {
        hours.add(hour);
    }

    // message showing the employee's name and total hours
    public void printMessage() {
        System.out.println("Employee: " + name + " worked for " + getTotalHours() + " hours");
    }

}
 


// day enum (class)
enum Day {
    MONDAY(), TUESDAY(), WEDNESDAY(), THURSDAY(), FRIDAY();

}
