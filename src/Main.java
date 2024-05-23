import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

/**
 * Laboratory 1
 * Hash functions (individual).
 *
 * @author Dmytro Ukrainets
 * @date 23.05.2024
 * @version 1.0
 */
public class Main {

    /**
     * Main method of the program.
     *
     * @param args incoming data.
     */
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("Result"));
            // Task 1
            System.out.println("* * * * * Task 1 * * * * *");
            // Write to the file
            writer.println("* * * * * Task 1 * * * * *");

            String input = "Dmytro Ukrainets";

            String md5MDHash = MessageDigestUtil.hashWithAlgorithm(input, "MD5");
            String sha1MDHash = MessageDigestUtil.hashWithAlgorithm(input, "SHA-1");
            String sha256MDHash = MessageDigestUtil.hashWithAlgorithm(input, "SHA-256");

            System.out.println("MD5: " + md5MDHash);
            System.out.println("SHA-1: " + sha1MDHash);
            System.out.println("SHA-256: " + sha256MDHash);
            // Write to the file
            writer.println("MD5: " + md5MDHash);
            writer.println("SHA-1: " + sha1MDHash);
            writer.println("SHA-256: " + sha256MDHash);

            // Task 2
            System.out.println("\n* * * * * Task 2 * * * * *");
            // Write to the file
            writer.println("\n* * * * * Task 2 * * * * *");

            SecureRandom secureRandom = new SecureRandom();
            byte[] randomBytes = new byte[16];
            secureRandom.nextBytes(randomBytes);

            String md5SRHash = MessageDigestUtil.hashWithAlgorithm(randomBytes, "MD5");
            String sha1SRHash = MessageDigestUtil.hashWithAlgorithm(randomBytes, "SHA-1");
            String sha256SRHash = MessageDigestUtil.hashWithAlgorithm(randomBytes, "SHA-256");

            System.out.println("Random bytes: " + MessageDigestUtil.byteArrayToHex(randomBytes));
            System.out.println("MD5: " + md5SRHash);
            System.out.println("SHA-1: " + sha1SRHash);
            System.out.println("SHA-256: " + sha256SRHash);
            // Write to the file
            writer.println("Random bytes: " + MessageDigestUtil.byteArrayToHex(randomBytes));
            writer.println("MD5: " + md5SRHash);
            writer.println("SHA-1: " + sha1SRHash);
            writer.println("SHA-256: " + sha256SRHash);

            // Task 3
            System.out.println("\n* * * * * Task 3 * * * * *");
            // Write to the file
            writer.println("\n* * * * * Task 3 * * * * *");

            Map<Student, String> studentMap = new HashMap<>();
            Student student1 = new Student("Ivanov", "Ivan", "Ivanovych", 20, 2, 90.0);
            Student student2 = new Student("Petrov", "Petro", "Petrovych", 21, 3, 85.2);

            studentMap.put(student1, "Student 1");
            studentMap.put(student2, "Student 2");

            System.out.println("Student map:");
            studentMap.forEach((key, value) -> System.out.println(key + ": " + value));
            // Write to the file
            writer.println("Student map:");
            studentMap.forEach((key, value) -> writer.println(key + ": " + value));

            System.out.println("Finding student1: " + studentMap.get(student1));
            System.out.println("Finding student2: " + studentMap.get(student2));
            // Write to the file
            writer.println("Finding student1: " + studentMap.get(student1));
            writer.println("Finding student1: " + studentMap.get(student2));

            System.out.println("HashCode student1: " + student1.hashCode());
            System.out.println("HashCode student2: " + student2.hashCode());
            // Write to the file
            writer.println("HashCode student1: " + student1.hashCode());
            writer.println("HashCode student2: " + student2.hashCode());

            Map<Book, String> bookMap = new HashMap<>();
            Book book1 = new Book("Kobzar", "Shevchenko", 1840, 350.0);
            Book book2 = new Book("War and Peace", "Tolstoy", 1869, 500.0);

            bookMap.put(book1, "Book 1");
            bookMap.put(book2, "Book 2");

            System.out.println("\nBook map:");
            bookMap.forEach((key, value) -> System.out.println(key + ": " + value));
            // Write to the file
            writer.println("\nBook map:");
            bookMap.forEach((key, value) -> writer.println(key + ": " + value));

            System.out.println("Finding book1: " + bookMap.get(book1));
            System.out.println("Finding book2: " + bookMap.get(book2));
            // Write to the file
            writer.println("Finding book1: " + bookMap.get(book1));
            writer.println("Finding book2: " + bookMap.get(book2));

            Book book3 = new Book("Kobzar", "Shevchenko", 1840, 350.0);
            System.out.println("Finding book3 (same as book1): " + bookMap.get(book3));
            // Write to the file
            writer.println("Finding book3: " + bookMap.get(book3));

            System.out.println("HashCode book1: " + book1.hashCode());
            System.out.println("HashCode book2: " + book2.hashCode());
            System.out.println("HashCode book3: " + book3.hashCode());
            // Write to the file
            writer.println("HashCode book1: " + book1.hashCode());
            writer.println("HashCode book2: " + book2.hashCode());
            writer.println("HashCode book3: " + book3.hashCode());

            writer.close();
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Algorithm not found: " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("String cannot be null: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}