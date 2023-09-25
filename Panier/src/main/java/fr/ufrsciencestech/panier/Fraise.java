package fr.ufrsciencestech.panier;
public class Fraise {
    private double prix;
    private String origine;
	
    public Fraise() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Fraise(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    public String toString(){
        return "Fraise de " + origine + " a " + prix + " euros";
    }

    public boolean equals(Object f){  //predicat pour tester si 2 Fraises sont equivalentes
        if(f != null && getClass() == f.getClass()){
            Fraise or = (Fraise) f;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une Fraise a des pepins
        return false;
    }
}
