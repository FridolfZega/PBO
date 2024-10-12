import java.util.Random;

// Michael

public class ComputerPlayer extends Player {
    private Random random = new Random();
    private String[] moves = {"batu", "gunting", "kertas"};
    
    public ComputerPlayer() {
        super("Komputer");
    }
    
    @Override
    public String makeMove() {
        return moves[random.nextInt(moves.length)];
    }
}
