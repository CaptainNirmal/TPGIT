public class Pays {

	
	//Attributs
	private String nom;
	private String langue;
	private String monnaie;
	private Capitale capitale;
	private static int compteurPays = 0;
	
	
	//DebutConstructeurs
	public Pays(String unNom, String uneLangue, String uneMonnaie, String uneCapitale){
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		this.capitale = uneCapitale;
		compteurPays = compteurPays + 1;
	}
	
	public Pays(String unNom, String uneLangue, String uneMonnaie){
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;	
		compteurPays = compteurPays + 1;
	}
	
	public Pays(String unNom, String uneLangue){
		this.nom = unNom;
		this.langue = uneLangue;	
		compteurPays = compteurPays + 1;
	}
	
	public Pays(String unNom){
		this.nom = unNom;	
		compteurPays = compteurPays + 1;
	}
	
	public Pays(){
		compteurPays = compteurPays + 1;
	}
	//FinConstructeurs
	
	//DebutAcceseurs 
		//nom
	public String getNom() {
		return nom;
	}
	public void setNom(String unNom) {
		this.nom = unNom;
	}
		//langue
	public String getLangue() {
		return langue;
	}
	public void setLangue(String uneLangue) {
		this.langue = uneLangue;
	}
		//monnaie
	public String getMonnaie() {
		return monnaie;
	}
	public void setMonnaie(String uneMonnaie) {
		this.monnaie = uneMonnaie;
	}
		//capitale
	public String getCapitale() {
		return capitale;
	}
	public void setCapitale(String uneCapitale) {
		this.capitale = uneCapitale;
	}
	//FinAcceseurs
	
	//DebutMéthodes
	public String  retourneNom() {		
		return nom.toUpperCase();	
	}
	
	public String toString() {
		String chaine="Nom: "+this.nom+" Langue: "+this.langue+" Monnaie: "+this.monnaie+" Capitale: "+this.capitale +" Compteur: "+compteurPays;
		return chaine;
	}
	
	public static int getCompteurPays(){
		return compteurPays;
	}
	
	public String nom(){ 
		return nom.toUpperCase().charAt(0)+nom.substring(1,  nom.length()).toLowerCase();
		
	}
	//FinMéthodes
	
	
}
