public class ScoreBoard {

    String [] nameDatabase = new String [99];
    int [] scoreDatabase = new int [99];
    int currentIndex = 0;


    public void displayScoreboard() {
        if (nameDatabase[0] == null){
                System.out.println("The leaderboard is currently empty. Be the first to score points and claim the top spot!");
            } else {
                sortScoreboard();
                for (int i = 0; i < nameDatabase.length; i++){
                    if (nameDatabase[i] != null){
                        System.out.println((i+1) + ". " + nameDatabase[i] + " has a total score of " + scoreDatabase[i]);
                    }
                }
            }
            System.out.println("\n\n");
    };


    public void getName (String name){
        while (currentIndex < nameDatabase.length && nameDatabase[currentIndex] != null) {
            currentIndex++;
        }
        if (currentIndex < nameDatabase.length) {
            nameDatabase[currentIndex] = name;
        } else {
            System.out.println("Database is full... terminating program..");
            System.exit(0);
        }
    };


    public void getScore(int choiceValue){
        if (choiceValue == 5){
            scoreDatabase[currentIndex] += 5;
        } else if (choiceValue == 6){
            scoreDatabase[currentIndex] += 6;
        } else if (choiceValue == 8){
            scoreDatabase[currentIndex] += 8;
        }
    };

    
    public void sortScoreboard(){
        for (int i = 0; i < scoreDatabase.length - 1; i++ ){
            for (int j = 0; j < scoreDatabase.length - 1; j++){
                if (scoreDatabase[j] < scoreDatabase[j + 1]) {
                    int temp = scoreDatabase[j];
                    String nameTemp = nameDatabase[j];

                    scoreDatabase[j] = scoreDatabase[j + 1];
                    nameDatabase[j] = nameDatabase[j + 1];

                    scoreDatabase[j + 1] = temp;
                    nameDatabase[j + 1] = nameTemp;
                }
            }
        }
    };
}