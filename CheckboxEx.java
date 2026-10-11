import java.awt.*;
import java.awt.event.*;
public class CheckboxEx extends Frame implements ItemListener  
{
    Checkbox cbJava, cbPython;
    Label statusLabel;

    public CheckboxEx()
    {
        setTitle("Checkbox Example");
        setSize(400,200);
        setLayout(new FlowLayout());
        cbJava = new Checkbox("Java");
        cbPython = new Checkbox("Python");
        statusLabel = new Label("Select a language....");
        cbJava.addItemListener(this);
        cbPython.addItemListener(this);
        add(cbJava);
        add(cbPython);
        add(statusLabel);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);

    }

    public void itemStateChanged(ItemEvent e)
    {
        StringBuilder s = new StringBuilder("Selected: ");
        if(cbJava.getState())
            s.append("Java");
        if(cbPython.getState())
            s.append("Python");
        if(s.toString().equals("Selected: "))
            statusLabel.setText("No language selected");
        else
            statusLabel.setText(s.toString().trim());
    }
    public static void main(String args[])
    {
        new CheckboxEx();
    }
}
