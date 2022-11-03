package org.example;

public class Human extends CharacterRace {
    Human(String name,Stats stat) {
        this.name    = name;
        this.bonuses = stat;
    }

    @Override
    public void saySMITH() {
        System.out.println("Za ALIANC!!!");
    }
}
