/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individual_project_part_a;

import static individual_project_part_a.Individual_project_part_A.courses;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Methods {

    static boolean check3 = true;
    static public DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void printListOfCourses() {
        System.out.println("LIST OF COURSES:");
        //System.out.println(courses.size());
        for (int i = 0; i < courses.size(); i++) {

            System.out.println(courses.get(i).getTitle());
        }
    }

    public static void printStudentsTrainersAssigmentsPerCourse() {
        for (int z = 0; z < courses.size(); z++) {
            System.out.println("COURSE " + (z + 1) + " STUDENTS:");

            for (int i = 0; i < courses.get(z).getStudents().size(); i++) {
                //   System.out.println(courses.get(z).getStudents().size());
                System.out.println(courses.get(z).getStudents().get(i).getLastName());
            }
//
            System.out.println("COURSE " + (z + 1) + " TRAINERS:");
            for (int i = 0; i < courses.get(z).getTrainers().size(); i++) {
//                System.out.println(courses.get(z).getTrainers().size());
                System.out.println(courses.get(z).getTrainers().get(i).getLastName());
            }
//
            System.out.println("COURSE " + (z + 1) + " ASSIGMENTS:");
            for (int i = 0; i < courses.get(z).getAssigments().size(); i++) {
//                System.out.println(courses.get(z).getAssigments().size());
                System.out.println(courses.get(z).getAssigments().get(i).getTitle() + " " + courses.get(z).getAssigments().get(i).getDescription());
            }
        }

    }

    public static void checkSubmissionsPeriod() {
        System.out.println("Set date for submission check");
        Scanner input = new Scanner(System.in);

        //ArrayList<Integer> date = new ArrayList<>();
//        date.add(input.nextInt());
//        System.out.println("Set month for submission check ");
//        date.add(input.nextInt());
//        System.out.println("Set year for submission check ");
//        date.add(input.nextInt());
        String dateCheck = input.next();
        LocalDate date = LocalDate.parse("01-01-1900", format);

        try {
            date = LocalDate.parse(dateCheck, format);
        } catch (DateTimeParseException e) {
            System.err.println("Wrong date format  (format DD-MM-YYYY)");
            check3 = false;
        }
        checkPeriod(date);

    }

    public static void checkPeriod(LocalDate date) {
        boolean check4 = true;
        TemporalField woy = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();

        int weekNumberCheck = date.get(woy);
        if (check3) {
            System.out.println("It's " + date.getDayOfWeek());
            System.out.println("Week of check " + weekNumberCheck);
        }
        for (int i = 0; i < Individual_project_part_A.assigments.size(); i++) {
            int weekAssigmentNumber = Individual_project_part_A.assigments.get(i).getSubDateTime().get(woy);
            if (weekNumberCheck == weekAssigmentNumber) {
                //PAIRNO APO THN SYGKEKRIMENH BDOMADA TIS KAUHMERINES
                if (Individual_project_part_A.assigments.get(i).getSubDateTime().getDayOfWeek().getValue() >= 1
                        && Individual_project_part_A.assigments.get(i).getSubDateTime().getDayOfWeek().getValue() <= 5) {
                    HashSet<Assigment> assign = new HashSet<>(Individual_project_part_A.assigments);
                    Individual_project_part_A.assigments.get(i).getStudentname();
                    check4 = false;
                }
            }
        }
        if (check4) {
            System.out.println("No match!!");
        }
    }

    //    public static void checkPeriod(int c, int b, int a) {
    //        Date inputDate = new Date(a - 1900, b - 1, c);
    //
    //        StringBuilder str = new StringBuilder("MERA: ");
    //
    //        if (inputDate.getDay() == 1) { //DEYTERA
    //            System.out.println(str.append(inputDate));
    //            Date inputDate2 = new Date(a - 1900, b - 1, c + 5);
    //            System.out.println("Checking dates after " + inputDate + " and before " + inputDate2);
    //            for (int i = 0; i < Individual_project_part_A.assigments.size(); i++) {
    //                //ELEGXOS GIA DUE DATE APO DEYTERA EVS PARASKEYH
    //                if (Individual_project_part_A.assigments.get(i).getSubDateTime().after(inputDate) && Individual_project_part_A.assigments.get(i).getSubDateTime().before(inputDate2)) {
    //                    HashSet<Assigment> assign = new HashSet<>(Individual_project_part_A.assigments);
    //                    Individual_project_part_A.assigments.get(i).getStudentname();
    //
    //                }
    //            }
    //        } else if (inputDate.getDay() == 2) {//TRITH
    //            System.out.println(str.append(inputDate));
    //            Date inputDate3 = new Date(a - 1900, b - 1, c - 1);
    //            Date inputDate4 = new Date(a - 1900, b - 1, c + 4);
    //            System.out.println("Checking dates after " + inputDate3 + " and before " + inputDate4);
    //            for (int i = 0; i < Individual_project_part_A.assigments.size(); i++) {
    //                //ELEGXOS GIA DUE DATE APO DEYTERA EVS PARASKEYH
    //                if (Individual_project_part_A.assigments.get(i).getSubDateTime().after(inputDate3) && Individual_project_part_A.assigments.get(i).getSubDateTime().before(inputDate4)) {
    //                    Individual_project_part_A.assigments.get(i).getStudentname();
    //                }
    //            }
    //        } else if (inputDate.getDay() == 3) {//TETARTH
    //            System.out.println(str.append(inputDate));
    //
    //            Date inputDate5 = new Date(a - 1900, b - 1, c - 2);//DEYTERA
    //            Date inputDate6 = new Date(a - 1900, b - 1, c + 3);//PARASKEYI
    //            System.out.println("Checking dates after " + inputDate5 + " and before " + inputDate6);
    //            System.out.println("Students dueing assigments this week: ");
    //            for (int i = 0; i < Individual_project_part_A.assigments.size(); i++) {
    //                //ELEGXOS GIA DUE DATE APO DEYTERA EVS PARASKEYH
    //                if (Individual_project_part_A.assigments.get(i).getSubDateTime().after(inputDate5) /*&& )*/) {
    //                    if (Individual_project_part_A.assigments.get(i).getSubDateTime().before(inputDate6)) {
    //
    //                        Individual_project_part_A.assigments.get(i).getStudentname();
    //                    }
    //                }
    //            }
    //        } else if (inputDate.getDay() == 4) {//PEMPTH
    //            System.out.println(str.append(inputDate));
    //            Date inputDate7 = new Date(a - 1900, b - 1, c - 3);
    //            Date inputDate8 = new Date(a - 1900, b - 1, c + 2);
    //            System.out.println("Checking dates after " + inputDate7 + " and before " + inputDate8);
    //            for (int i = 0; i < Individual_project_part_A.assigments.size(); i++) {
    //                //ELEGXOS GIA DUE DATE APO DEYTERA EVS PARASKEYH
    //                if (Individual_project_part_A.assigments.get(i).getSubDateTime().after(inputDate7) && Individual_project_part_A.assigments.get(i).getSubDateTime().before(inputDate8)) {
    //                    Individual_project_part_A.assigments.get(i).getStudentname();
    //                }
    //            }
    //        } else if (inputDate.getDay() == 5) {//PARASKEYH
    //            System.out.println(str.append(inputDate));
    //            Date inputDate9 = new Date(a - 1900, b - 1, c - 4);
    //            Date inputDate11 = new Date(a - 1900, b - 1, c + 1);
    //            System.out.println("Checking dates after " + inputDate9 + " and before " + inputDate11);
    //            for (int i = 0; i < Individual_project_part_A.assigments.size(); i++) {
    //                //ELEGXOS GIA DUE DATE APO DEYTERA EVS PARASKEYH
    //                if (Individual_project_part_A.assigments.get(i).getSubDateTime().after(inputDate9) && Individual_project_part_A.assigments.get(i).getSubDateTime().before(inputDate11)) {
    //                    Individual_project_part_A.assigments.get(i).getStudentname();
    //                }
    //            }
    //        } else if (inputDate.getDay() == 6) {//SABBATO
    //            System.out.println(str.append(inputDate));
    //            Date inputDate10 = new Date(a - 1900, b - 1, c - 5);
    //
    //            System.out.println("Checking dates after " + inputDate10 + " and before " + inputDate);
    //            for (int i = 0; i < Individual_project_part_A.assigments.size(); i++) {
    //                //ELEGXOS GIA DUE DATE APO DEYTERA EVS PARASKEYH
    //                if (Individual_project_part_A.assigments.get(i).getSubDateTime().after(inputDate10)
    //                        && Individual_project_part_A.assigments.get(i).getSubDateTime().before(inputDate)) {
    //                    Individual_project_part_A.assigments.get(i).getStudentname();
    //                }
    //            }
    //        } else if (inputDate.getDay() == 0) {//KYRIAKH
    //            System.out.println(str.append(inputDate));
    //            Date inputDate12 = new Date(a - 1900, b - 1, c - 6);
    //            Date inputDate13 = new Date(a - 1900, b - 1, c - 1);
    //            System.out.println("Checking dates after " + inputDate12 + " and before " + inputDate13);
    //            for (int i = 0; i < Individual_project_part_A.assigments.size(); i++) {
    //                //ELEGXOS GIA DUE DATE APO DEYTERA EVS PARASKEYH
    //                if (Individual_project_part_A.assigments.get(i).getSubDateTime().after(inputDate12)
    //                        && Individual_project_part_A.assigments.get(i).getSubDateTime().before(inputDate13)) {
    //                    Individual_project_part_A.assigments.get(i).getStudentname();
    //                }
    //            }
    //        }
    //
    //    }
    public static void printMultipleCourseStudents() {

        for (int z = 0; z < courses.size(); z++) {
            for (int i = 0; i < courses.get(z).getStudents().size(); i++) {
                //PAIRNO TON KATHE MATHITI
                String check = courses.get(z).getStudents().get(i).getLastName();
                //TSEKARO TIN OMOIOTHTA ME TOYS MAUHTES APO TO EPOMENO COURSE KAI PERA
                for (int j = 1; j < courses.size(); j++) {
                    for (int k = 0; k < courses.get(j).getStudents().size(); k++) {
                        if (check.equals(courses.get(j).getStudents().get(k).getLastName())) {

                            Individual_project_part_A.mutlipleStudents.add(courses.get(z).getStudents().get(i));
                        }
                    }
                }
            }
        }
        System.out.println("MULTIPLE COURSES STUDENTS: ");
        Iterator<Student> iter = Individual_project_part_A.mutlipleStudents.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().getLastName());
        }

    }

    public static void printEachStudentAssigments() {
        System.out.println("STUDENTS ASSIGMENTS: ");

        for (int i = 0; i < Individual_project_part_A.students.size(); i++) {
            System.out.println(Individual_project_part_A.students.get(i).getLastName() + " :");
            for (int j = 0; j < Individual_project_part_A.students.get(i).getAssigment().size(); j++) {
                System.out.println(Individual_project_part_A.students.get(i).getAssigment().get(j).getTitle());

            }

        }
    }

    public static void fillCourse(String title, String stream, String type, String start_date, String end_date) {

        Course course = new Course(title, stream, type, start_date, end_date);
        courses.add(course);
        System.out.println("!!STORED!!");
    }

    public static void fillStudent(String next, String next0, String inputDate, double nextDouble) {
        Student student = new Student(next, next0, inputDate, nextDouble);
        Individual_project_part_A.students.add(student);

        System.out.println("!!STORED!!");
    }

    public static void fillTrainer(String next, String next0, String next1) {
        Trainer trainer = new Trainer(next, next0, next1);
        Individual_project_part_A.trainers.add(trainer);

        System.out.println("!!STORED!!");
    }

    public static void fillAssigment(String next, String next0, String input) {
        Assigment assigment = new Assigment(next, next0, input);
        Individual_project_part_A.assigments.add(assigment);

        System.out.println("!!STORED!!");
    }

    public static void makeReferenceStudentToCourse() {
        Scanner input = new Scanner(System.in);
        for (Student s : Individual_project_part_A.students) {
            System.out.println("To which course the student " + s.getLastName() + " belongs to?");

            for (Course c : courses) {
                if (c.getTitle().equals(input.next())) {
                    c.addStudent(s);
                }
            }
        }
    }

    public static void makeReferenceTrainerToCourse() {
        Scanner input = new Scanner(System.in);
        for (Trainer t : Individual_project_part_A.trainers) {
            System.out.println("To which course the trainer " + t.getLastName() + " belongs to?");

            for (Course c : courses) {
                if (c.getTitle().equals(input.next())) {
                    c.addTrainer(t);
                }
            }
        }
    }

    public static void makeReferenceAssigmentToCourse() {
        Scanner input = new Scanner(System.in);
        for (Assigment a : Individual_project_part_A.assigments) {
            System.out.println("To which course the assigments " + a.getTitle() + " belongs to?");

            for (Course c : courses) {
                if (c.getTitle().equals(input.next())) {
                    c.addAssigment(a);
                }
            }
        }

    }

    public static void makeReferenceAssigmentToStudent() {
        Scanner input = new Scanner(System.in);
        for (Assigment a : Individual_project_part_A.assigments) {
            if (Individual_project_part_A.students.isEmpty()) {
                break;
            }
            System.out.println("To which student the project " + a.getTitle() + " is assigned?");

            for (Student s : Individual_project_part_A.students) {
                if (s.getLastName().equals(input.next())) {
                    s.addAssigment(a);
                }
            }
        }

    }

    public static void assignStudentToMultipleCourses() {

        boolean check;
        Scanner input = new Scanner(System.in);

        do {
            check = false;
            System.out.println("Do you want to assign a student to more than one courses? [Y / N ] ");
            String str = input.next();
            System.out.println("You pressed " + str);
            if (str.contentEquals("Y")) /*|| (str.contentEquals("y"))*/ {

                if (Individual_project_part_A.students.isEmpty()) {
                    break;
                }
                check = true;
                System.out.println("Type student's last name");
                for (Student s : Individual_project_part_A.students) {
                    String studentName = input.next();
                    if (s.getLastName().equals(studentName)) {
                        System.out.println("Which course to be assigned to?");
                        for (Course c : courses) {
                            if (input.next().equals(c.getTitle())) {
                                c.addStudent(s);
                            }
                        }
                    }
                }

            }
        } while (check);

    }

    public static void fillingDBProcess() {
        boolean check2 = true;
        Scanner input = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<>();
        int a = 10;

        System.out.println("Choose input: \n1. Course  2. Student  3. Trainer  4. Assigment  0. EXIT");
        try {
            a = input.nextInt();
        } catch (InputMismatchException e) {
            a = 10;
            //System.err.println("kkk");
        }

        while (a != 0) {

            switch (a) {
                case 1:
                    Individual_project_part_A.check = true;
                    check2 = false;
                    //System.out.println("Set Course: title,stream,type, start_date, end_date");
                    System.out.println("Set Course: title");
                    data.add(input.next());
                    System.out.println("Set Course: stream");
                    data.add(input.next());
                    System.out.println("Set Course: type");
                    data.add(input.next());
                    System.out.println("Set Course:  start_date");
                    data.add(input.next());
                    System.out.println("Set Course: end_date");
                    data.add(input.next());
                    try {
                        fillCourse(data.get(0), data.get(1), data.get(2), data.get(3), data.get(4));
                    } catch (NumberFormatException e) {
                        System.err.println("Wrong input format (format DD-MM-YYYY)");
                    }
                    break;
                case 2:
                    Individual_project_part_A.check = true;
                    check2 = false;
                    System.out.println("Set Student: name");
                    data.add(input.next());
                    System.out.println("Set Student:  Last name");
                    data.add(input.next());
                    System.out.println("Set Student date of birth (format DD-MM-YYYY)");
                    data.add(input.next());
                    System.out.println("Set Student: tution Fees");
                    data.add(input.next());
                    try {
                        fillStudent(data.get(0), data.get(1), data.get(2),
                                Double.parseDouble(data.get(3)));
                    } catch (NumberFormatException e) {
                        System.err.println("Wrong input format (format DD-MM-YYYY)");
                    }
                    break;
                case 3:
                    Individual_project_part_A.check = true;
                    check2 = false;
                    System.out.println("Set Trainer: FirstName");
                    data.add(input.next());
                    System.out.println("Set Trainer: LastName");
                    data.add(input.next());
                    System.out.println("Set Trainer: Subject");
                    data.add(input.next());
                    fillTrainer(data.get(0), data.get(1), data.get(2));
                    break;
                case 4:
                    Individual_project_part_A.check = true;
                    check2 = false;
                    System.out.println("Set Assigment: Title");
                    data.add(input.next());
                    System.out.println("Set Assigment:  Description");
                    data.add(input.next());
                    System.out.println("Set Assigment: Submissioin date");
                    data.add(input.next());
                    try {
                        fillAssigment(data.get(0), data.get(1), data.get(2));
                    } catch (NumberFormatException e) {
                        System.err.println("Wrong input format (format DD-MM-YYYY)");
                    }
                    break;
                default:
                    System.err.println("WRONG INPUT!!!");
                    break;
            }
            data.clear();

            System.out.println("Choose input:  1. Course  2. Student  3. Trainer  4. Assigment  0. EXIT");
            Scanner input2 = new Scanner(System.in);
            //a=10;
            try {
                a = input2.nextInt();
            } catch (InputMismatchException e) {
                a = 10;
            }
        }
        if (check2) {
            syntheticData();
        }
    }

    public static void syntheticData() {
        System.err.println("FILLING WITH SYNTHETIC DATA");
        Course course1 = new Course("CB16  ", "Java", "Part Time", "01-01-2019", "31-03-2019");
        Course course2 = new Course("CB17  ", "C", "Part Time", "15-01-2019", "15-04-2019");
        Course course3 = new Course("CB18  ", "Java", "Full Time", "01-01-2019", "28-02-2019");
        Student student1 = new Student("ioannis", "Kopanos", "27-02-1987", 1000.00);
        Student student2 = new Student("stelios", "Bila", "27-02-1989", 1000.00);
        Student student3 = new Student("dmitris", "Lolita", "20-01-1990", 1000.00);
        Student student4 = new Student("baggelis", "Roop", "12-05-1995", 1000.00);
        Student student5 = new Student("stamatis", "Spanoudakis", "02-07-1997", 1000.00);
        Trainer trainer1 = new Trainer("Michalis", "Ignatiou", "OOP");
        Trainer trainer2 = new Trainer("Kostas", "Spyridis", "Intro");
        Trainer trainer3 = new Trainer("Vasilis", "Papamarkos", "GIT");
        Assigment individualProject1 = new Assigment("First Individual Assigment", "Private Scool", "14-02-2019");
        Assigment individualProject2 = new Assigment("Second Individual Assigment", "Bank", "31-03-2019");
        Assigment finalProject = new Assigment("Final Individual Assigment", "Application", "16-04-2019");
        Individual_project_part_A.courses.add(course1);
        Individual_project_part_A.courses.add(course2);
        Individual_project_part_A.courses.add(course3);
        Individual_project_part_A.students.add(student1);
        Individual_project_part_A.students.add(student2);
        Individual_project_part_A.students.add(student3);
        Individual_project_part_A.students.add(student4);
        Individual_project_part_A.students.add(student5);
        Individual_project_part_A.trainers.add(trainer1);
        Individual_project_part_A.trainers.add(trainer2);
        Individual_project_part_A.assigments.add(individualProject1);
        Individual_project_part_A.assigments.add(individualProject2);
        Individual_project_part_A.assigments.add(finalProject);

        course1.addAssigment(individualProject1);
        course1.addAssigment(individualProject2);
        course1.addAssigment(finalProject);
        course1.addStudent(student1);
        course2.addStudent(student1);
        course2.addStudent(student5);
        course1.addStudent(student2);
        course1.addStudent(student3);
        course1.addStudent(student4);
        course3.addStudent(student3);
        course3.addStudent(student4);
        course1.addTrainer(trainer1);
        course1.addTrainer(trainer2);
        course2.addTrainer(trainer2);
        course3.addTrainer(trainer2);

        student1.addAssigment(individualProject1);
        student2.addAssigment(individualProject1);
        student3.addAssigment(individualProject1);
        student4.addAssigment(individualProject1);
        student1.addAssigment(individualProject2);
        student1.addAssigment(finalProject);
        student5.addAssigment(finalProject);

        individualProject1.setStudent(student4);
        individualProject1.setStudent(student2);
        individualProject1.setStudent(student3);
        individualProject1.setStudent(student1);
        individualProject2.setStudent(student4);
        finalProject.setStudent(student3);
        finalProject.setStudent(student4);
        finalProject.setStudent(student5);
    }

    public static void printListOfStudents() {
        System.out.println("LIST OF STUDENTS:");
        //System.out.println(students.size());
        for (int i = 0; i < Individual_project_part_A.students.size(); i++) {

            System.out.println(Individual_project_part_A.students.get(i).getLastName());
        }
    }

    public static void printListOfTrainers() {
        System.out.println("LIST OF TRAINERS:");
        //System.out.println(trainers.size());
        for (int i = 0; i < Individual_project_part_A.trainers.size(); i++) {

            System.out.println(Individual_project_part_A.trainers.get(i).getLastName());
        }
    }

    public static void printListOfAssigments() {
        {
            System.out.println("LIST OF ASSIGMENTS:");
            //System.out.println(assigments.size());
            for (int i = 0; i < Individual_project_part_A.assigments.size(); i++) {

                System.out.println(Individual_project_part_A.assigments.get(i).getTitle());
            }
        }

    }

}
