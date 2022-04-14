import java.util.Scanner;

public class Compte {
	//Attribut
	private String nom, prenom;
	private int numero;
	private float solde;
	//Constructeur
	public Compte(){
		this.nom="";
		this.prenom="";
		this.numero=0;
		this.solde=0;
	}
	
	//Methodes
	public void ouvrir(){
		//Instanciation de la classe Scanner Java.util
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez le nom : ");
		this.nom = sc.next();
		System.out.println("Donnez le prénom : ");
		this.prenom = sc.next();
		System.out.println("Donnez le numéro : ");
		this.numero = sc.nextInt();
		System.out.println("Donnez le solde : ");
		this.solde = sc.nextFloat();
	}
	public void deposer(){
		Scanner sc = new Scanner(System.in);
		float somme;
		System.out.println("Donnez la somme à déposer : ");
		somme= sc.nextFloat();
		this.solde = this.solde+somme;
	}
	public void retirer(){
		Scanner sc = new Scanner(System.in);
		float somme;
		System.out.println("Donnez la somme à retirer : ");
		somme= sc.nextFloat();
		if(somme<=solde){
			this.solde = this.solde-somme;
			System.out.println("Retrait effectué");
		}
		else {
			System.out.println("Solde insuffisant");
		}
	}
	public void consulter(){
		System.out.println("_____INFOS DU COMPTE______");
		System.out.println("Le nom   : " + this.nom);
		System.out.println("Le prénom : " + this.prenom);
		System.out.println("Le numéro    : " + this.numero);
		System.out.println("Le solde        : " + this.solde);
	}
	public void menu(){
		int choix=0;
        Scanner sc=new Scanner (System.in);
        do {
            System.out.println("____MENU Bank____");
            System.out.println("__1__ Ouvrir un compte ");
            System.out.println("__2__ Donner une somme ");
            System.out.println("__3__ Récuperer une somme ");
            System.out.println("__4__ Consulter le compte ");
            System.out.println("__0__ Quitter ");
            System.out.println("Votre choix : ");
            choix= sc.nextInt();
            switch(choix) 
	            {
	            case 1: this.ouvrir(); break;
	            case 2: this.deposer(); break;
	            case 3: this.retirer(); 
	            	break;
	            case 4: this.consulter(); 
            	break;
	            }
        	}while (choix !=0);
	}
	//Getters and Setters

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
	
}