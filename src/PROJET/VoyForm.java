package PROJET;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class VoyForm extends JFrame {

   JButton b ;
   JTextField t, t1 , t2 ;
   Choice c ;
   JRadioButton r1, r2 ;
   public Voyage voy ;
    public VoyForm(String[] tab,int i , int nbr) {
        super(tab[i]);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        if (nbr>0)
        {
            this.setSize(600, 600);
            this.setLocationRelativeTo(null);

            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel contentPane = (JPanel) this.getContentPane();

        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        contentPane.add(new JLabel("Quel est le jour de votre vol à " + tab[i]));
        JTextField t = new JTextField();
        t.setMaximumSize(new Dimension(50, 20));
        contentPane.add(t);
        contentPane.add(new JLabel("Quel est l'aeroport de depart"));
        JTextField t1 = new JTextField();
        t1.setMaximumSize(new Dimension(50, 20));
        contentPane.add(t1);
        contentPane.add(new JLabel("est ce que vous avez respecté les precaution pendant votre vol"));
        JRadioButton r1 = new JRadioButton("oui");
        JRadioButton r2 = new JRadioButton("non");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        contentPane.add(r1);
        contentPane.add(r2);

        contentPane.add(new JLabel("Quelle est le type de transport le plus fréquenté pendant votre voyage"));
        Choice c = new Choice();

        c.add("Privé");
        c.add("Public");


        c.setMaximumSize(new Dimension(70, 50));
        contentPane.add(c);

        contentPane.add(new JLabel("Combien de fois vous utilisez le trasnport par semaine"));
        JTextField t2 = new JTextField();
        t2.setMaximumSize(new Dimension(50, 20));
        contentPane.add(t2);
        b = new JButton("suivant");
        contentPane.add(b);


        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                String date =t.getText();
                String aeroport= t1.getText();


                boolean precaution =false ;
                if (r1.isSelected())
                    precaution=true;
                if(r2.isSelected())
                    precaution=false;

                String transport = c.getItem(c.getSelectedIndex());
                int frequence = Integer.parseInt(t2.getText());
                try {

                    FileWriter myWriter = new FileWriter("voyages.txt",true);
                    myWriter.write(tab[i]+"\n");
                    myWriter.write(date+"\n");
                    myWriter.write(aeroport+"\n");
                    myWriter.write(precaution+"\n");
                    myWriter.write(transport+"\n");
                    myWriter.write(frequence+"\n");
                    myWriter.close();

                }
                catch (Exception ex) {
                    System.out.println("An error occurred2.");

                }

                VoyForm v = new VoyForm(tab,i+1,nbr-1);
                v.setVisible(true);
                dispose();



                    }

        });

    }
    else
        {
            Resultat r = new Resultat();
            r.setVisible(true);
            this.setLocationRelativeTo(null);
            dispose();
        }


    }





}
