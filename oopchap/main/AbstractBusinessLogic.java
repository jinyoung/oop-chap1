package oopchap.main;

public abstract class AbstractBusinessLogic {

    AbstractDatabase database;
    public void setDatabase(AbstractDatabase database) {
        this.database = database;
    }

    abstract public boolean doBusinessLogic();
}
