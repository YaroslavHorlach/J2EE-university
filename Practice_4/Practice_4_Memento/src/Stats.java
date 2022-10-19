public class Stats {
    private int str, dex, con, inte, win, cha;
    private Stats state;

    public Stats(int str, int dex, int con, int inte, int win, int cha) {
        this.str  = str;
        this.dex  = dex;
        this.con  = con;
        this.inte = inte;
        this.win  = win;
        this.cha  = cha;
    }

    public Stats(Stats state) {
        this.state = state;
    }

    public int getCha() {
        return cha;
    }

    public int getCon() {
        return con;
    }

    public int getInte() {
        return inte;
    }

    public int getDex() {
        return dex;
    }

    public int getStr() {
        return str;
    }

    public int getWin() {
        return win;
    }

    public static Stats generate() {//TODO
        return new Stats(Dice.rollStat(),Dice.rollStat(),Dice.rollStat(),
                Dice.rollStat(),Dice.rollStat(),Dice.rollStat());
    }

    public void printStats() {

        System.out.println("Stats {" +
                "Strength = " + str +
                ", Dexterity = " + dex +
                ", Constitution = " + con +
                ", Intelligence = " + inte +
                ", Wisdom = " + win +
                ", Charisma = " + cha +
                '}');
    }


    @Override
    public String toString() {
        return "Stats {" +
                "str = " + str +
                ", dex = " + dex +
                ", con = " + con +
                ", inte = " + inte +
                ", win = " + win +
                ", cha = " + cha +
                '}';
    }
}
