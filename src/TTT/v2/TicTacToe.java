package TTT.v2;


import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;


/**
 * Created by Vika on 15.11.2016.
 */
public class TicTacToe extends JPanel{
JPanel p=new JPanel();
XOButton buttons [] =new XOButton[9];

    public static void main (String args[]){
        new TicTacToe();
    }
    public TicTacToe(){
        super("TicTacToe");
        setSize(400,400);
        setDefaultLocale(E);
        p.setLayout(new GridLayout(3,3));
        for (int i=0;i<3;i++){
            buttons[i]=new XOButton();
            p.add(buttons[i]);
        }
        add(p);
        setVisible(true);
    }


}
