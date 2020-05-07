package PROJET;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class QuesVoyage extends JFrame { //question de voyage

    public QuesVoyage()
    {
        JRadioButton rep ;

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout( new BoxLayout (contentPane, BoxLayout.Y_AXIS));

        JLabel l1= new JLabel("Etes vous parties en voyage pendant les 3 derniers mois");contentPane.add(l1);
        contentPane.add(l1 );
        JRadioButton r1 = new JRadioButton("oui");
        JRadioButton r2 = new JRadioButton("non");
        rep = r1 ;
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        contentPane.add(r1);
        contentPane.add(r2);

        JButton b = new JButton("Suivant");
        contentPane.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(rep.isSelected()) // si la rep est oui
                {
                    VForm v = new VForm();

                    v.setVisible(true);
                    dispose();
                }
                else // si la rep est non
                {
                    Resultat v = new Resultat();

                    v.setVisible(true);
                    dispose();
                }



            }
        });


    }
    public static void main(String[] args) throws UnsupportedLookAndFeelException, IOException {

        UIManager.setLookAndFeel(new NimbusLookAndFeel());

       QuesVoyage m = new QuesVoyage();
        m.setVisible(true);


    }}