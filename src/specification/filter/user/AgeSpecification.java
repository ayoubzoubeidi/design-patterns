package specification.filter.user;

import java.util.Objects;

public class AgeSpecification implements UserSpecification {

    private Integer age;

    public AgeSpecification(Integer age) {
        this.age = age;
    }

    @Override
    public boolean isSatisfied(User item) {
        return Objects.equals(this.age, item.getAge());
    }
}
