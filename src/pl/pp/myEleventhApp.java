package pl.pp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student {

    private String indexNumber;
    private String firstName;
    private String lastName;
    private List<Integer> grades;

    public Student(String indexNumber, String firstName, String lastName, List<Integer> grades) {
        this.indexNumber = indexNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double calculateAverage() {

        int sum = 0;

        for (int grade : grades) {
            sum = sum + grade;
        }

        return (double) sum / grades.size();
    }
}

public class myEleventhApp {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(

                new Student("12345", "Jan", "Kowalski",
                        Arrays.asList(4, 5, 3, 5)),

                new Student("67890", "Anna", "Nowak",
                        Arrays.asList(5, 5, 4, 4)),

                new Student("54321", "Pawel", "Wisniewski",
                        Arrays.asList(2, 3, 2, 4)),

                new Student("09876", "Katarzyna", "Kowalczyk",
                        Arrays.asList(5, 4, 4, 5))
        );

        Student bestStudent = students.get(0);

        for (Student student : students) {

            if (student.calculateAverage() > bestStudent.calculateAverage()) {

                bestStudent = student;
            }
        }

        System.out.println("Student with the highest average: "
                + bestStudent.getFirstName() + " "
                + bestStudent.getLastName() + " ("
                + bestStudent.getIndexNumber() + ") - Average: "
                + bestStudent.calculateAverage());

        students.sort(Comparator.comparing(Student::getLastName));

        System.out.println("\nStudents sorted by last names:");

        for (Student student : students) {

            System.out.println(student.getFirstName() + " "
                    + student.getLastName() + " ("
                    + student.getIndexNumber() + ") - Average: "
                    + student.calculateAverage());
        }
    }
}