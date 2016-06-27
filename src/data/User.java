package data;

public class User extends DataMain {

    private String email;
    private String username;
    private String password;
    private Long signUpDate;
    private Long lastLoginDate;
    private String role = "guest";

    public User() {
    }

    public User(Long id, String email, String username, String password, Long signUpDate, Long lastLoginDate) {
        super(id);
        this.email = email;
        this.username = username;
        this.password = password;
        this.signUpDate = signUpDate;
        this.lastLoginDate = lastLoginDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getSignUpDate() {
        return signUpDate;
    }

    public void setSignUpDate(Long signUpDate) {
        this.signUpDate = signUpDate;
    }

    public Long getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Long lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", signUpDate=" + signUpDate +
                ", lastLoginDate=" + lastLoginDate +
                ", role='" + role + '\'' +
                '}';
    }
}
