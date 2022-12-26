package oopchap.main;

public class MongoDatabase extends Database {

    @Override
    public Address load() {
    
System.out.println("mongo db load logic");

        return super.load();
    }

    @Override
    public void save(Address address) {
System.out.println("mongo db save logic");
        super.save(address);
    }



}
