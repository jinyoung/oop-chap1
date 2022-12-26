package oopchap.main;

public class WebPresentation extends AbstractPresentation{

    String serverUrl;

    WebPresentation(AbstractBusinessLogic businessLogic) {
        super(businessLogic);
        //TODO Auto-generated constructor stub
    }
    



    public void runServer(){
        System.out.println("server has been started");
    }




    @Override
    public void doPresentation() {
        if(businessLogic.doBusinessLogic())
            System.out.println("200 OK");
        else
            System.out.println("500 ERROR");
    }


}
