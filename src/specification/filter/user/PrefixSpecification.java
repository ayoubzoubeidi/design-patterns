package specification.filter.user;

public class PrefixSpecification implements UserSpecification {

    private Prefix prefix;

    public PrefixSpecification(Prefix prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean isSatisfied(User item) {
        return this.prefix.equals(item.getPrefix());
    }
}
