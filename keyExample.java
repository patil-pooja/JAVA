import java.awt.*;
import java.awt.event.*;
public class keyExample extends Frame implements KeyListener
{
    Label l;
    keyExample()
    {
        l = new Label("Press any key",Label.CENTER);
        l.setBounds(50,100,300,30);
        add(l);

        addKeyListener(this);
        setSize(400,300);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        requestFocus();
    }    
    public void keyPressed(KeyEvent e)
    {
        l.setText("Key Pressed"+e.getKeyChar());
    }
    public void keyReleased(KeyEvent e) 
    {
        l.setText("Key Released"+e.getKeyChar());
    }
    public void keyTyped(KeyEvent e)
    {
        l.setText("Key Typed"+e.getKeyChar());
    }
    public static void main(String[] args) {
        new keyExample();
    }
}

