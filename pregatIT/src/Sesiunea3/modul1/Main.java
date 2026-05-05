package Sesiunea3.modul1;

import java.util.*;

public class Main {
    public static List<Student> students = new ArrayList<>();
    public static List<Course> courses = new ArrayList<>();
    public static Map<Integer, List<String>> enrollments = new HashMap<>();


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        seedData();

        int option;
        do {
            displayMenu();
            option = scanner.nextInt();
            scanner.nextLine();



            switch(option) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 4 -> addCourse();
                case 5 -> viewCourses();
                case 6 -> enrollStudent();
                case 0 -> System.out.println("Exiting application...");
                default -> System.out.println("Invalid opiton");
            }
        }
        while(option != 0);

    }

    private static void enrollStudent() {
        System.out.println("Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Course name: ");
        String name = scanner.nextLine();


        enrollments.putIfAbsent(id, new ArrayList<>());
        enrollments.get(id).add(name);

        System.out.println("Enrollment completed.");
    }

    private static void seedData() {
        Student student1 = new Student(1, "Ana");
        student1.addGrades(10);
        student1.addGrades(6);

        Student student2 = new Student(2, "George");
        student2.addGrades(6);
        student2.addGrades(7);

        students.add(student1);
        students.add(student2);

        Course course1 = new Course("Java");
        Course course2 = new Course("C#");
        Course course3 = new Course("DDP");
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
    }

    private static void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println("There are no courses found.");
            return;
        }
        for (Course course : courses){
            System.out.println("Courses {name = " + course.getName() + "}");
        }


    }

    private static void addCourse() {
        System.out.print("Course name: ");
        String name = scanner.nextLine();

        courses.add(new Course(name));

    }

    private static void viewStudents() {
        if (students.isEmpty()){
            System.out.println("No students found");
            return;
        }
        for (Student student : students){
            System.out.println("Student {id = " + student.getId() + ", name = " + student.getName() + ", grades = " + student.getGrades() + "}");
        }

    }

    private static void addStudent() {
        System.out.print("Student ID: ");

        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Student Name: ");
        String name = scanner.nextLine();

        students.add(new Student(id, name));



    }

    private static void displayMenu() {
        System.out.println("1. Add Student");
        System.out.println("2.View Students");
        System.out.println("4. Add Courses");
        System.out.println("5. View courses");
        System.out.println("6.");
        System.out.println("0.Exit");
        System.out.println("Choose option: ");
    }
}
