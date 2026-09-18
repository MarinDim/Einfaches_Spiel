import java.util.Random;

public class GewinnModel {
    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int runderErgebnis;

    public GewinnModel(){
        this.gesamtPunkte=30; //Startpunkte auf 30 setzen
    }

    public void berechneComputerZahl(){
        Random zufall=new Random();
        this.computerZahl=zufall.nextInt(9)+1; //Eine Zufallszahl zwischen 1 und 9 erstellen
    }

    public void berechneRunde(int spielerZahl){
        this.spielerZahl=spielerZahl; //Setzt der spielerZahl auf der eingegebene Zahl
        berechneComputerZahl(); //Erstellt eine Zahl für den Computer

        int abstand=this.spielerZahl-this.computerZahl; //Berechnen, wie nah die Schätzung war
        if(abstand==0){
            runderErgebnis=20;
        }
        else if(abstand==1||abstand==-1){
            runderErgebnis=5;
        }
        else{
            runderErgebnis=-10;
        }
    }

    public boolean hatGewonnen(){
        if(gesamtPunkte>=100){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean hatVerloren(){
        if(gesamtPunkte<=0){
            return true;
        }
        else{
            return false;
        }
    }

    public int getGesamtPunkte() {
        return gesamtPunkte;
    }

    public int getSpielerZahl() {
        return spielerZahl;
    }

    public int getComputerZahl() {
        return computerZahl;
    }

    public int getRunderErgebnis() {
        return runderErgebnis;
    }
}
