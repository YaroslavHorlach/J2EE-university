package org.example;

public class Dwarf extends CharacterRace {
    Dwarf(String name,Stats stat) {
        this.name    = name;
        this.bonuses = stat;
    }

    @Override
    public void saySMITH() {
        System.out.println("Za DWARFOW!!!");
    }
}
