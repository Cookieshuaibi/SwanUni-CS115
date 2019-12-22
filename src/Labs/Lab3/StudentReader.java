package Labs.Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentReader {
    public ArrayList<Student> ReadFile(File file) {
        ArrayList<Student> students = new ArrayList<>();

        try {
            Scanner fileScanner = new Scanner(file);

            // This try-catch block is useless as you can do "if (File.exists()) { ... }",
            // but Java forces you do use it
            try {
                while (fileScanner.hasNextLine()) {
                    Scanner lineScanner = new Scanner(fileScanner.nextLine());

                    try {
                        students.add(new Student(lineScanner.nextInt(), lineScanner.next(), lineScanner.next(),
                                lineScanner.nextInt(), lineScanner.nextInt(), lineScanner.nextInt()));
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        lineScanner.close();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                fileScanner.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            return students;
        }
    }
}