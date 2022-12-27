package oopchap.main;

public class ApplicationForCustomer1 extends Application{

    @Override
    AbstractPresentation createPresentation() {
        return new WebPresentation();
    }

    @Override
    AbstractBusinessLogic createBusinessLogic() {
        return new BusinessLogic();
    }

    @Override
    AbstractDatabase createDatabase() {
        
        return new MySQLDatabase();
    }
    
}
