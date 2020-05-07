package PROJET;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Test2 {

    public static void main(String[] args) throws Exception
    {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());

        PROJET.Form m = new PROJET.Form();
        m.setVisible(true);


        //PROJET.Resultat m = new PROJET.Resultat();
        //m.setVisible(true);
    }
}
