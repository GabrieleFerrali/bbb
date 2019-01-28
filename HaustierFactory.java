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
public class HaustierFactory {

    //Factory Methode
    public static Haustier getHaustier(String tier, String name, int alter, String geschlecht) {
        if ("Hund".equalsIgnoreCase(tier)) {
            Hund hund = new Hund(name, alter, geschlecht);
            return hund;
        } else if ("Katze".equalsIgnoreCase(tier)) {
            Katze katze = new Katze(name, alter, geschlecht);
            return katze;
        }
        return null;
    }
}
