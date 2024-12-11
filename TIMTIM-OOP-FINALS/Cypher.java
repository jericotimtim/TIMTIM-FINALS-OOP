import java.util.*;

public class Cypher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Cypher: Password Strength Evaluator");
        System.out.print("Please enter your username: ");
        String username = scanner.nextLine();

        UserProfile user = new UserProfile(username);

        while (true) {
            System.out.print("\nEnter a password to evaluate (or type 'exit' to quit): ");
            String password = scanner.nextLine();

            if (password.equalsIgnoreCase("exit")) {
                break;
            }

            user.addPassword(password);

            System.out.println("Choose Evaluation Type: 1. Basic 2. Advanced");
            int choice = scanner.nextInt();
            scanner.nextLine();

            PasswordEvaluator evaluator;

            if (choice == 1) {
                evaluator = new BasicPasswordEvaluator(password);
            } else {
                evaluator = new AdvancedPasswordEvaluator(password);
            }

            evaluator.evaluatePassword();
            evaluator.provideFeedback();
        }

        System.out.println("\nWe appreciate you for using Cypher!");
        user.viewEvaluationHistory();
    }
}
