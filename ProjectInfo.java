/**
 * The class ProjectInfo contains attributes 
 * and methods to store information about
 * the project.
 */

public class ProjectInfo {

    private String projectName; // the name of the project
    private String description; // description of project
    private String professor; // the name of the professor

    /**
     * This constructer intializes the name of the project, the description
     * and the professor that the project is prepared for
     * 
     * @param projectName The name of the project
     * @param description Description of project
     * @param professor   The name of the professor
     */

    public ProjectInfo(String projectName, String description, String professor) {
        this.description = description;
        this.projectName = projectName;
        this.professor = professor;
    }

    /**
     * The copy constructer intializes the object
     * as a copy of another ProjectInfo object
     * 
     * @param ProInfo the object to copy
     */

    public ProjectInfo(ProjectInfo ProInfo) {
        description = ProInfo.description;
        projectName = ProInfo.projectName;
        professor = ProInfo.professor;

    }

    /**
     * The set method sets a value for each field.
     * 
     * @param projectName The name of the project
     * @param description Description of project
     * @param professor   The name of the professor
     */

    public void Set(String projectName, String description, String professor) {
        this.projectName = projectName;
        this.description = description;
        this.professor = professor;
    }

    /**
     * toString method
     * 
     * @return A string containing the project's
     *         information.
     */

    public String toString() {
        String describe = " " + projectName 
        + "\n" + description 
        + "\n\nPrepared for " + professor;

        return describe;
    }

}
