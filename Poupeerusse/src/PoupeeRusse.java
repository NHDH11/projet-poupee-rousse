public class PoupeeRusse extends Poupee {
    private int taille;
    private String couleur;
    private int anneeFabrication;

    public PoupeeRusse(int taille,String couleur, int anneeFabrication) {
        super();
        this.taille = taille;
        this.couleur = couleur;
        this.anneeFabrication = anneeFabrication;
    }

    @Override
    public void ouvrir() {
        // Implémentation pour ouvrir la poupée russe
        if (!isOuverte()) {
            setOuverte(true);
            System.out.println("La poupée russe est ouverte.");
        } else {
            System.out.println("La poupée russe est déjà ouverte.");
        }
    }

    @Override
    public void fermer() {
        // Implémentation pour fermer la poupée russe
        if (isOuverte()) {
            setOuverte(false);
            System.out.println("La poupée russe est fermée.");
        } else {
            System.out.println("La poupée russe est déjà fermée.");
        }
    }

    @Override
    public void placerDans(Poupee p) {
        // Implémentation pour placer cette poupée dans une autre poupée
        if (p instanceof PoupeeRusse) {
            System.out.println("La poupée russe est placée dans une autre poupée russe.");
        } else {
            System.out.println("Impossible de placer la poupée russe dans cette poupée.");
        }
    }

    @Override
    public void sortirDe(Poupee p) {
        // Implémentation pour sortir cette poupée d'une autre poupée
        if (p instanceof PoupeeRusse) {
            System.out.println("La poupée russe est sortie d'une autre poupée russe.");
        } else {
            System.out.println("Impossible de sortir la poupée russe de cette poupée.");
        }
    }

    public void colorer(String couleur) {
        this.couleur = couleur;
    }

    // Getter for couleur
    public String getCouleur() {
        return couleur;
    }

    public void afficher() {
        System.out.println("Poupée russe de taille " + getTaille() + ", couleur " + couleur + ", état : " + (isOuverte() ? "ouverte" : "fermée"));
    }


}
