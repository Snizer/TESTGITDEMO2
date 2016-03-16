/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgitdemo2;

/**
 *
 * @author Safwene
 */
public class Voiture {
   
    private String marque;
    private String modele;
    private String immatricule;
    
    
    public String toString(){
        return "Voiture : \nImmatricule : "+this.getImmatricule()+"\nMarque : "+this.getMarque()+"\nModele : "+this.getModele()+"\n";
    }

    /**
     * @return the marque
     */
    public String getMarque() {
        return marque;
    }

    /**
     * @param marque the marque to set
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     * @return the modele
     */
    public String getModele() {
        return modele;
    }

    /**
     * @param modele the modele to set
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     * @return the immatricule
     */
    public String getImmatricule() {
        return immatricule;
    }

    /**
     * @param immatricule the immatricule to set
     */
    public void setImmatricule(String immatricule) {
        this.immatricule = immatricule;
    }
    
    
    
}
