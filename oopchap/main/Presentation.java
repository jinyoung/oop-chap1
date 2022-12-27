package oopchap.main;

public class Presentation extends AbstractPresentation{

    public void doPresentation() {
        if(businessLogic.doBusinessLogic())
            System.out.println("성공했습니다.");
        else
            System.out.println("실패했습니다.");
    }


    
}
