package PROJET;
import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SymptomeForm extends JFrame {
    private JPanel container = new JPanel();
    private JTextArea text = new JTextArea();
    boolean fiev ;
    boolean toux;
    boolean dif;
    boolean fat;
    boolean cour;
    boolean ec;
    boolean maux;
    boolean mal;
    boolean dia;

    public SymptomeForm() {

        JRadioButton[] r1 = new JRadioButton[8];
        JRadioButton[] r2 = new JRadioButton[8];
        String[] questions = new String[8];
        questions[0]=("Est-ce que vous avez une toux récente ?");
        questions[1]=("Est-ce que vous avez des difficultés respiratoires?");
        questions[2]=("Avez-vous une fatigue inhabituelle ces derniers jours ?");
        questions[3]=("Avez-vous des courbatures en dehors des douleurs musculaires liées à une activité sportive intense ?");
        questions[4]=("Avez-vous maux de tete ?");
        questions[5]=("Avez-vous ecoulement nasale ?");
        questions[6]=("Avez-vous mal a gorge ?");
        questions[7]=("Avez-vous diarrhée ?") ;

        this.setTitle("les symptomes");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        container.setLayout(new BorderLayout());
        JPanel top = new JPanel();
        top.setLayout( new BoxLayout (top, BoxLayout.Y_AXIS));
        JLabel l =new JLabel("Quelle est votre temperature corporelle ?");
        top.add(l);
        JTextArea text = new JTextArea();
        text.setMaximumSize(new Dimension(80,30));
        top.add(text,BorderLayout.CENTER);
        for(int i=0 ;i<questions.length ;i++ ) {

            JLabel l1= new JLabel(questions[i]);
            top.add(l1);
            JRadioButton b1 = new JRadioButton("oui");
            JRadioButton b2 = new JRadioButton("non");
            r1[i] = b1 ;
            r2[i] = b2 ;
            ButtonGroup bg = new ButtonGroup();
            bg.add(b1);
            bg.add(b2);
            top.add(b1);
            top.add(b2);
        }

        JButton b= new JButton("suivant");
        top.add(b);
        container.add(top, BorderLayout.NORTH);
        this.setContentPane(container);
        // this.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void  actionPerformed(ActionEvent e) {
                double d = Double.valueOf(text.getText());
                if(d>37.5)
                {
                    fiev=true;
                }
                else fiev= false;

                for(int j=0 ;j< questions.length ; j++)
                {
                    switch(questions[j]) {
                        case "Est-ce que vous avez une toux récente ?" :toux=r1[j].isSelected(); break;
                        case "Est-ce que vous avez des difficultés respiratoires?" : dif=r1[j].isSelected();break;
                        case "Avez-vous une fatigue inhabituelle ces derniers jours ?" : fat=r1[j].isSelected(); break;
                        case"Avez-vous des courbatures en dehors des douleurs musculaires liées à une activité sportive intense ?" :cour=r1[j].isSelected(); break;
                        case "Avez-vous maux de tete ?" : maux=r1[j].isSelected(); break;
                        case "Avez-vous ecoulement nasale ?" : ec=r1[j].isSelected(); break;
                        case "Avez-vous mal a gorge ?" : mal=r1[j].isSelected(); break;
                        case "Avez-vous diarrhée ?" : dia=r1[j].isSelected(); break; }
                }


                // passage a la prochaine fenetre
                QuesMaladie q = new QuesMaladie();
                q.setVisible(true);
                dispose();

            }


        });
    }
    public static void main(String[] args) throws UnsupportedLookAndFeelException {

        UIManager.setLookAndFeel(new NimbusLookAndFeel());

        SymptomeForm f= new SymptomeForm();
        f.setVisible(true);

    }
}
