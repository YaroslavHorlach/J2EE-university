public class Memento {
    private Stats state;

    Memento(Stats state) {
        this.state = state;
    }

    public Memento() {}

    public void setState(Stats state) {
        this.state = state;
    }

    public Stats getState() {
        return state;
    }
}
