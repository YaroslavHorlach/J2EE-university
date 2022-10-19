public class Demo {
    public static void main(String[] args) {
        Character player = new Character("Gendalf", "mag", "human");

        Stats temp = Stats.generate();
        player.setAttribute(temp);
        player.printSheep();

        CareTaker careTaker = new CareTaker();
        Memento memento = new Memento();

        temp = Stats.generate();
        temp.printStats();
        memento.setState(temp);
        careTaker.add(memento.getState());

        temp = Stats.generate();
        temp.printStats();
        memento.setState(temp);
        careTaker.add(memento.getState());

        temp = Stats.generate();
        temp.printStats();
        memento.setState(temp);
        careTaker.add(memento.getState());

        memento.setState(careTaker.get(0));
        temp = memento.getState();
        temp.printStats();

        memento.setState(careTaker.get(1));
        temp = memento.getState();
        temp.printStats();

        memento.setState(careTaker.get(2));
        temp = memento.getState();
        temp.printStats();
    }
}
