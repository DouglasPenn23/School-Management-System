import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creates the teachers for the school.
        Teacher garrett = new Teacher(1, "Garrett", 700);
        Teacher jack   = new Teacher(2, "Jack", 700);
        Teacher monique = new Teacher(3, "Monique", 700);

        // Creates a list of teachers.
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(garrett);
        teacherList.add(jack);
        teacherList.add(monique);

        // Creates the students for the school.
        Student jimmy = new Student(1, "Jimmy", 4);
        Student timmy = new Student(2, "Timmy", 5);
        Student bobby = new Student(3, "Bobby", 12);

        // Create the list for students.
        List<Student> studentList = new ArrayList<>();
        studentList.add(jimmy);
        studentList.add(timmy);
        studentList.add(bobby);


        // Creates the school.
        School oakHarborHighSchool = new School(teacherList, studentList);
        System.out.println("Oak Harbor High School has earned: $" + oakHarborHighSchool.getTotalMoneyEarned());


        jimmy.payFees(5000);
    }
}
