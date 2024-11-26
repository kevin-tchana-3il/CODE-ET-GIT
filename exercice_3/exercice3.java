public class StockManager {

    /**
     * la methode ajout_produit permet d'ajouter un produit dans le stock
     * @param produit parametre donnant le nom du produit
     * @param quantite parametre donnant la quantite du produit
     * @param stock parametre donnant le stock  
     */
    public void  ajout_produit(String produit, int quantite, int stock){
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }

    /**
     * la retrait_produit permet de retirer un produit 
     * @param produit parametre donnant le nom du produit
     * @param quantite parametre donnant la quantite du produit
     * @param stock parametre donnant le stock  
     */
    public void retrait_produit(String produit, int quantite, int stock){
         if (stock >= quantite) {
                stock -= quantite;
                System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
            } else {
                System.out.println("Stock insuffisant pour le produit : " + produit);
            }
        }
    }

    /**
     * la methode gererStock permet de gerer le stock
     * @param typeOperation parametre donnant le type d'operation
     * @param produitparametre donnant le nom du produit
     * @param quantite parametre donnant la quantite du produit
     * @param stock parametre donnant le stock  
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        // Ajouter  au stock
        if (typeOperation.equals("ajout")) {
            ajout_produit(produit,quantite,stock);
        // Retirer du stock
        } else if (typeOperation.equals("retrait")) {
            retrait_produit(produit,quantite,stock);
        // Si l'action est inconnu
        } else {
            System.out.println("Opération inconnue.");
        }
    }
}
