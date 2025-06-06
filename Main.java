   view-search-student

    static void viewStudents() {
        if (students.isEmpty()) {
        System.out.println("No students found.");
        return;
        }
        System.out.println("\n--- List of Students ---");
        for (Student s : students) {
        System.out.println(s);
        }
        }
        static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();
        for (Student s : students) {
        if (s.getId() == id) {
        System.out.println("Student Found: " + s);
        return;
        }
        }
        System.out.println("Student with ID " + id + " not found.");
    }        
import java.util.*; 
 
public class Main { 
    static Scanner sc = new Scanner(System.in); 
    static List<Student> students = new ArrayList<>(); 
 
    public static void main(String[] args) { 
        int choice; 
 
        do { 
            System.out.println("\n--- Student Management System ---"); 
            System.out.println("1. Add Student"); 
            System.out.println("2. View All Students"); 
            System.out.println("3. Search Student by ID"); 
            System.out.println("4. Delete Student"); 
            System.out.println("5. Exit"); 
            System.out.print("Enter your choice: "); 
            choice = sc.nextInt(); 
            sc.nextLine(); // Clear buffer 
 
            switch (choice) { 
                case 1: 
                    addStudent(); 
                    break; 
                case 2: 
                    viewStudents(); 
                    break; 
                case 3: 
                    searchStudent(); 
                    break; 
                case 4: 
                    deleteStudent(); 
                    break; 
                case 5: 
                    System.out.println("Exiting program. Goodbye!"); 
                    break; 
                default: 
                    System.out.println("Invalid choice! Please enter a number between 1 and 5."); 
            } 
 
        } while (choice != 5); 
    }

 delete-student
    static void deleteStudent() {
System.out.print("Enter Student ID to delete: ");
int id = sc.nextInt();
Iterator<Student> iterator = students.iterator();
while (iterator.hasNext()) {
Student s = iterator.next();
if (s.getId() == id) {
iterator.remove();
System.out.println("Student with ID " + id + " deleted successfully.");
return;
}
}
System.out.println("Student with ID " + id + " not found.");
}
}

    static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Clear buffer
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student Grade: ");
        String grade = sc.nextLine();
        students.add(new Student(id, name, grade));
        System.out.println("Student added successfully.");
        }
 main
 main
