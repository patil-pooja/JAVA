import java.awt.*;
import java.awt.event.*;
public class mouseMotionExample extends Frame implements MouseMotionListener
{
    Label l;
    mouseMotionExample()
    {
        l = new Label("Perform an action",Label.CENTER);
        l.setBounds(50,100,300,30);
        add(l);

        addMouseMotionListener(this);
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
    public void mouseMoved(MouseEvent e)
    {
        l.setText("Mouse Moved");
        System.out.println("Mouse Moved");
    }
    public void mouseDragged(MouseEvent e)
    {
        l.setText("Mouse Dragged");
        System.out.println("Mouse Dragged");
    }
    public static void main(String[] args) {
        new mouseMotionExample();
    }
}

