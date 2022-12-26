package oopchap.main;

public class MySQLDatabase extends Database {

    @Override
    public Address load() {
    
System.out.println("mysql load logic");

        return super.load();
    }

    @Override
    public void save(Address address) {
System.out.println("mysql save logic");
        super.save(address);
    }



}
