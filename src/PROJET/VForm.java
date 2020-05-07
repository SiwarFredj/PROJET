package PROJET;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class VForm extends JFrame {
    private JPanel p1 ;
    public VForm()
    {
        super("informations sur les voyages  ");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600,600);
        this.setLocationRelativeTo(null);




        JPanel contentPane = (JPanel) this.getContentPane();

        contentPane.setLayout( new BoxLayout (contentPane, BoxLayout.Y_AXIS));
        contentPane.add(new JLabel("quelles sont les pays visitées pendant les 3 derniers mois ?"));



        Box box = new Box(BoxLayout.Y_AXIS);
        JCheckBox[] j = new JCheckBox[22];
        Donnees d = new Donnees();
        String[] tab =  d.getListePays();
        for ( int i = 0 ; i<22;i++)
        {
            j[i]= new JCheckBox((tab[i]));
            box.add(j[i]);
        }




        contentPane.add(box);

        JButton b = new JButton("suivant");
        contentPane.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int nbr=0;
                String[] tab = new String[22];
                for ( int k=0;k<j.length;k++)
                {
                    if (j[k].isSelected()) {
                        tab[nbr]=j[k].getLabel();
                        nbr++;

                    }
                }
                try{
                    File myObj = new File("voyages.txt");
                        int k =0;
                        int i =0;
                        boolean stop= false;
                        while(stop==false)
                        {
                            if(j[k].isSelected()) {
                                VoyForm v = new VoyForm(tab,i,nbr);
                                v.setVisible(true);
                                stop=true;
                            }
                            k++;

                        }
                    dispose();
                    }

                catch (Exception ex)
                {
                    System.out.println("An error occurred1.");
                }




                   }


        });

    }

    public static void main(String[] args) throws Exception
    {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        PROJET.VForm m = new PROJET.VForm();
        m.setVisible(true);

    }
}
