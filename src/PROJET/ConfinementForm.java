package PROJET;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class ConfinementForm  extends JFrame {
    private JPanel p1;
    boolean Transport;
    boolean Grand_surface;
    boolean Travail;
    boolean visite; //visiste à un relatif en voyage

    public ConfinementForm() {
        super("respect du confinement   ");
        JRadioButton[] reponses1 = new JRadioButton[4];
        JRadioButton[] reponses2 = new JRadioButton[4];

        String[] questions = new String[4];
        questions[0] = ("avez-vous pris le le transport public ? ");
        questions[1] = (" Avez-vous visité des magasin ou grand_surface ?");
        questions[2] = ("Avez-vous travaillé dernièrement ?");
        questions[3] = ("Avez-vous des visites à un relatif qui été en voyage ?");


        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        JPanel contentPane = (JPanel) this.getContentPane();

        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));


        // start


        for (int i = 0; i < questions.length; i++) {


            JLabel l1 = new JLabel(questions[i]);
            contentPane.add(l1);
            contentPane.add(l1);
            JRadioButton r1 = new JRadioButton("oui");
            JRadioButton r2 = new JRadioButton("non");
            reponses1[i] = r1;
            //      reponses2[i] = r2 ;
            ButtonGroup bg = new ButtonGroup();
            bg.add(r1);
            bg.add(r2);
            contentPane.add(r1);
            contentPane.add(r2);

        }


        JButton b = new JButton("suivant");
        contentPane.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                for (int j = 0; j < questions.length; j++) {

                    //System.out.println(reponses1[j].isSelected()) ;
                    if (reponses1[j].isSelected())
                        switch (questions[j]) {
                            case "Avez-vous une hypertension ? ":
                                Transport = reponses1[j].isSelected();
                                break;
                            case "Avez-vous un diabete ?  ":
                                Grand_surface = reponses1[j].isSelected();
                                break;
                            case "Avez-vous un probleme respiratoire ou maladie respiratoire ?":
                                Travail = reponses1[j].isSelected();
                                break;
                            case "Avez-vous une insuffisance renale (maladie des reins) necessitant une dialyse ?":
                                visite = reponses1[j].isSelected();
                                break;
                        }

                }
                PrintWriter out;
                try {
                    out = new PrintWriter(new FileWriter("exempleconf.txt"));
                    boolean[] monTableau = {Transport, Grand_surface, Travail, visite,};
                    for (int j = 0; j < monTableau.length; j++) {

                        out.println(monTableau[j]);
                    }
                    out.close();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }


                QuesVoyage q = new QuesVoyage();

                q.setVisible(true);
                dispose();

                //contentPane.setVisible(false);

                //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


            }


        });


    }


    public static void main(String[] args) throws UnsupportedLookAndFeelException, IOException {

        UIManager.setLookAndFeel(new NimbusLookAndFeel());

        ConfinementForm m = new ConfinementForm();
        m.setVisible(true);


    }


}