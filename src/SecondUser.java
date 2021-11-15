public class SecondUser {
    private String name, state;
    private int id;

    public SecondUser() {
    }

    public SecondUser(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public SecondUser(int id, String name, String state) {
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


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", id=" + id +
                '}' + "\n";
    }
}
