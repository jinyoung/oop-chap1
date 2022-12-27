package oopchap.main;

public abstract class Application {


    public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

        Application application = (Application)Class.forName("oopchap.main.ApplicationFor" + args[0]).newInstance();   
        // launch.json ==> args: ["ApplicationForCustomer1"]   - Web + MySQL db

        AbstractPresentation presentation = application.createPresentation();
        AbstractBusinessLogic businessLogic = application.createBusinessLogic();
        AbstractDatabase database = application.createDatabase();

        presentation.setBusinessLogic(businessLogic);
        businessLogic.setDatabase(database);

        presentation.doPresentation();
        

    }

    abstract AbstractPresentation createPresentation();
    abstract AbstractBusinessLogic createBusinessLogic();
    abstract AbstractDatabase createDatabase();


}
