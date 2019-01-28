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
public class Starter {

    public static void main(String[] args) {
        Tierhandlung tier1 = new Tierhandlung();
        Tierhandlung tier2 = new Tierhandlung();
        tier1.holeTier("Hund", "Melvin", 2, "männlich");
        tier2.holeTier("Katze", "Jiji", 4, "weiblich");
    }
}
