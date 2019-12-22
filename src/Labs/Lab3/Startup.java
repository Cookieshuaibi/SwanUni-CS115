package Labs.Lab3;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Startup {
    public static void main(String[] args) {
        args = new String[] { "./src/Labs/Lab3/student_data.txt" };

        // Task 3.1
        ArrayList<Student> students = new StudentReader().ReadFile(new File(args[0]));

        /*
         * "Challenge" Task 3.3
         * 
         * It was a bit of Googling as I don't know Java as good as .NET, but it wasn't
         * a challenge. Just simple Lambda expression
         */
        Collections.sort(students, (Student o1, Student o2) -> {
            double o1mark = calculateFinalMark(o1.getCourseworkMark1(), o1.getCourseworkMark2(), o1.getExamMark());
            double o2mark = calculateFinalMark(o2.getCourseworkMark1(), o2.getCourseworkMark2(), o2.getExamMark());

            return Double.compare(o2mark, o1mark);
        });

        for (Student item : students) {
            double finalMark = calculateFinalMark(item.getCourseworkMark1(), item.getCourseworkMark2(),
                    item.getExamMark());
            /*
             * "Challenge" Task 3.2
             * 
             * I bit of Googling again. Another options are paddings. Simmilar to .NET
             * string.Format("{0, -15} {1, -15} {2}: {3}");
             */
            System.out.println(String.format("%-15s %-15s %d: %5.1f (%s)", item.getSurname(), item.getFirstName(),
                    item.getId(), finalMark, (finalMark >= 20.0) ? "Passed" : "Failed"));
        }
    }

    public static double calculateFinalMark(int cw1, int cw2, int exam) {
        return (cw1 * 0.1) + (cw2 * 0.1) + (exam * 0.8);
    }
}