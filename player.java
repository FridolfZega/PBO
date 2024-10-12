// Michael
interface Playable {
    String makeMove();
}

public abstract class Player implements Playable {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
