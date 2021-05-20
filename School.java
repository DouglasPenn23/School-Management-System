import java.util.List;

// School has
// Teachers, Students, Total Money Earned, Total Money Spent - (Teacher's Salary)
// School can have many teachers, many students
// Going to implement using an ArrayList
public class School {
    // Creates a list of teachers
    private List<Teacher> teachers;
    // Creates a list of students.
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    // Constructor for our School
    // We pass two arguments into it, an ArrayList of Teachers
    // And an ArrayList of Students.
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    // Our getters for the school class.
    // Getter for our list of Teachers in the school.
    public List<Teacher> getTeachers() {
        return teachers;
    }

    // Getter for our list of students in the school.
    public List<Student> getStudents() {
        return students;
    }

    // Getter for our total money Earned.
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

//    public void updateTotalMoneyEarned(int MoneyEarned){
//        totalMoneyEarned += MoneyEarned;
//    }

    // Getter for our total money Spent.
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    // This begins our list of setter for the school class.

    // Setter for our list of teachers.

    // Changed this to add Teacher
    // Not going to pass in a List of Teachers so took it out
    // Adds a Teacher to the school.
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // Setter for our list of students.
    // Change from setStudents to addStudent
    // Adds a student to the school

    public void addStudent(Student student) {
        students.add(student);
    }

    // Setter for our total money earned.
    // Changed from set to update

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        // Similar to student fees paid case.
        // It keeps adding to itself as money is earned.
        totalMoneyEarned += MoneyEarned;
    }


//    // Returns the total money spent by the school.
//    public int getTotalMoneySpent() {
//        return totalMoneySpent;
//    }

    // Setter for the total money spent.
    // Update the money that is spent by the school.
    // Which is the salary given by the school to it's teachers.
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
