import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GewinnController {
    private GewinnModel model;
    private GewinnView view;

    public GewinnController(GewinnModel model, GewinnView view){
        this.model=model;
        this.view=view;

        this.view.getSpielerField().addActionListener(e -> spielRunde());
        this.view.getButton().addActionListener(e->rundeZuruecksetzen());
    }

    public void spielRunde(){
        String eingabe=view.getSpielerField().getText();

        try{
            int eingabeZahl=Integer.parseInt(eingabe);
            if(eingabeZahl<1||eingabeZahl>9){
                JOptionPane.showMessageDialog(view, "Ein Zahl zwischen 1 und 9 eingeben!", "Falsche Eingabe", JOptionPane.ERROR_MESSAGE);
                return;
            }

            model.berechneRunde(eingabeZahl); //Berechnen
            viewAktualisieren(); //View Aktualisieren
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(view, "Ein Zahl zwischen 1 und 9 eingeben!", "Falsche Eingabe", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void viewAktualisieren(){
        view.getComputerField().setText(Integer.toString(model.getComputerZahl()));

        int ergebnis=model.getRundenErgebnis();
        String ergebnisText;
        if(ergebnis>0){
            ergebnisText="+" + ergebnis;
        }
        else{
            ergebnisText=Integer.toString(ergebnis);
        }

        if(model.hatGewonnen()==true){
            view.getRundenLabel().setText("Gewonnen");
        }
        else{
            view.getRundenLabel().setText("Verloren");
        }

        view.getPunkteLabel().setText(Integer.toString(model.getGesamtPunkte()));

        if(ergebnis>0||model.hatGewonnen()==true){
            view.getRundenLabel().setBackground(Color.green); //Alles auf grün setzen, wenn man gewonnen hat
            view.getPunkteLabel().setBackground(Color.green);
        }
        else if(ergebnis<0||model.hatVerloren()==true){
            view.getRundenLabel().setBackground(Color.red); //Alles auf rot setzen, wenn man verliert
            view.getPunkteLabel().setBackground(Color.red);
        }
        else{
            view.getRundenLabel().setBackground(Color.white);
            view.getPunkteLabel().setBackground(Color.white);
        }
    }

    public void rundeZuruecksetzen(){
        view.getSpielerField().setText("");
        view.getComputerField().setText("");
        view.getRundenLabel().setText("Ein Zahl von 1 bis 9 wählen");
    }
}
