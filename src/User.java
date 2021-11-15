import java.rmi.StubNotFoundException;

public class User implements Comparable<User> {
    private String name, state;
    private int id;
    private char jinsi;

    public User() {
    }

    public User(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public User(int id, String name, String state, char jinsi) {
        this.jinsi = jinsi;
        this.name = name;
        this.state = state;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getJinsi() {
        return jinsi;
    }

    public void setJinsi(char jinsi) {
        this.jinsi = jinsi;
    }

    @Override
    public int compareTo(User comparesto) {
        int compareage = comparesto.getId();
        return this.id - compareage;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", id=" + id +
                ", jinsi=" + jinsi +
                '}'+"\n";
    }
}
