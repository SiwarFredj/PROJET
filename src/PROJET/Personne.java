package PROJET;

import java.util.Scanner;
public class Personne {

    int age;
    boolean sexe;
    boolean fumeur;
    public String region;
    Confinement C;
    Symptomes S;
    Voyages V;

    public Personne() {

    }

    public Personne(int a, boolean s, boolean f, String r) {
        this.age = a;
        this.sexe = s;
        this.fumeur = f;
        this.region = r;
    }

    public Personne(int a, boolean s, boolean f, String region, Confinement C, Symptomes S, Voyages v) {
        this.age = a;
        this.sexe = s;
        this.fumeur = f;

        this.region = region;
        this.C = C;
        this.S = S;
        this.V = v;
    }


    public void questions() {
        Scanner clavier = new Scanner(System.in);
       //input age
        System.out.println("Quelle est votre age");
        int a  = clavier.nextInt();


        //input sexe
        System.out.println("Quelle est votre sexe");
        String s1=clavier.nextLine();
        boolean sexe = true;
        if (s1.toLowerCase().equals("Homme"))
            sexe=true;
        if(s1.toLowerCase().equals("femme"))
            sexe=false;



        //input fumeur
        System.out.println("est ce que vous etes fumeur");
        String f = clavier.nextLine();
        boolean fumeur=false;
        if (f.toLowerCase().equals("oui"))
            fumeur=true;



        //input region
        System.out.println("Quelle est votre region ");
        String region = clavier.nextLine();


        // respect de confinement + calcul
        Confinement c1 = new Confinement();
        c1.Questionnaire();


        // resultat de calcul Symptomes
        Symptomes s2 = new Symptomes();
        int n = s2.calcul();


        // partie voyage
        System.out.println("Etes vous parties en voyage pendant les 3 derniers mois");
        String voy = clavier.nextLine();
        if (voy.toLowerCase().equals("oui")) {
            Voyages v1 = new Voyages();
            v1.questions();
        }


    }
}