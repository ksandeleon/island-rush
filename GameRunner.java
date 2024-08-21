import java.util.Scanner;

   public class GameRunner {

		public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            GameBrain gameBrain = new GameBrain();
            GameMessages messages = new GameMessages();
            GameArts arts = new GameArts();

            String userMenuInput = "";

            System.out.println(arts.gameLogo);

            do {
                System.out.print(messages.gameMenu + "\nEnter [1/2/3/4]: ");
                userMenuInput = scanner.nextLine();
                
                switch (userMenuInput) {
                    case "1":
                        gameBrain.gameLoop();
                        break;
                    case "2":
                        gameBrain.scoreboard.displayScoreboard();
                        break;
                    case "3":
                        System.out.println(messages.howToPlay);
                        break;
                    case "4":
                    	System.out.println("Thank you for playing, Exiting now...");
                    	break;
                    default:
                    	System.out.println("Please Enter a Valid Choice... Try Again.");
                }
            }while (!userMenuInput.equals("4"));
            scanner.close();
        }
    }