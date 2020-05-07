package PROJET;

import java.util.Scanner;

public class Confinement  {
	public 
		boolean Transport  ;
		boolean Grand_surface;
		boolean Travail  ; 
		boolean Visite_à_un_relatif_en_voyage  ; 




	public Confinement()
	{
		this.Transport=true  ;
		this.Grand_surface=true;
		this.Travail=true ;
		this.Visite_à_un_relatif_en_voyage=true ;
	}
	
	public boolean Calcul_risque_infection( )
	
	{ 
		
		
		boolean test  ;
	    test= (Transport && Travail && Grand_surface && Visite_à_un_relatif_en_voyage ) ;	
		return test ;
		
	}
	

	void Questionnaire ()  
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("avez-vous pris le le transport public ? ") ;
		String T= sc.nextLine(); //if(a=="oui") { Transport=true ; }
		if ( T.toLowerCase().equals("oui"))
			Transport=false;
		else
			Transport=true;
		
		System.out.println("Avez-vous visité des magasin ou grand_surface ?  ");
		String  GM= sc.nextLine(); //if(b=="oui") { Grand_surface=true ;}
		if (GM.toLowerCase().equals("oui"))
			Grand_surface=false;
		else
			Grand_surface=true;
		
		System.out.println("Avez-vous travaillé dernièrement ?");
		String Tr =sc.nextLine(); //if(c=="oui") { Travail=true ;}
		if (Tr.toLowerCase().equals("oui"))
			Travail=false;
		else
			Travail=true;
		
		System.out.println("Avez-vous des visites à un relatif qui été en voyage ?");
		String Vi=sc.nextLine();// if(d=="oui") { Visite_à_un_relatif_en_voyage=true ;}
		if (Vi.toLowerCase().equals("oui"))
			Visite_à_un_relatif_en_voyage=false;
		else
			Visite_à_un_relatif_en_voyage=true;
		
			
	}
	 
	public void  Message ()
	{ 
		if ( this.Calcul_risque_infection() == true )
			{ 
			System.out.println("Merci pour votre patience et n'oublier pas de rester à la maison") ;
			}
		else
	     	{ 
			System.out.println(" ils nous implorent de prendre la crise du coronavirus au sérieux et de rester à la maison.") ;
        	}
	}

}
