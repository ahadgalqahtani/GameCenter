/**
 * The class Information stores data
 * about the project details and the
 * creators of the project.
 */

 public class Information{
    private ProjectInfo projectInfo; // project information
    private StudentInfo studentInfo; // student information

    /**
     * This constructor initializes the 
     * student information and the projects information
     * @param projectInfo a ProjectInfo object
     * @param studentInfo a StudentInfo object
     */

    public Information(ProjectInfo proInfo, StudentInfo stutInfo){
        projectInfo = new ProjectInfo(proInfo);
        studentInfo = new StudentInfo(stutInfo);    
    }

    /**
     * The copy constructer intializes the
     * object as another copy of Information
     * @param info the object to copy
     */

    public Information(Information info){
        projectInfo = info.projectInfo;
        studentInfo = info.studentInfo;
    }

    /**
     * A getProInfo method
     * @return A reference to a copy of the
     * project information
     */

    public ProjectInfo getProInfo(){
        return new ProjectInfo(projectInfo);
    }

     /**
     * A getStuInfo method
     * @return A reference to a copy of this
     * projects student's information
     */

    public StudentInfo getStuInfo(){
        return new StudentInfo(studentInfo);
    } 

    /**
     * A toString method
     * @return  A string containing all of the information
     * stored in the classes
     */

     public String toString(){
        String str = "Project Information: " + projectInfo + "\n\nStudent Information: \n" + studentInfo;

        return str;
     }
 }
