
package individual_project_part_a;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import javafx.util.converter.LocalDateStringConverter;

/**
 *
 * @author JOHN
 */
public class Assigment {
    private String title;
    private String Description;
   // private Date subDateTime= new Date(0, 0, 0, 23, 59,59);
    private LocalDate subDateTime;
    private DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private double oralMark;
    private double totalMark;
    private ArrayList<Student> students = new ArrayList<>();
    DayOfWeek a;
    
    int subday;int submonth; int subyear;
//    public Assigment(String title, String Description, Date subDateTime) {
//        this.title = title;
//        this.Description = Description;
//        this.subDateTime = subDateTime;
//    }

    public Assigment(String title, String Description, String inputDate) {
        this.title = title;
        this.Description = Description;
        //c.set(subyear, submonth, subday, 23,59 , 59);
        try{
        subDateTime = LocalDate.parse(inputDate, format);
                }
        catch (DateTimeParseException e){
            System.err.println("Wrong date format  (format DD-MM-YYYY)");}
        
    }

    public void setStudent(Student student){
    this.students.add(student);
    
    
        //System.out.println(subDateTime2.getDayOfWeek());
    }
    
    public ArrayList<Student> getStudent (){
    return students;}
    
    public void getStudentname(){
        for (int i = 0; i < students.size(); i++) {
            System.out.println( students.get(i).getLastName());
            
        }
        //return "";
}
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
       
    }

    public String getDescription() {
       
        //subDateTime2 = LocalDate.parse("2021-3-21");
        
        
         return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public LocalDate getSubDateTime() {
         return subDateTime;
    }

    public void setSubDateTime(String input) {
      try{
        subDateTime = LocalDate.parse(input, format);
                }
        catch (DateTimeParseException e){
            System.err.println("Wrong date format  (format DD-MM-YYYY)");}
    }

    public double getOralMark() {
        return oralMark;
    }

    public void setOralMark(double oralMark) {
        this.oralMark = oralMark;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }
    
    
    
}
