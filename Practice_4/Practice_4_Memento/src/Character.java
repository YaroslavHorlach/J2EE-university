public class Character {
    private String name;
    private Stats attribute;
    private String dndclass;
    private String race;
    Character(String name, String dndclass, String race){
        this.name     = name;
        this.dndclass = dndclass;
        this.race     = race;
    }
    public void setAttribute(Stats attribute) {
        this.attribute = attribute;
    }
    public void printSheep() {
        System.out.println("Character {" +
                "name = '" + name + '\'' +
                ", race = " + race +
                ", dndclass = '" + dndclass + '\'' +
                '}' + "\n" );
    }
}
