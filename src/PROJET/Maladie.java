package PROJET;

import java.util.Scanner;

final public class Maladie extends Personne {
	public 
		boolean Hypertension  ;
		boolean diabete  ;
		boolean Maladie_respiratoire  ; 
		boolean Insuffisance_rénale  ; 
		boolean Insuffisance_cardiaque ;
		boolean Maladie_vasculaire  ;
		boolean Cancer  ;
		double poids ;double taille ;
	
	public Maladie(){ }

	/*public Maladie(int a , boolean s , boolean f , Confinement C , Symptomes S, Voyages v,
			boolean Hypertension,boolean diabete,boolean Maladie_respiratoire,
			boolean Insuffisance_rénale,boolean Insuffisance_cardiaque,
			boolean Maladie_vasculaire,boolean Cancer)
	{
		super(a,s,f,C,S,v);
		this.Hypertension=Hypertension ;
		this.diabete=diabete ;
		this.Maladie_respiratoire=Maladie_respiratoire ; 
		this.Insuffisance_rénale=Insuffisance_rénale ; 
		this.Insuffisance_cardiaque=Insuffisance_cardiaque ;
		this.Maladie_vasculaire=Maladie_vasculaire ;
		this.Cancer=Cancer ;
	}
	*/
	boolean Calcul_IMC( )
	
	{ 
		
		
		double x= poids/(taille*taille) ;
		if ( x> 29.5 )
			return true ;
		else
			return false ;
		
	}
	
	int Calcul_risque()
	{
		boolean [] monTableau = {Hypertension,diabete,Maladie_respiratoire,Insuffisance_rénale,
				Insuffisance_cardiaque,Maladie_vasculaire,Cancer ,Calcul_IMC()};
		int s=0 ; 
		for(int i=0; i < monTableau.length; i++)
		{
		    if (monTableau[i] == true)
		    	s++ ;
		}
		
		return s ;
		 
	}
	
	public void questions()
	{

		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Avez-vous une hypertension ? ") ;
		String ch1=clavier.nextLine(); //if(a=="oui") { Hypertension=true ; }
		if (ch1.toLowerCase().equals("oui"))
			this.Hypertension=true;
		
		System.out.println("Avez-vous un diabéte ?  ");
		 String ch2=clavier.nextLine(); //if(b=="oui") { diabete=true ;}
		if(ch2.toLowerCase().equals("oui"))
			this.diabete=true;
		
		System.out.println("Avez-vous un problème respiratoire ou maladie respiratoire ?");
		String ch3=clavier.nextLine(); //if(c=="oui") { Maladie_respiratoire=true ;}
		if(ch3.toLowerCase().equals("oui"))
			this.Maladie_respiratoire=true;
		
		System.out.println("Avez-vous une insuffisance rénale (maladie des reins) nécessitant une dialyse ?");
		String ch4=clavier.nextLine();// if(d=="oui") { Insuffisance_rénale=true ;}
		if(ch4.toLowerCase().equals("oui"))
			this.Insuffisance_rénale=true;
		
		System.out.println("Avez-vous une Insuffisance cardiaque stade NYHA III ou IV ?");
		String ch5=clavier.nextLine(); //if(e=="oui") { Insuffisance_cardiaque=true ;}
		if(ch5.toLowerCase().equals("oui"))
			this.Insuffisance_cardiaque=true;
		
		System.out.println("Avez-vous des antécédents cardio-vasculaires  ?");
		String ch6=clavier.nextLine(); //if(f=="oui") { Maladie_vasculaire=true ;}
		if(ch6.toLowerCase().equals("oui"))
			this.Maladie_vasculaire=true;
		
		System.out.println("Avez-vous un cancer sous traitement ou dans les 3 dernières années  ?");
		String ch7=clavier.nextLine();// if(j=="oui") { Cancer=true ;}
		if(ch7.toLowerCase().equals("oui"))
			this.Cancer=true;

		super.questions();
	}
	public String[] Informations()
	{
		Scanner clavier = new Scanner(System.in);
		
		
		System.out.println("Donnez votre nom svp ! ") ;
		String a =clavier.next();
		System.out.println("Donnez votre e-mail svp ! ") ;
		String b =clavier.next();
		System.out.println("Donnez votre téléphone svp ! ") ;
		String c =clavier.next();
		String [] monTableau = {a,b,c};
		
		System.out.println("Mercii , on va vous contacter prochainement ! ") ;

		return monTableau ;
		
	}


}
