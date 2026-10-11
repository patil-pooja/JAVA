import java.awt.*;
import java.awt.event.*;
public class mouseExample extends Frame implements MouseListener
{
    Label l;
    mouseExample()
    {
        l = new Label("Perform a mouse action",Label.CENTER);
        l.setBounds(50,100,300,30);
        add(l);

        addMouseListener(this);
        setSize(400,300);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

    }
        public void mouseClicked(MouseEvent e)
        {
            l.setText("Mouse Clicked");
            System.out.println("Mouse Clicked");
        }
        public void mousePressed(MouseEvent e)
        {
            l.setText("Mouse Pressed");
            System.out.println("Mouse Pressed");
        }
        public void mouseReleased(MouseEvent e)
        {
            l.setText("Mouse Released");
            System.out.println("Mouse Released");
        }
        public void mouseEntered(MouseEvent e)
        {
            l.setText("Mouse Entered");
            System.out.println("Mouse Entered");
        }
        public void mouseExited(MouseEvent e)
        {
            l.setText("Mouse Exited");
            System.out.println("Mouse Exited");
        }

    public static void main(String[] args) {
        new mouseExample();
    }   
}

