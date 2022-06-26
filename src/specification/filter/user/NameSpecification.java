package specification.filter.user;

public class NameSpecification implements UserSpecification {

    private String name;

    public NameSpecification(String name) {
        this.name = name;
    }

    @Override
    public boolean isSatisfied(User item) {
        return this.name.equals(item.getName());
    }
}
