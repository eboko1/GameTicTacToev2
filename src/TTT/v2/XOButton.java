package TTT.v2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Vika on 15.11.2016.
 */
public class XOButton extends JButton implements ActionListener{
    ImageIcon X,O;
    byte value=0;
    //0:nothing
    //1:X
    //2:O
    public  XOButton(){
     X=new ImageIcon(this.getClass().getResource("X.png"));
     O=new ImageIcon(this.getClass().getResource("O.png"));


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        value++;
        value%=3;
        switch (value){
            case 0:
                setIcon(null);
                break;
            case 1:
                setIcon(X);
                break;
            case 2:
                setIcon(O);
                break;

        }
    }
}
