
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gautam
 */
public class CourseAbstractClass {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    
    public String getCourseNumber() {
        return courseNumber;   
    }
    
    public String getCourseName() {
        return courseName;
    }
    
      
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
   
    public String getPrerequisites() {
        return prerequisites;
    }

    public double getCredits() {
        return credits;
    }
    
    public abstract double setCredits(double credits){}
    

    
}
