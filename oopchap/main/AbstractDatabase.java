package oopchap.main;

public abstract class AbstractDatabase {
    abstract public Address load();

    abstract public void save(Address address);
    
}
