public class BasicPasswordEvaluator extends PasswordEvaluator {

    public BasicPasswordEvaluator(String password) {
        this.password = password;
    }

    @Override
    public void evaluatePassword() {
        score = 0;

        if (password.length() >= 8) {
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
    }
}
