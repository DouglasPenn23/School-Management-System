public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Not going to alter student's name, students id

    // Used to update the students grade.
    // @Param grade new grade of the student.

    public void setGrade(int grade){
        this.grade=grade;

    }

    // This method is going to
    // Add the fees to the fees paid field
    // if initially 0 & they pay 10,000 the fees paid should be 10,000
    // If they pay another 5k, they should have 15000 paid
    // So they want a var to keep adding the fees to feespaid
    // The school is going to receive the funds.

    public void updateFeesPaid(int fees){
        feesPaid += fees;
    }

    // Generated Getters Below for Attributes.
    // Getters are used to protect your data.
    // They help with Encapsulation.

    // Returns the ID.
    public int getId() {
        return id;
    }

    // Returns the Name.
    public String getName() {
        return name;
    }

    // Returns the Grade.
    public int getGrade() {
        return grade;
    }

    // Returns the Fees Paid.
    public int getFeesPaid() {
        return feesPaid;
    }

    // Returns the fees total.
    public int getFeesTotal() {
        return feesTotal;
    }


}
