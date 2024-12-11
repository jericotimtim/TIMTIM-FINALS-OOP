import java.io.*;
import java.net.*;
import java.util.*;

public class AdvancedPasswordEvaluator extends PasswordEvaluator {

    public AdvancedPasswordEvaluator(String password) {
        this.password = password;
    }

    @Override
    public void evaluatePassword() {
        score = 0;

        if (password.length() >= 12) {
            score++;
        }
        if (password.matches(".*[!@#$%^&*(),.?\\\":{}|<>].*")) {
            score++;
        }
        if (password.matches(".*[A-Z].*") && password.matches(".*[a-z].*")) {
            score++;
        }
        if (password.matches(".*\\d.*")) {
            score++;
        }

        String[] commonPatterns = {"password", "12345", "qwerty", "letmein"};
        for (String pattern : commonPatterns) {
            if (password.toLowerCase().contains(pattern)) {
                score--;
            }
        }

        double entropy = calculateEntropy(password);
        if (entropy > 50) {
            score++;
        }

        if (isPasswordBreached(password)) {
            System.out.println("This password has been found in a data breach. Avoid using it.");
            score = Math.max(0, score - 2);
        }
    }

    private double calculateEntropy(String password) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : password.toCharArray()) {
            uniqueChars.add(c);
        }
        return uniqueChars.size() * Math.log(uniqueChars.size());
    }

    private boolean isPasswordBreached(String password) {
        try {
            String hashedPassword = Integer.toString(password.hashCode());
            URL url = new URL("https://api.pwnedpasswords.com/range/" + hashedPassword.substring(0, 5));
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                if (inputLine.contains(hashedPassword.substring(5).toUpperCase())) {
                    return true;
                }
            }
            in.close();
        } catch (Exception e) {
            System.out.println("Could not perform breach check. Please try again later.");
        }
        return false;
    }
}
