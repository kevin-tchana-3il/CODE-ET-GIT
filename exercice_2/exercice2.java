public class GestionnaireNotes {

    /**
     * permet d'affficher les differentes notes de l'etudiant
     */
    public void afficher (int[] notes){
       for (int note : notes) {
            System.out.println("- " + note);
        } 
    }

    /**
     * la methode somme_notes permet de calculer la somme des notes 
     * @param int somme = 0 permet la somme des notes en initialisant sa valeur a 0
     * @return retourne la valeur de la somme des notes
     */
    public int somme_notes(int[] notes){
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return somme;
    }

    /**
     * la methode moyenne_notes calcule la moyenne des notes
     * @param double moyenne permet de calculer la moyenne 
     */
    public double moyenne_notes(int somme,int[] notes)){
        double moyenne = (double) somme / notes.length;
        System.out.println("Moyenne : " + moyenne);
    }

    /**
     * la methode afficherNotesEtMoyenne permet  d'afficher les notes d'un etudiant  et sa moyenne
     */ 
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Affichage des notes
        System.out.println("Notes de " + nomEtudiant + ":");
        afficher(notes);

        // Calcul de la somme des notes
        somme=somme_notes(notes);

        // Affichage de la moyenne
        moyenne_notes(somme);
    }
}
