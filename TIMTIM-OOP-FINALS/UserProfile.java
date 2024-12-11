import java.util.*;

public class UserProfile {
    private String username;
    private List<String> passwordHistory = new ArrayList<>();

    public UserProfile(String username) {
        this.username = username;
    }

    public void addPassword(String password) {
        passwordHistory.add(password);
    }

    public void viewEvaluationHistory() {
        System.out.println("Password Evaluation History for " + username + ":");
        for (String password : passwordHistory) {
            System.out.println(password);
        }
    }
}
