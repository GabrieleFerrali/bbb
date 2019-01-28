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
        Haustier hund = HaustierFactory.getHaustier("Hund", "Melvin", 2, "männlich");
        Haustier katze = HaustierFactory.getHaustier("Katze", "Jiji", 4, "weiblich");
        System.out.println("Hund: " + hund.getDetails());
        System.out.println("Katze: " + katze.getDetails());
    }
}
