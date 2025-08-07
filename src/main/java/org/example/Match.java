package org.example;


public class Match {
    private String id;
    private String date;
    private String endroit;
    private Combattant adversaire;
    private boolean resultat;

    public Match(String id, String date, String endroit, Combattant adversaire, boolean resultat) {
        this.id = id;
        this.date = date;
        this.endroit = endroit;
        this.adversaire = adversaire;
        this.resultat = resultat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEndroit() {
        return endroit;
    }

    public void setEndroit(String endroit) {
        this.endroit = endroit;
    }

    public Combattant getAdversaire() {
        return adversaire;
    }

    public void setAdversaire(Combattant adversaire) {
        this.adversaire = adversaire;
    }

    public boolean getResultat() {
        return resultat;
    }

    public void setResultat(boolean resultat) {
        this.resultat = resultat;
    }

    public int combat(TypeDeMatch typeDeMatch, String resultat , Combattant  adversaire) {
        if (typeDeMatch == TypeDeMatch.Amicaux) {
            return adversaire.points;

        }

        return 0;
    }