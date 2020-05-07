package PROJET;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MaladieForm extends JFrame{

        JFrame f ;
        boolean Hypertension  ;
        boolean diabete  ;
        boolean Maladie_respiratoire  ;
        boolean Insuffisance_renale  ;
        boolean Insuffisance_cardiaque ;
        boolean Maladie_vasculaire  ;
        boolean Cancer  ;
        boolean greffe  ;

        public MaladieForm ()
        {
            super("maladies chroniques ");


            JRadioButton[] reponses1 = new JRadioButton[8];

            String[] questions = new String[8];
            questions[0]=("Avez-vous une hypertension ? ");
            questions[1]=("Avez-vous un diabete ?  ");
            questions[2]=("Avez-vous un probleme respiratoire ou maladie respiratoire ?");
            questions[3]=("Avez-vous une insuffisance renale (maladie des reins) necessitant une dialyse ?");
            questions[4]=("Avez-vous une Insuffisance cardiaque stade NYHA III ou IV ?");
            questions[5]=("Avez-vous des antecedents cardio-vasculaires  ?");
            questions[6]=("Avez-vous un cancer sous traitement ou dans les 3 dernieres annees  ?");
            questions[7]=("Avez vous faire un greffe") ;



            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.setSize(600,600);
            this.setLocationRelativeTo(null);
            JPanel contentPane = (JPanel) this.getContentPane();

            contentPane.setLayout( new BoxLayout (contentPane, BoxLayout.Y_AXIS));

            for(int i=0 ;i<questions.length ;i++ ) {



                JLabel l1= new JLabel(questions[i]);contentPane.add(l1);
                contentPane.add(l1 );
                JRadioButton r1 = new JRadioButton("oui");
                JRadioButton r2 = new JRadioButton("non");
                reponses1[i] = r1 ;

                ButtonGroup bg = new ButtonGroup();
                bg.add(r1);
                bg.add(r2);
                contentPane.add(r1);
                contentPane.add(r2);

            }

             // button suivant
            JButton b = new JButton("suivant");
            contentPane.add(b);

             // passage a la fenetre suivante et input des données dans un fichier


            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e)  {


                    for(int j=0 ;j< questions.length ; j++)
                    {

                        //System.out.println(reponses1[j].isSelected()) ;
                        if (reponses1[j].isSelected() )
                        {

                            switch(questions[j]) {
                                case "Avez-vous une hypertension ? " : Hypertension=reponses1[j].isSelected(); break;
                                case "Avez-vous un diabete ?  " : diabete=reponses1[j].isSelected();break;
                                case "Avez-vous un probleme respiratoire ou maladie respiratoire ?" : Maladie_respiratoire=reponses1[j].isSelected(); break;
                                case "Avez-vous une insuffisance renale (maladie des reins) necessitant une dialyse ?" :Insuffisance_renale=reponses1[j].isSelected(); break;
                                case "Avez-vous une Insuffisance cardiaque stade NYHA III ou IV ?" : Insuffisance_cardiaque=reponses1[j].isSelected(); break;
                                case "Avez-vous des antecedents cardio-vasculaires  ?" : Maladie_vasculaire=reponses1[j].isSelected(); break;
                                case "Avez-vous un cancer sous traitement ou dans les 3 dernieres annees  ?" : Cancer=reponses1[j].isSelected(); break;
                                case "Avez vous faire un greffe" : greffe=reponses1[j].isSelected(); break;
                            }


                        }

                    }
                    PrintWriter out;
                    try {
                        out = new PrintWriter (new FileWriter("exemple.txt"));
                        boolean [] monTableau = {Hypertension,diabete,Maladie_respiratoire,Insuffisance_renale,
                                Insuffisance_cardiaque,Maladie_vasculaire,Cancer ,greffe};
                        for(int j=0;j<monTableau.length;j++)
                        {

                            out.println(monTableau[j]) ;
                        }
                        out.close() ;
                    } catch (IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }

                    // passage a la fentre confinement
                    ConfinementForm c = new ConfinementForm();
                    c.setVisible(true);



                    dispose();



                }


            });


        }






   public static void main(String[] args) throws UnsupportedLookAndFeelException, IOException {

            UIManager.setLookAndFeel(new NimbusLookAndFeel());

            MaladieForm m = new MaladieForm();
            m.setVisible(true);






        }}





