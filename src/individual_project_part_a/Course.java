/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individual_project_part_a;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author JOHN
 */
public class Course {


    private String title;
    private String stream;
    private String type;
    //private Date start_date = new Date(0, 0, 0, 0, 0, 0);
    //private Date end_date= new Date(0, 0, 0, 23, 59, 59);
    private LocalDate start_date;
    private LocalDate end_date;
    private DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private final ArrayList<Student> students = new ArrayList<>();
    private final ArrayList<Trainer> trainers = new ArrayList<>();
    private final ArrayList<Assigment> assigments = new ArrayList<>();
    int yearEnd;
    int yearStart;
    int monthEnd;
    int monthStart;
    int dayEnd;
    int dayStart;

    public Course(String title, String stream, String type, String dateStart, String dateEnd) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        try {
            start_date = LocalDate.parse(dateStart, format);
            end_date = LocalDate.parse(dateEnd, format);
        } catch (DateTimeParseException e) {
            System.err.println("Wrong date format  (format DD-MM-YYYY)");
        }

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.title);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }

public void addTrainer(Trainer trainer){
    this.trainers.add(trainer);
    }
    public void addStudent(Student student){
    this.students.add(student);
    } 
    public void addAssigment(Assigment assigment){
    this.assigments.add(assigment);
    } 
    public ArrayList<Assigment> getAssigments(){
    return this.assigments;
    }
    public ArrayList<Student> getStudents(){
    return this.students;
    }
    public String getStudentsNames(){
        for (int i=0; i<students.size();i++) {
            return students.get(i).getLastName();
        }
    return "";
    }
    
    public ArrayList<Trainer> getTrainers(){
    return this.trainers;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }
  
    
}
