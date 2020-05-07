package PROJET;
import java.util.Scanner;

public class Symptomes {
	boolean fiev ;
	boolean toux;
	boolean dif;
	boolean fat;
	boolean cour;
	boolean ec;
	boolean maux;
	boolean mal;
	boolean dia;
	
	public Symptomes() {
		this.fiev=false;
		this.toux=false;
		this.dif=false;
		this.fat=false;
		this.cour=false;
		this.ec=false;
		this.maux=false;
		this.mal= false;
		this.dia=false;
	}
	/*public Symptomes(boolean f1,boolean f2, boolean f3, boolean f4 , boolean f5 , boolean f6 , boolean f7
						,boolean f8, boolean f9)
	{
		this.fiev=f1 ;
		this.toux=f2;
		this.dif=f3;
		this.fat=f4;
		this.cour=f5;
		this.ec=f6;
		this.maux=f7;
		this.mal= f8;
		this.dia=f9;
	}*/
	public int calcul () {
		int s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("quelle est votre temperature corporelle ?");
		float fi =sc.nextInt();
		if (fi>37.8)
		{ this.fiev=true;
		     s=s+30;}
		System.out.println("Est-ce que vous avez une toux récente ?Repondez par 0 ou 1");
		int t= sc.nextInt();
		 if (t==1)
		 { this.toux =true;
		    s=s+25;}
		 System.out.println("Est-ce que vous avez des difficultés respiratoires ?Repondez par 0 ou 1");
		 int di=sc.nextInt();
		 if(di==1)
		 { this.dif =true;
		    s=s+15;}
		 System.out.println("Avez-vous une fatigue inhabituelle ces derniers jours ?Repondez par 0 ou 1");
		 int fa=sc.nextInt();
		 if(fa==1)
		 { this.fat =true;
		    s=s+5;}
		 System.out.println("Avez-vous des courbatures en dehors des douleurs musculaires liées à une activité sportive intense ? ?Repondez par 0 ou 1");
		 int co=sc.nextInt();
		 if(co==1)
		 { this.cour =true;
		    s=s+5;}
		 System.out.println("Avez-vous maux de tete ?Repondez par 0 ou 1");
		 int ma=sc.nextInt();
		 if(ma==1)
		 { this.maux =true;
		    s=s+5;}
		 System.out.println("Avez-vous ecoulement nasale ?Repondez par 0 ou 1");
		 int e=sc.nextInt();
		 if(e==1)
		 { this.ec =true;
		    s=s+5;}
		 System.out.println("Avez-vous mal a gorge ?Repondez par 0 ou 1");
		 int m=sc.nextInt();
		 if(m==1)
		 { this.mal =true;
		    s=s+5;}
		 System.out.println("Avez-vous maux de tete ?Repondez par 0 ou 1");
		 int d=sc.nextInt();
		 if(d==1)
		 { this.dia =true;
		    s=s+5;}		 
		 return s;  }
	
	public static void main(String[] args)
	{
		Symptomes s= new Symptomes();
		System.out.println(s.calcul());
		
	}

}
