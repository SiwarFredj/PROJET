package PROJET;

import java.util.Hashtable;

public class Donnees {
    Hashtable region ;
    Hashtable pays ;
    public Donnees()
    {
        // input region nbr de cas dans cette region par rapport au nombre total d'infection dans la tunisie

        Hashtable tab = new Hashtable();
        tab.put("kbeli", new Double(0.099));
        tab.put("tunis",new Double(0.223));
        tab.put("ariana",new Double(0.098));
        tab.put("ben arous",new Double(0.094));
        tab.put("mednin",new Double(0.088));
        tab.put("sousse",new Double(0.082));
        tab.put("gafsa",new Double(0.044));
        tab.put("mannouba",new Double(0.04));
        tab.put("monastir",new Double(0.037));
        tab.put("sfax",new Double(0.036));
        tab.put("tatouane",new Double(0.036));
        tab.put("bizerte",new Double(0.025));
        tab.put("gabes",new Double(0.023));
        tab.put("mahdia",new Double(0.016));
        tab.put("nabeul",new Double(0.014));
        tab.put("kasserine",new Double(0.009));
        tab.put("kairouan",new Double(0.007));
        tab.put("el kef",new Double(0.007));
        tab.put("sidi bouzid",new Double(0.005));
        tab.put("tozeur",new Double(0.005));
        tab.put("beja",new Double(0.003));
        tab.put("seliana",new Double(0.003));
        tab.put("zaghouan",new Double(0.003));
        tab.put("jendouba",new Double(0.001));





        region = tab ;

        // Tableau region pret

        //System.out.println(tab.get("mahdia"));

        //input pays nbr de cas infecté par rapport au nombre de tests totatls faits

        Hashtable tab1 = new Hashtable();
        tab1.put("usa", new Double(0.16));
        tab1.put("spain", new Double(0.16));
        tab1.put("italy", new Double(0.1));
        tab1.put("uk", new Double(0.16));
        tab1.put("france", new Double(0.15));
        tab1.put("turkey", new Double(0.12));
        tab1.put("russia", new Double(0.04));
        tab1.put("brazil", new Double(0.3));
        tab1.put("iran", new Double(0.25));
        tab1.put("china", new Double(0.03));
        tab1.put("canada", new Double(0.06));
        tab1.put("peru", new Double(0.15));
        tab1.put("pays_bas", new Double(0.2));
        tab1.put("belgique", new Double(0.2));
        tab1.put("sweden", new Double(0.2));
        tab1.put("sa", new Double(0.09));
        tab1.put("qatar", new Double(0.15));
        tab1.put("uae", new Double(0.01));
        tab1.put("egypt", new Double(0.08));
        tab1.put("maroc", new Double(0.1));
        tab1.put("algeria", new Double(0.1));
        tab1.put("tunisia", new Double(0.04));









        pays = tab1 ;

    }
    // methode pour le calcul dans les classes
    public Hashtable getRegion()
    {

        return region;
    }

    // methode pour l'affichage dans les fenetres
    public String[] getListeRegion()
    {


        String[] tab = new String[24];

        tab[0]="ariana";
        tab[1]="beja";
        tab[2]="ben arous";
        tab[3]="bizerte";
        tab[4]="gabes";
        tab[5]="gafsa";
        tab[6]="jendouba";
        tab[7]="kairouan";
        tab[8]="kasserine";
        tab[9]="kbeli";
        tab[10]="el kef";
        tab[11]="mahdia";
        tab[12]="mannouba";
        tab[13]="mednin";
        tab[14]="monastir";
        tab[15]="nabeul";
        tab[16]="sfax";
        tab[17]="sidi bouzid";
        tab[18]="seliana";
        tab[19]="sousse";
        tab[20]="tatouane";
        tab[21]="tozeur";
        tab[22]="tunis";
        tab[23]="zaghouan";

        return tab;







    }
    //methode pour le calcul dans les classes
    public Hashtable getPays()

    {
        return(this.pays);
    }

    // methode pour l'affichage dans les fenetres
    public String[] getListePays()
    {


        String[] tab = new String[22];
        tab[0]="usa";
        tab[1]="spain";
        tab[2]="italy";
        tab[3]="uk";
        tab[4]="france";
        tab[5]="turkey";
        tab[6]="russia";
        tab[7]="brazil";
        tab[8]="iran";
        tab[9]="china";
        tab[10]="canada";
        tab[11]="peru";
        tab[12]="pays_bas";
        tab[13]="belgique";
        tab[14]="sweden";
        tab[15]="sa";
        tab[16]="qatar";
        tab[17]="uae";
        tab[18]="egypt";
        tab[19]="maroc";
        tab[20]="algeria";
        tab[21]="tunisia";
        return tab;
    }
}
