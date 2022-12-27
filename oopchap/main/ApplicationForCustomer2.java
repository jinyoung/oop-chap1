package oopchap.main;

public class ApplicationForCustomer2 extends ApplicationForCustomer1{

    @Override
    AbstractDatabase createDatabase() {
        
        return new MongoDatabase();
    }

    
}
