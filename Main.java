import java.util.Scanner;

// Fridolf

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;
        
        do {
            Game game = new Game(new HumanPlayer("Pemain"), new ComputerPlayer());
            game.play();
            
            System.out.print("\nApakah Anda ingin bermain lagi? (ya/tidak): ");
            playAgain = scanner.nextLine().toLowerCase();
            while (!playAgain.equals("ya") && !playAgain.equals("tidak")) {
                System.out.print("Input tidak valid. Apakah Anda ingin bermain lagi? (ya/tidak): ");
                playAgain = scanner.nextLine().toLowerCase();
            }
        } while (playAgain.equals("ya"));
        
        System.out.println("Terima kasih telah bermain!");
        scanner.close();
    }
}
