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
public class Hund extends Haustier {

    private String name;
    private int alter;
    private String geschlecht;

    public Hund(String name, int alter, String geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAlter() {
        return Integer.toString(alter);
    }

    @Override
    public String getGeschlecht() {
        return geschlecht;
    }

}
