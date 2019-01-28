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
public class Tierhandlung {

    public void holeTier(String tierspezie, String name, int alter, String geschlecht) {
        Haustier tier = HaustierFactory.getHaustier(tierspezie, name, alter, geschlecht);

        System.out.println(tierspezie + ":" + tier.getDetails());
    }

}
