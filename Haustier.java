/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.factorydesign;

/**
 *
 * @author gabri
 */
public abstract class Haustier {

    public abstract String getName();

    public abstract String getAlter();

    public abstract String getGeschlecht();

    public String getDetails() {
        if (getGeschlecht().equals("männlich")) {
            return "Sein Name ist " + this.getName()
                    + ", er ist " + this.getAlter() + " Jahre alt "
                    + "und ist " + this.getGeschlecht() + ".";
        }
        if (getGeschlecht().equals("weiblich")) {
            return "Ihr Name ist " + this.getName()
                    + ", sie ist " + this.getAlter() + " Jahre alt "
                    + "und ist " + this.getGeschlecht() + ".";
        }
        return "Sein Name ist " + this.getName()
                + ", er ist " + this.getAlter() + " Jahre alt "
                + "und sein Geschlecht ist unbekannt";

    }

}
