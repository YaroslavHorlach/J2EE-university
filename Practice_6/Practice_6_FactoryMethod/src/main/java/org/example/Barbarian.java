package org.example;

public class Barbarian extends CharacterClass {
    private String perk;

    public Barbarian(){
        this.name = "Barbarian";
        this.dice = 12;
        this.perk = "Battle Rage";
    }

    public void printDice(){
        System.out.println("Health = " + dice);
    }
    @Override
    public void printMagic() {
        System.out.println("Class " + name + " can: " + perk);
    }
}
