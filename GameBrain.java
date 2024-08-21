import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;

public class GameBrain extends IslandMan{

    Scanner scanner = new Scanner(System.in);
    GameMessages messages = new GameMessages();
    ScoreBoard scoreboard = new ScoreBoard();
    GameArts arts = new GameArts();
    Random random = new Random();

    int firstChoice = 0, secondChoice = 0, thirdChoice = 0;
    int totalStageScore = 0;
    int [] possibleScores = {5, 6, 8};
    
    int choiceNumber = 1;//this is for the setChoiceMethod..

    int userChoice = 0;

    String [] userName = new String [99];
    int userNameIndex = 0;

    
    @Override
    public void getResponse(){
        System.out.print("What are you going to do? [1/2/3]: ");
        userChoice = scanner.nextInt();
        scanner.nextLine();
        System.out.print("\n");

        while (userChoice != 1 && userChoice != 2 && userChoice != 3) {
            System.out.print("Please enter a valid choice [1/2/3]: ");
            userChoice = scanner.nextInt();
            scanner.nextLine();
            System.out.print("\n");
        }
    }
    

    @Override
    public void checkResponse(){
        if (userChoice == 1){
            checkChoiceValue(firstChoice);
            totalStageScore += firstChoice;
            scoreboard.getScore(firstChoice);
        } else if (userChoice == 2){
            checkChoiceValue(secondChoice);
            totalStageScore += secondChoice;
            scoreboard.getScore(secondChoice);
        } else if (userChoice == 3){
            checkChoiceValue(thirdChoice);
            totalStageScore += thirdChoice;
            scoreboard.getScore(thirdChoice);
        }
    }


    @Override
    public int setChoices(){
        int choiceShuffle = possibleScores[random.nextInt(3)];
        System.out.println("[" + choiceNumber + "] " + setChoicesMessage(choiceShuffle));
        if (choiceNumber >= 3){
            choiceNumber = 0;
        }
        choiceNumber++;
        return choiceShuffle;
    }


    @Override
    public void checkChoiceValue(int choice){
        if (choice == possibleScores[0]){
            System.out.println(arts.choiceResults[0] + "\n");
        }else if (choice == possibleScores[1]){
            System.out.println(arts.choiceResults[1] + "\n");
        }else if (choice == possibleScores[2]){
            System.out.println(arts.choiceResults[2] + "\n");
        }
	}

    
    public String setChoicesMessage(int choice){
 	
        if (choice == possibleScores[0]){
            return messages.poorChoice[random.nextInt(messages.poorChoice.length)];
        } else if (choice == possibleScores[1]){
            return messages.decentChoice[random.nextInt(messages.decentChoice.length)];
        } else if  (choice == possibleScores[2]){
            return messages.greatChoice[random.nextInt(messages.greatChoice.length)];
        }
        return "System processing...";
    }


    public String displayMessage(String name){
        if (totalStageScore == 24){
            return name + " " + messages.strong[random.nextInt(messages.strong.length)];
        } else if (totalStageScore <= 20) {
            return name + " " + messages.weak[random.nextInt(messages.weak.length)];
        } else if (totalStageScore < 24) {
            return name + " " + messages.fair[random.nextInt(messages.fair.length)];
        }
        return "";
    }


    public void promptUsername(){
        System.out.print("Enter Name: ");
        userName[userNameIndex] = scanner.nextLine();
        scoreboard.getName(userName[userNameIndex]);
        userNameIndex++;
    }


    public void slowType(String str, int delay) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void gameLoop(){

        int stageIndex = 1, stages = 3, roundsPerStages = 3;
        boolean isOn = true;
        
        String [] displayRounds = {
            "First",
            "Second",
            "Last"
        };

        promptUsername();
        for (String intro : messages.storyIntro) {
        	slowType(intro.replace("{username}", userName[userNameIndex - 1]), 15);
            System.out.println();
        }
        System.out.println(messages.startText);

        do{
            for (int i = 1; i <= roundsPerStages; i++) {
                
                System.out.println("Stage " + stageIndex + ": " + displayRounds[i-1] + " round\n");
                firstChoice = setChoices();
                secondChoice = setChoices();
                thirdChoice = setChoices();

                getResponse();
                checkResponse();
                
                System.out.println("Current Score: "+ totalStageScore + "\n");
                
                if (totalStageScore >= 18){
                   switch (stageIndex) {
                	
                	case 1:
                		System.out.println("\n" + displayMessage(userName[userNameIndex-1]));
                        System.out.println(arts.userSurvivedArt[0]);
                        totalStageScore = 0;
                        System.out.println("\nScore has been reset for the new stage..\n");
                        break;
                        
                	case 2:
                		System.out.println(displayMessage(userName[userNameIndex-1]));
                        System.out.println(arts.userSurvivedArt[1]);
                        totalStageScore = 0;
                        System.out.println("\nScore has been reset for the new stage..\n");
                        break;
                	
                	case 3:
                		System.out.println(displayMessage(userName[userNameIndex - 1]));
                		System.out.println(arts.userSurvivedArt[2]);
                		for (String message : messages.survivedMessage) {
                        	slowType(message.replace("{username}", userName[userNameIndex - 1]), 15); 
                            System.out.println();
                        }
                		totalStageScore = 0;
                		break;
                    }    
                } else if (i == roundsPerStages){
                    System.out.println(displayMessage(userName[userNameIndex - 1]));
                    System.out.println(arts.userLostArt);
                    totalStageScore = 0;
                    isOn = false;
                }
            } 
            stageIndex++;
        } while (isOn && stageIndex <= stages);
    }
}