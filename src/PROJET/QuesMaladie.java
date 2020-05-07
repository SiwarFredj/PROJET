package PROJET;
import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class QuesMaladie extends JFrame {  //question de maladie

    public QuesMaladie()
    {
        JRadioButton rep ;

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout( new BoxLayout (contentPane, BoxLayout.Y_AXIS));

        JLabel l1= new JLabel("Avez vous des maladies chronique");contentPane.add(l1);
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
                    MaladieForm v = new MaladieForm();

                    v.setVisible(true);
                    dispose();
                }
                else // si la rep est non
                {
                    ConfinementForm q = new ConfinementForm();
                    q.setVisible(true);
                    dispose();
                }



            }
        });


    }
    public static void main(String[] args) throws UnsupportedLookAndFeelException, IOException {

        UIManager.setLookAndFeel(new NimbusLookAndFeel());

        QuesMaladie m = new QuesMaladie();
        m.setVisible(true);






    }
}
