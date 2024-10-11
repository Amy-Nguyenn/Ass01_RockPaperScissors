import java.util.Scanner;

public class Ass01_RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerA, playerB;
        String playAgain;

        do {
            // Get a valid move from Player A
            playerA = getPlayerMove(scanner, "Player A");

            // Get a valid move from Player B
            playerB = getPlayerMove(scanner, "Player B");

            // Display the result of the game
            displayResult(playerA, playerB);

            // Ask if players want to play again
            System.out.println("Do you want to play again? (Y/N)");
            playAgain = scanner.nextLine();

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    public static String getPlayerMove(Scanner scanner, String player) {
        String move;
        do {
            System.out.println(player + ", please enter your move (R, P, S):");
            move = scanner.nextLine();

            // Check if input is valid
            if (!move.equalsIgnoreCase("R") && !move.equalsIgnoreCase("P") && !move.equalsIgnoreCase("S")) {
                System.out.println("Invalid move! Please enter R, P, or S.");
            }
        } while (!move.equalsIgnoreCase("R") && !move.equalsIgnoreCase("P") && !move.equalsIgnoreCase("S"));

        return move.toUpperCase();
    }

    public static void displayResult(String playerA, String playerB) {
        if (playerA.equals(playerB)) {
            System.out.println(playerA + " vs " + playerB + ": It's a Tie!");
        } else if ((playerA.equals("R") && playerB.equals("S")) ||
                (playerA.equals("P") && playerB.equals("R")) ||
                (playerA.equals("S") && playerB.equals("P"))) {
            System.out.println(playerA + " vs " + playerB + ": Player A wins!");
        } else {
            System.out.println(playerA + " vs " + playerB + ": Player B wins!");
        }
    }
}