import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GewinnController {
    private GewinnModel model;
    private GewinnView view;

    public GewinnController(GewinnModel model, GewinnView view){
        this.model=model;
        this.view=view;
    }

    public void spielRunde(){
        String eingabe=view.getSpielerField().getText();

        try{
            int eingabeZahl=Integer.parseInt(eingabe);
            if(eingabeZahl<1||eingabeZahl>9){
                JOptionPane.showMessageDialog(view, "Ein Zahl zwischen 1 und 9 eingeben!", "Falsche Eingabe", JOptionPane.ERROR_MESSAGE);
                return;
            }

            model.berechneRunde(eingabeZahl);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(view, "Ein Zahl zwischen 1 und 9 eingeben!", "Falsche Eingabe", JOptionPane.ERROR_MESSAGE);
        }
    }
}
