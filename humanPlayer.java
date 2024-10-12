import java.util.Scanner;

// Nicole

public class HumanPlayer extends Player {
    private Scanner scanner = new Scanner(System.in);
    
    public HumanPlayer(String name) {
        super(name);
    }
    
    @Override
    public String makeMove() {
        String move;
        while (true) {
            System.out.print(name + ", pilih (batu/gunting/kertas): ");
            move = scanner.nextLine().toLowerCase();
            if (move.equals("batu") || move.equals("gunting") || move.equals("kertas")) {
                return move;
            }
            System.out.println("Input tidak valid. Silakan pilih batu, gunting, atau kertas.");
        }
    }
}
