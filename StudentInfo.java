/**
 * The class StudentInfo contains attributes
 * and methods to store information 
 * about the students
 */

public class StudentInfo {

    private String student1; // student name
    private String student2; // student ID

    /**
     * This constructer intializes the student's
     * names, ID's, and E-mail's
     * @param name  The student's name
     * @param ID    The student's ID
     * @param email The student's email
     */

    public StudentInfo(String student1, String student2) {
        this.student1 = student1;
        this.student2 = student2;
    }

    /**
     * The copy constructor initializes the object as
     * a copy of another StudentInfo object.
     * 
     * @param StuInfo The object to copy.
     */

    public StudentInfo(StudentInfo StuInfo) {
        student1 = StuInfo.student1;
        student2 = StuInfo.student2;
    }

    /**
     * The set method sets a value for each field.
     * @param student1  The student's name
     * @param student2    The student's ID
     */

    public void Set(String student1, String student2) {
        this.student1 = student1;
        this.student2 = student2;
    }

    /**
     * toString method
     * 
     * @return A string containing the student's
     *         information.
     */

    public String toString() {
        String str = "Names:\t\t\t\t\t\t\t ID Number: \t\t\t\t\t\t\t Emails:" 
        + student1 + student2;

        return str;
    }
}