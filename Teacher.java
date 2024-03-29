
// This class is responsible for keeping track of the teacher's
// name salary & id

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    // There will be different salaries for each teacher
    // Therefore I need to find a way to code that.
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }


    // Returns the name of the Teacher.
    public String getName(){
        return this.name;
    }

    // Returns the ID of the Teacher.
    public int getId(){
        return id;
    }

    // Returns the Salary of the Teacher.
    public int getSalary(){
        return salary;
    }


    // Sets the salary of the teacher.
    public void setSalary(int salary){
        this.salary = salary;
    }

    // Adds to the salary
    // Removes from the total money earned from the school.
    public void receiveSalary(int salary){

        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }
}
