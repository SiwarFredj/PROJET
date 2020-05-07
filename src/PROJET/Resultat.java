package PROJET;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Resultat extends JFrame{


    public Resultat()
{
    super("Resultat");
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setSize(600,600);
    this.setLocationRelativeTo(null);




    JPanel contentPane = (JPanel) this.getContentPane();

    contentPane.setLayout( new BoxLayout (contentPane, BoxLayout.Y_AXIS));

    try {

        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);
        String ligne = null;
        int i = 0;
        while ((ligne = br.readLine()) != null) {
            contentPane.add(new JLabel(ligne));

        }
       }


    catch(IOException e )
        {
            System.out.println("An error occurred1.");
        }
}
    public void main(String[] args) throws Exception
    {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        PROJET.Resultat m = new PROJET.Resultat();
        m.setVisible(true);
    }
}

