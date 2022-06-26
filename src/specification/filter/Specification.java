package specification.filter;

public interface Specification<T> {

    boolean isSatisfied(T item);

}
