package org.example;

public class Demo {
    public static void main(String[] args) {
        Character player = new Character("Bard Astralapirsen", ClassFactory.getClass("Bard"));
        player.setAtributes(Stats.generate());
        player.addRaceBonuses();
        player.talk();

        System.out.println("\n\n");

        Character player2 = new Character("Barbarian Denchic", ClassFactory.getClass("Barbarian"));
        player2.setAtributes(Stats.generate());
        player2.addRaceBonuses();
        player2.talk();
    }
}
