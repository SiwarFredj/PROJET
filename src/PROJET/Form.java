
    package PROJET;

    import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;


    class Form extends JFrame {
        private JPanel p1;

        public Form()
        {
            super("informations generales ");
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.setSize(600,600);
            this.setLocationRelativeTo(null);




            JPanel contentPane = (JPanel) this.getContentPane();

            contentPane.setLayout( new BoxLayout (contentPane, BoxLayout.Y_AXIS));



            // start

            // inoput age


            contentPane.add(new JLabel("Quelle est votre age", JLabel.LEFT));
            JTextField ok= new JTextField("",4);
            ok.setMaximumSize(new Dimension(50,20));
            contentPane.add(ok,BorderLayout.CENTER);
            // input sexe

            contentPane.add(new JLabel("Quelle est votre sexe", JLabel.LEFT) );
            JRadioButton r1 = new JRadioButton("homme");
            JRadioButton r2 = new JRadioButton("femme");
            ButtonGroup bg = new ButtonGroup();
            bg.add(r1);
            bg.add(r2);
            contentPane.add(r1);
            contentPane.add(r2);


            // input poids
            contentPane.add(new JLabel("Quelle est votre poids", JLabel.LEFT));
            JTextField p= new JTextField("",4);
            p.setMaximumSize(new Dimension(50,20));
            contentPane.add(p,BorderLayout.CENTER);

            // input taille

            contentPane.add(new JLabel("Quelle est votre taille", JLabel.LEFT));
            JTextField p1= new JTextField("",4);
            p1.setMaximumSize(new Dimension(50,20));
            contentPane.add(p1,BorderLayout.CENTER);

            contentPane.add(new JLabel("etes vous fumeur "));
            JRadioButton R1 = new JRadioButton("oui");
            JRadioButton R2 = new JRadioButton("non");
            ButtonGroup bg1 = new ButtonGroup();
            bg1.add(R1);
            bg1.add(R2);




            contentPane.add(R1);
            contentPane.add(R2);


            // input region

            contentPane.add( new JLabel(("Quelle est votre region")));
            

            Choice c = new Choice();
            Donnees d = new Donnees();
            String [] tab = d.getListeRegion();
            for(int i =0 ; i<24;i++)
                c.add(tab[i]);

            c.setMaximumSize(new Dimension(70,50));
            contentPane.add(c);


            // button next

            JButton b = new JButton("suivant");
            contentPane.add(b);

            // passage a la fenetre suivante et input des données dans un fichier


            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    String region = c.getItem(c.getSelectedIndex());


                    int age =Integer.parseInt(ok.getText());

                    boolean sexe =false ;
                    if (r1.isSelected())
                        sexe=true;
                    if(r2.isSelected())
                        sexe=false;


                    boolean fumeur = false;
                    if(R1.isSelected())
                        fumeur=true;
                    if ( R2.isSelected())
                        fumeur=false;

                    int poids = Integer.parseInt(p.getText());

                    int taille = Integer.parseInt(p1.getText());

                    try {
                        File myObj = new File("general.txt");
                        FileWriter myWriter = new FileWriter("general.txt");
                        myWriter.write(age+"\n");
                        myWriter.write(sexe+"\n");
                        myWriter.write(poids+"\n");
                        myWriter.write(taille+"\n");
                        myWriter.write(fumeur+"\n");
                        myWriter.write(region+"\n");
                        myWriter.close();

                    }
                    catch (Exception ex) {
                        System.out.println("An error occurred.");

                    }


                    // passage a la fenetre symptome

                    SymptomeForm f = new SymptomeForm();
                    f.setVisible(true);
                    dispose();

                    dispose();
                }
            });


            }

        public static void main(String[] args) throws Exception
        {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            PROJET.Form m = new PROJET.Form();
            m.setVisible(true);
        }

    }

