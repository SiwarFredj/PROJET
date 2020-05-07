 package PROJET ;
public class Voyage {

    String j ;     //jour de voyage
    String ch;  //nom de l'aeroport
    boolean precaution; // est ce que le voyageur a pris les precautions pendant le voyage
    String transport; // transport utilisé
    int nbr; // frequence d'utilisation de trasnport
   //constucteur avec parametre
    public Voyage(String j , String ch , boolean p, String t,int nbr)
    {
        this.j=j;
        this.ch=ch;
        this.precaution=p;
        this.transport=t;
        this.nbr=nbr;
    }
    //constructeur par default
    public Voyage(){}
    public float Facteur_de_risque_vol()
    {
        if(precaution==false)
        {
            return 0;
        }
        else
        {
            return 0; //a revoir la valeur retournée
        }
    }
    public double Facteur_risque_trasnport()
    {
        if (this.transport=="public" )
        {
            if(this.nbr>2)
           { return 1.0;}
            else {
                return 0.5;
                }}
        else
            {
                return 0.0 ;
            } }

        public double Calcul_risque_voyage()
    {
        double a;
        a=(this.Facteur_de_risque_vol()+this.Facteur_risque_trasnport())/2;
        return a;
    }
    public void  affichage()
    {
        System.out.println("jour de voyage :"+this.j+"\n");
        System.out.println("aeroport :"+this.ch+"\n");
        System.out.println("precaution :  "+this.precaution+"\n");
        System.out.println("type de trasnport : "+this.transport+"\n");
        System.out.println("frequence d'utilisation du transport par semaine  "+this.nbr+"\n");


    }

}
