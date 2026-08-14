import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Arun", 85));
        students.add(new Student(2, "Bala", 70));
        students.add(new Student(3, "Chandru", 95));
        students.add(new Student(4, "Dinesh", 80));

        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by marks in ascending order
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.marks - s2.marks;
            }
        });

        System.out.println("\nAfter Sorting by Marks:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
