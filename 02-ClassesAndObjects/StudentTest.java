import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentTest {
    static String generateSequence(int length) {
        Random random = new Random();

        String string = "";

        for (int i = 0; i < length; i++) {
            string += Math.abs(random.nextInt() % 9);
        }

        return string;
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<Student> students = new ArrayList<Student>();

        for (int i = 0; i < 3; i++) {
            Student student = new Student();
            student.name = generateSequence(20);
            student.age = 17 + Math.abs(random.nextInt() % 5);
            student.cardID = generateSequence(6);
            student.setValidity(random.nextFloat() > 0.02f);
            student.semester = Math.abs(random.nextInt() % 6);
            student.averageGrade = random.nextFloat() * 5.0f;

            students.add(student);
        }

        for (Student student : students) {
            student.displayBasicMetadata();
            student.displayIDStatus();
            System.out.println();
        }
    }
}