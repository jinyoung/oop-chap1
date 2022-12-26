package oopchap.main;

public class Database extends AbstractDatabase{
    Address address;

    public Address load() {
        return address;
    }

    public void save(Address address) {
        this.address = address;
    }
    
}
