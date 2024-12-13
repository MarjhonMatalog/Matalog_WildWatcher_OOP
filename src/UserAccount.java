abstract class UserAccount {
    private String username;
    private String password;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }
    // GETTING THE USER ACCOUNT
    public String getUsername() {
        return username;
    }
    // VERIFY PASSWORD
    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }
     // ABSTRACT TO SHOW THE USER DASHBOARD
    public abstract void showDashboard();
}
