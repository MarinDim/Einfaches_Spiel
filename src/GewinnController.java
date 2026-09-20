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
}
