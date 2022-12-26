package oopchap.main;

public abstract class AbstractBusinessLogic {

    AbstractDatabase database;

    AbstractBusinessLogic(AbstractDatabase db){
        this.database = db;
    }

    abstract public boolean doBusinessLogic();
}
