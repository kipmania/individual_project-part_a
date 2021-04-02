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
public class Student {

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.lastName);
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
        final Student other = (Student) obj;
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        return true;
    }
    private String firstName;
    private String lastName;
    private DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private LocalDate dateOfBirth ;
    private double tuitionFees;
    private ArrayList<Assigment> assigment= new ArrayList<Assigment>();
    //private int year;private int month;private int day;
    
    
    public Student(String firstName, String lastName,String inputDate, double tuitionFees) { 
         
        this.firstName = firstName;
        this.lastName = lastName;
        //this.dateOfBirth = dateOfBirth;
        
        this.tuitionFees = tuitionFees;
        
        try{
        dateOfBirth = LocalDate.parse(inputDate, format);
                }
        catch (DateTimeParseException e){
            System.err.println("Wrong date format  (format DD-MM-YYYY)");}
        
        }
    
    public void addAssigment(Assigment assigment){
    this.assigment.add(assigment);
    }
    public ArrayList<Assigment> getAssigment (){
    return assigment;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String inputDate) throws DateTimeParseException{
        dateOfBirth= LocalDate.parse(inputDate, format);
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) throws NumberFormatException {
        this.tuitionFees = tuitionFees;
    }
    
    
}
