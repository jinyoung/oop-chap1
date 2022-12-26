package oopchap.main;

public abstract class AbstractPresentation {
    AbstractBusinessLogic businessLogic;

    AbstractPresentation(AbstractBusinessLogic businessLogic){
        this.businessLogic = businessLogic;
    }

    abstract public void doPresentation();
    
}
