package specification.filter.user;

public class AddressSpecification implements UserSpecification {

    public AddressSpecification(String address) {
        this.address = address;
    }

    private String address;

    @Override
    public boolean isSatisfied(User item) {
        return this.address.equals(item.getAddress());
    }
}
