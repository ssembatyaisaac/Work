//import java.util.Scanner;

/**
 * GradebookTest
 */
public class GradebookTest {

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);

        GradeBook gradeBook1 = new GradeBook("BSSE");

        GradeBook gradeBook2 = new GradeBook("BSCS");


        System.out.printf("gradeBook1 course name is %s\n", gradeBook1.getCourseName());

        System.out.printf("gradeBook2 course name is %s\n", gradeBook2.getCourseName());

    }
}