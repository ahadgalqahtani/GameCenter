import javax.swing.JOptionPane;

public class AboutUs {

    String description;
    String projectName;
    String professor;
    ContactUs student1;
    ContactUs student2;

    
    public AboutUs(String projectName, String description, String professor,ContactUs student1, ContactUs student2){
        this.description = description;
        this.projectName = projectName;
        this.professor = professor;
        this.student1 = student1;
        this.student2 = student2;
    }
    
    public void describe(){
        JOptionPane.showMessageDialog(null," " + projectName + "\n" +description + "\n\nPrepared for " + professor);
    }

    public void showStudent1(){
        JOptionPane.showMessageDialog(null, "Name: " + student1.name + "\nEmail: " + student1.email +
        "\nUniversity ID Number: " + student1.id, "Student Information", 0);
    }

    public void showStudent2(){
        JOptionPane.showMessageDialog(null, "Name: " + student2.name + "\nEmail: " + student2.email +
        "\nUniversity ID Number: " + student2.id, "Student Information", 0);
    }
}
