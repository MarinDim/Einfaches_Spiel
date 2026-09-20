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


        //Oben(North)
        JPanel titelPanel=new JPanel(new GridLayout(2,2,5,5));

        rundenTitelLabel=new JLabel("Rundenergebnis:");
        punkteTitelLabel=new JLabel("Gesamtpunkte:");

        rundenLabel=new JLabel("Tippe eine Zahl von 1 bis 9");
        punkteLabel=new JLabel("Gesamtpunkte: 30");

        rundenLabel.setOpaque(true);
        punkteLabel.setOpaque(true);
        rundenLabel.setBackground(Color.white);
        punkteLabel.setBackground(Color.white);

        //Alle zum hauptpanel hinzufügen
        titelPanel.add(rundenTitelLabel);
        titelPanel.add(punkteTitelLabel);
        titelPanel.add(punkteLabel);
        titelPanel.add(rundenLabel);

        add(titelPanel, BorderLayout.NORTH);


        //Mitte(Center)
        JPanel centerPanel=new JPanel(new GridLayout(2,2,10,5));

        centerPanel.add(new JLabel("Deine Zahl:"));
        centerPanel.add(new JLabel("Computer:"));

        spielerField=new JTextField();

        computerField=new JTextField();
        computerField.setEditable(false);

        centerPanel.add(computerField);
        centerPanel.add(spielerField);

        add(centerPanel, BorderLayout.CENTER);


        //Unten(South)
        JPanel untenPanel=new JPanel();
        button=new JButton("Noch einmal!");
        untenPanel.add(button);

        add(untenPanel, BorderLayout.SOUTH);

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
