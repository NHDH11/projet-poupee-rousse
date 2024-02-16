public abstract class Poupee {
    private int taille;
    private boolean ouverte;

    public Poupee() {
        this.taille = taille;
        this.ouverte = false;
    }

    public abstract void ouvrir();

    public abstract void fermer();

    public abstract void placerDans(Poupee p);

    public abstract void sortirDe(Poupee p);

    // Getters and setters for taille and ouverte
    // Getter for taille
    public int getTaille() {
        return taille;
    }

    // Setter for taille
    public void setTaille(int taille) {
        this.taille = taille;
    }

    // Getter for ouverte
    public boolean isOuverte() {
        return ouverte;
    }

    // Setter for ouverte
    public void setOuverte(boolean ouverte) {
        this.ouverte = ouverte;
    }
}

