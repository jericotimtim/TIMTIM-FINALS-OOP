
public abstract class PasswordEvaluator {
    protected String password;
    protected int score;

    public abstract void evaluatePassword();

    public void provideFeedback() {
        if (score < 3) {
            System.out.println("Weak password. Consider adding length, special characters, numbers, and mixed cases.");
            System.out.println("Strength Level: \033[31mWeak\033[0m");
        } else if (score == 3) {
            System.out.println("Moderate password. Add more complexity for stronger security.");
            System.out.println("Strength Level: \033[33mModerate\033[0m");
        } else {
            System.out.println("Strong password. Good job!");
            System.out.println("Strength Level: \033[32mStrong\033[0m");
        }
    }
}
