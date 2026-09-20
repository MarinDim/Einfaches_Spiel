import javax.swing.*;
import java.awt.*;

public class GewinnView extends JFrame{
    private JLabel rundenTitelLabel;
    private JLabel punkteTitelLabel;
    private JLabel rundenLabel;
    private JLabel punkteLabel;

    private JTextField spielerField;
    private JTextField computerField;
    private JButton button;

    public GewinnView(){
        setTitle("Zahlenspiel v1.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,250);
        setLayout(new BorderLayout());
    }

    public JLabel getRundenLabel() {
        return rundenLabel;
    }

    public JLabel getPunkteLabel() {
        return punkteLabel;
    }

    public JTextField getSpielerField() {
        return spielerField;
    }

    public JTextField getComputerField() {
        return computerField;
    }

    public JButton getButton() {
        return button;
    }
}
