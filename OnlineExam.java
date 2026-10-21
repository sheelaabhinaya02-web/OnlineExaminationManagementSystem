
import java.util.Scanner;

public class OnlineExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        char answer;

        System.out.println("ONLINE EXAMINATION SYSTEM");
        System.out.println("-------------------------");

        // Question 1
        System.out.println("\n1. Which language is used for Android development?");
        System.out.println("a) HTML");
        System.out.println("b) Java");
        System.out.println("c) CSS");
        System.out.print("Enter your answer: ");
        answer = sc.next().charAt(0);

        if (answer == 'b' || answer == 'B') {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which keyword is used to create an object in Java?");
        System.out.println("a) class");
        System.out.println("b) void");
        System.out.println("c) new");
        System.out.print("Enter your answer: ");
        answer = sc.next().charAt(0);

        if (answer == 'c' || answer == 'C') {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which method is the starting point of Java?");
        System.out.println("a) start()");
        System.out.println("b) main()");
        System.out.println("c) run()");
        System.out.print("Enter your answer: ");
        answer = sc.next().charAt(0);

        if (answer == 'b' || answer == 'B') {
            score++;
        }

        // Display result
        System.out.println("\n------ EXAM RESULT ------");
        System.out.println("Total Questions: 3");
        System.out.println("Correct Answers: " + score);
        System.out.println("Wrong Answers: " + (3 - score));
        System.out.println("Marks Obtained: " + score + "/3");

        sc.close();
    }
}
