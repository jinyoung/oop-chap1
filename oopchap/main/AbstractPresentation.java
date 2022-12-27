package oopchap.main;

public abstract class AbstractPresentation {
    AbstractBusinessLogic businessLogic;
    public void setBusinessLogic(AbstractBusinessLogic businessLogic) {
        this.businessLogic = businessLogic;
    }

    abstract public void doPresentation();
    
}
