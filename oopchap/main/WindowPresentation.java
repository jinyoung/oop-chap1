package oopchap.main;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WindowPresentation extends AbstractPresentation{

    String serverUrl;

    WindowPresentation(AbstractBusinessLogic businessLogic) {
        super(businessLogic);
        //TODO Auto-generated constructor stub
    }


    @Override
    public void doPresentation() {

        JFrame jframe = new JFrame();

        if(businessLogic.doBusinessLogic())
            jframe.getContentPane().add(new JLabel("성공했습니다"));
        else
            jframe.getContentPane().add(new JLabel("실패했습니다"));

        jframe.setVisible(true);
    
    }


}
