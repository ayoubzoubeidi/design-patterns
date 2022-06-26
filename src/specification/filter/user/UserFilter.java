package specification.filter.user;

import specification.filter.Filter;
import specification.filter.Specification;

import java.util.List;
import java.util.stream.Stream;

public class UserFilter implements Filter<User> {

    @Override
    public Stream<User> filter(List<User> items, Specification<User> specification) {
        return items.stream().filter(specification::isSatisfied);
    }
}
