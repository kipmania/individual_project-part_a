package individual_project_part_a;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author JOHN
 */
public class Individual_project_part_A {

   public static ArrayList<Course> courses = new ArrayList<>();
   public static ArrayList<Student> students = new ArrayList<>();
   public static ArrayList<Trainer> trainers = new ArrayList<>();
   public static ArrayList<Assigment> assigments = new ArrayList<>();
  public  static HashSet<Student> mutlipleStudents = new HashSet<>();
   public static boolean check = false;

    public static void main(String[] args) {
        
        Methods.fillingDBProcess();
        
        //Methods.syntheticData();
        if (check) {//an gemisoume tis listes xeirokinita ftiaxoume tis "has a" diasyndeseis
            Methods.makeReferenceStudentToCourse();
            Methods.makeReferenceTrainerToCourse();
            Methods.makeReferenceAssigmentToCourse();
            Methods.makeReferenceAssigmentToStudent();
            Methods.assignStudentToMultipleCourses();
        }
        Methods.printListOfStudents();
        Methods.printListOfTrainers();
        Methods.printListOfAssigments();
        Methods.printListOfCourses();
        Methods.printStudentsTrainersAssigmentsPerCourse();
        Methods.printEachStudentAssigments();
        Methods.printMultipleCourseStudents();
        Methods.checkSubmissionsPeriod();
        //Methods.checkPeriod(15, 2, 2019);

    }


}
