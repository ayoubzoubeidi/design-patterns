package specification.filter.user;

public class User {

    private String name;
    private Integer age;
    private String address;
    private Prefix prefix;

    public User(String name, Integer age, String address, Prefix prefix) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }
}
