package assignment1;

public class User {

    private int id;
    private String name;
    private String mobile;
    private String email;
    private long coustomer_refrence;

    public User() {

    }

    public User(int id, String name, String mobile, String email, long coustomer_refrence) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.coustomer_refrence = coustomer_refrence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCoustomer_refrence() {
        return coustomer_refrence;
    }

    public void setCoustomer_refrence(long coustomer_refrence) {
        this.coustomer_refrence = coustomer_refrence;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", coustomer_refrence=" + coustomer_refrence +
                '}';
    }
}
