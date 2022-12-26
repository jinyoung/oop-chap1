package oopchap.main;

public class Application {

    public static void main(String args[]) {

        AbstractPresentation presentation = null;

        presentation = 
            new WindowPresentation(
                new BusinessLogic(
                    new MySQLDatabase()
                )
            );


        presentation.doPresentation();
        

    }
}
