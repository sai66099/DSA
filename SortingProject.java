import java.util.*;

public class SortingProject {
    public static void main(String[] args) {
        Student[] students = {
            new Student("krishna",100),
            new Student("ram",99),
            new Student("laxman",98),
            new Student("shiva",97)
        };
        sorting(students);
    }
    
    public static void sorting(Student[] students) {
        //bubble sort
        for (int i = 0; i < students.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].marks < students[j + 1].marks) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("Exam leader board");

        for (int i = 0; i < students.length; i++) {
            System.out.println(i+1 + ": Name - " + students[i].name + ", Marks - " + students[i].marks);
        }
    }
}