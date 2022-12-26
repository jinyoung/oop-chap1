package oopchap.main;

public class BusinessLogic extends AbstractBusinessLogic{

    BusinessLogic(AbstractDatabase db) {
        super(db);
    }

    public boolean doBusinessLogic() {

        Address address = new Address();
        address.name="jjy";
        address.phoneNumber = "010-0000-0000";
        
        database.save(address);

        /// 변화
        Address address2 = database.load();

        return (address.name.equals(address2.name) && address.phoneNumber.equals(address2.phoneNumber));

    }
    
}
