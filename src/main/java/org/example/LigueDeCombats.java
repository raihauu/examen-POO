package org.example;

import java.util.List;

public class LigueDeCombats {
    private String nom ;
    private List<String> matchs ;
    private List<String> combatants;

    public LigueDeCombats(String nom, List<String> matchs, List<String> combatants) {
        this.nom = nom;
        this.matchs = matchs;
        this.combatants = combatants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<String> getMatchs() {
        return matchs;
    }

    public void setMatchs(List<String> matchs) {
        this.matchs = matchs;
    }

    public List<String> getCombatants() {
        return combatants;
    }

    public void setCombatants(List<String> combatants) {
        this.combatants = combatants;
    }
}
