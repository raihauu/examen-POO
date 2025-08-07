package org.example;

import java.util.List;

public class Combattant {
    public String id;
    public String nom;
    public String prenom;
    public String nomDeCombatant ;
    public int points;
    public List<String> titre;

    public Combattant(String id, String nom, String prenom, String nomDeCombatant, int points, List<String> titre) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDeCombatant = nomDeCombatant;
        this.points = points;
        this.titre = titre;
    }

    }