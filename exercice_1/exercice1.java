public class FactureManager {

    /**
     * la methode reduction_categorie calcule la reduction selon la categorie de produit
     * @param double total permet de calculer le prix total pour une categorie 
     * @return retourne le total apres reduction 
     */
    public double reduction_categorie(String typeProduit, int quantite, double prixUnitaire){
        double total = quantite * prixUnitaire;
        if (typeProduit.equals("Alimentaire")) {
            total -= total * 0.05; // Réduction de 5%
        } else if (typeProduit.equals("Electronique")) {
            total -= total * 0.1; // Réduction de 10%
        } else if (typeProduit.equals("Luxe")) {
            total -= total * 0.15; // Réduction de 15%
        }
        return total;
    }

    /**
     * la methode reduction_total calcule la reduction sur le total pour les gros montants
     * @return retourne le prix entre en parametre apres reduction ou pas
     */
    public double reduction_total(double total){
        if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        }
        return total;   
    }

    /**
     * la methode calculerFactur calcule le prix total d'une facture
     * @return retourne le prix de la facture apres reduction
     * @param double total permet de recuperer ce que la methode reduction_categorie retourne pour faire le reste des instructios. 
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        //reduction selon la categorie
        double total;
        total=reduction_categorie(typeProduit,quantite,prixUnitaire);

        // Reduction sur le total
        total=reduction_total(total);
        return total;
    }
}
