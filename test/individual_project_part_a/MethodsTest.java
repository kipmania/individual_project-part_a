/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individual_project_part_a;

import java.time.LocalDate;
import org.junit.Test;

/**
 *
 * @author kopan
 */
public class MethodsTest {
    
    public MethodsTest() {
    }

    /**
     * Test of printListOfCourses method, of class Methods.
     */
    @Test
    public void testPrintListOfCourses() {
        System.out.println("printListOfCourses");
        Methods.printListOfCourses();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of printStudentsTrainersAssigmentsPerCourse method, of class Methods.
     */
    @Test
    public void testPrintStudentsTrainersAssigmentsPerCourse() {
        System.out.println("printStudentsTrainersAssigmentsPerCourse");
        Methods.printStudentsTrainersAssigmentsPerCourse();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkSubmissionsPeriod method, of class Methods.
     */
    @Test
    public void testCheckSubmissionsPeriod() {
        System.out.println("checkSubmissionsPeriod");
        Methods.checkSubmissionsPeriod();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkPeriod method, of class Methods.
     */
    @Test
    public void testCheckPeriod() {
        System.out.println("checkPeriod");
        LocalDate date = null;
        Methods.checkPeriod(date);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of printMultipleCourseStudents method, of class Methods.
     */
    @Test
    public void testPrintMultipleCourseStudents() {
        System.out.println("printMultipleCourseStudents");
        Methods.printMultipleCourseStudents();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of printEachStudentAssigments method, of class Methods.
     */
    @Test
    public void testPrintEachStudentAssigments() {
        System.out.println("printEachStudentAssigments");
        Methods.printEachStudentAssigments();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of fillCourse method, of class Methods.
     */
    @Test
    public void testFillCourse() {
        System.out.println("fillCourse");
        String title = "kop";
        String stream = "ioannis";
        String type = "java";
        String start_date = "10-01-2020";
        String end_date = "20-04-2020";
        Methods.fillCourse(title, stream, type, start_date, end_date);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of fillStudent method, of class Methods.
     */
    @Test
    public void testFillStudent() {
        System.out.println("fillStudent");
        String next = "thanasis";
        String next0 = "polimixanos";
        String inputDate = "20-05-1990";
        double nextDouble = 500.0;
        Methods.fillStudent(next, next0, inputDate, nextDouble);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of fillTrainer method, of class Methods.
     */
    @Test
    public void testFillTrainer() {
        System.out.println("fillTrainer");
        String next = "";
        String next0 = "";
        String next1 = "";
        Methods.fillTrainer(next, next0, next1);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of fillAssigment method, of class Methods.
     */
    @Test
    public void testFillAssigment() {
        System.out.println("fillAssigment");
        String next = "";
        String next0 = "";
        String input = "";
        Methods.fillAssigment(next, next0, input);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of makeReferenceStudentToCourse method, of class Methods.
     */
    @Test
    public void testMakeReferenceStudentToCourse() {
        System.out.println("makeReferenceStudentToCourse");
        Methods.makeReferenceStudentToCourse();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of makeReferenceTrainerToCourse method, of class Methods.
     */
    @Test
    public void testMakeReferenceTrainerToCourse() {
        System.out.println("makeReferenceTrainerToCourse");
        Methods.makeReferenceTrainerToCourse();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of makeReferenceAssigmentToCourse method, of class Methods.
     */
    @Test
    public void testMakeReferenceAssigmentToCourse() {
        System.out.println("makeReferenceAssigmentToCourse");
        Methods.makeReferenceAssigmentToCourse();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of makeReferenceAssigmentToStudent method, of class Methods.
     */
    @Test
    public void testMakeReferenceAssigmentToStudent() {
        System.out.println("makeReferenceAssigmentToStudent");
        Methods.makeReferenceAssigmentToStudent();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of assignStudentToMultipleCourses method, of class Methods.
     */
    @Test
    public void testAssignStudentToMultipleCourses() {
        System.out.println("assignStudentToMultipleCourses");
        Methods.assignStudentToMultipleCourses();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of fillingDBProcess method, of class Methods.
     */
    @Test
    public void testFillingDBProcess() {
        System.out.println("fillingDBProcess");
        Methods.fillingDBProcess();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of syntheticData method, of class Methods.
     */
    @Test
    public void testSyntheticData() {
        System.out.println("syntheticData");
        Methods.syntheticData();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of printListOfStudents method, of class Methods.
     */
    @Test
    public void testPrintListOfStudents() {
        System.out.println("printListOfStudents");
        Methods.printListOfStudents();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of printListOfTrainers method, of class Methods.
     */
    @Test
    public void testPrintListOfTrainers() {
        System.out.println("printListOfTrainers");
        Methods.printListOfTrainers();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of printListOfAssigments method, of class Methods.
     */
    @Test
    public void testPrintListOfAssigments() {
        System.out.println("printListOfAssigments");
        Methods.printListOfAssigments();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
