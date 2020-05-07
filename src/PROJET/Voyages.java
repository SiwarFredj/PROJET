
package PROJET;

import java.util.Scanner;

public class Voyages {

 int nbr;
 Voyage[] tab ;
 public Voyages(){}

    public void inserer(int i ,Voyage p )
    {
        this.tab[i]=p;
    }
    public double  Facteur_Voyages()
    {
        double  s=0;
        for ( int i=0;i<this.nbr;i++)
        {
            s += this.tab[i].Calcul_risque_voyage();
        }
        return s;
    }

    public void questions() {

        Scanner clavier = new Scanner(System.in);

        System.out.println("quelles sont les pays visitées pendant les 3 derniers mois ? ");
        String str = clavier.nextLine();
        String tab1[];
        tab1 = str.split(" ");
        this.nbr=tab1.length;
        this.tab= new Voyage[this.nbr];
        for (int i = 0; i<tab1.length; i++) {
            // input date de vol
            System.out.println("Quel est le jour de votre vol à "+tab1[i]);
            String jour= clavier.nextLine();
            //input nom de aeroport
            System.out.println("Quel est l'aeroport de depart");
            String a= clavier.nextLine();
            //input precaution
            System.out.println("est ce que vous avez respecté les precaution pendant votre vol repondez par oui ou non ");
            String precaution= clavier.nextLine();
            boolean ok;
            if (precaution.toLowerCase().equals("oui"))
                 ok= true;
            else
                ok=false;
            // input type de transport
            System.out.println("Quelle est le type de transport le plus fréquenté pendant votre voyage");
            String trans= clavier.nextLine();
            //input frequence d'utlisation de transport
            System.out.println("Combien de fois vous utilisez le trasnport par semaine ");
            int n= clavier.nextInt();
            Voyage v= new Voyage(jour,a,ok,trans,n);
            this.inserer(i,v);
        }
    }



    }
