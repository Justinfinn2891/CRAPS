import java.util.Random;
import java.util.Scanner;

// I wanted to challenge myself more and learn Java to complete this assignment. 

/* TO DO LIST:
2.) Edit boundaries for what Dr. Lowe Asks
4.) Fully have it finished

*/
public class craps {
    private static final Random random = new Random();
    // Returns random value with dice formula 1 - 11
    public static int betMenu(boolean startBet){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("======================");
        System.out.printf("%15s\n", "Bet Menu!");
        System.out.println("======================");
        if(startBet == true){
            System.out.println("1.) Bet Pass Line");
            System.out.println("2.) Bet Don't Pass Line");
            System.out.println("3.) Roll the Dice");
            System.out.println("4.) Quit");
            int response = scanner.nextInt();

            return (int) response;
          

        } else{
            System.out.println("1.) Bet Come");
            System.out.println("2.) Bet Don't Come");
            System.out.println("3.) Roll the Dice");
            System.out.println("4.) Quit");
            int response = scanner.nextInt();

            return (int) response;
        }
       
    }

    public static int randomDice(){
   
        int roll1 = random.nextInt(6) + 1; // Random number from 1 to 6
        int roll2 = random.nextInt(6) + 1; // Another random number from 1 to 6
        return roll1 + roll2; // Sum of the two rolls
    }

    public static void printBoard(int dice, int totalCome, int totalDontCome, int comeDye, int dontComeDye){
        // TEST CASE, Dice can never be 0 so when the game starts it's off
        if(dice == 0){
            System.out.println("Off");
        }

        System.out.printf("%10s %5s %11s\n", "Point", "Come", "Don't Come");
        System.out.printf("%10s %6s %6s\n", "=====", "=====", "========");
        /*  HAVE LIST OF IF STATEMENTS FOR IF ITS ON THE THING AND THEN ALLOW COME AND DON'T COME BETS TO SHOW?
            SLOPPY MIGHT CHANGE LATER */
            if (dice == 4) {
                System.out.printf("%s %6s\n", "On", "4");
            } else if (comeDye == 4) {
                System.out.printf("%9s %6d\n", "4", totalCome);
            } else if (dontComeDye == 4) {
                System.out.printf("%9s %11d\n",  "4", totalDontCome);
            } else {
                System.out.printf("%9s\n", "4");
            }
            
            if (dice == 5) {
                System.out.printf("%s %6s\n", "On", "5");
            } else if (comeDye == 5) {
                System.out.printf("%9s %6d\n",  "5", totalCome);
            } else if (dontComeDye == 5) {
                System.out.printf("%9s %11d\n", "5", totalDontCome);
            } else {
                System.out.printf("%9s\n", "5");
            }
            
            if (dice == 6) {
                System.out.printf("%s %6s\n", "On", "6");
            } else if (comeDye == 6) {
                System.out.printf("%9s %6d\n",  "6", totalCome);
            } else if (dontComeDye == 6) {
                System.out.printf("%9s %11d\n",  "6", totalDontCome);
            } else {
                System.out.printf("%9s\n", "6");
            }
            
            if (dice == 8) {
                System.out.printf("%s %6s\n", "On", "8");
            } else if (comeDye == 8) {
                System.out.printf("%9s %6d\n", "8", totalCome);
            } else if (dontComeDye == 8) {
                System.out.printf("%9s %11d\n", "8", totalDontCome);
            } else {
                System.out.printf("%9s\n", "8");
            }
            
            if (dice == 9) {
                System.out.printf("%s %6s\n", "On", "9");
            } else if (comeDye == 9) {
                System.out.printf("%9s %6d\n", "9", totalCome);
            } else if (dontComeDye == 9) {
                System.out.printf("%9s %11d\n", "9", totalDontCome);
            } else {
                System.out.printf("%9s\n", "9");
            }
            
            if (dice == 10) {
                System.out.printf("%s %6s\n", "On", "10");
            } else if (comeDye == 10) {
                System.out.printf("%9s %6d\n", "10", totalCome);
            } else if (dontComeDye == 10) {
                System.out.printf("%9s %11d\n", "10", totalDontCome);
            } else {
                System.out.printf("%9s\n", "10");
            }
    
    }

    public static void loadRound(int dye, boolean startBet, float playerBalance, int secondStage, int pointDye, int totalPassBet, int totalDontPass, int totalCome, int totalDontCome, int comeDye, int dontComeDye, boolean lateBet) 
    {
        
        Scanner scanner = new Scanner(System.in);
        dice Dice = new dice();
        while(playerBalance > 0){
            // ADD CONDITION WHERE POINT STAYS UNTIL TOLD         
            printBoard(pointDye, totalCome, totalDontCome, comeDye, dontComeDye);

            if(totalDontCome > 0)
                System.out.println("Don't Come: " + totalDontCome);
            else{System.out.println("Don't Come:");}
            if(totalCome > 0)
                System.out.println("Come: " + totalCome);
            else{System.out.println("Come:");}

            if(totalDontPass > 0) 
                System.out.println("Don't Pass" + totalDontPass);
            else{
                System.out.println("Don't Pass");
            }
            if(totalPassBet > 0) 
                System.out.println("Pass:" + totalPassBet); 
            else{
                System.out.println("Pass:");
            } 
            System.out.println("Total Chip Balance: $" + playerBalance + "\n");
            int response = betMenu(startBet);
 
            while((response != 3 && response != 4) && (response == 1 || response == 2)){

                if(response != 1 && response != 2 && response != 3 && response != 4)
                    System.out.println("Error! Incorrect selection! Please try again...");

                if(response == 1){
                    System.out.println("You have " + playerBalance + ". How much would you like to spend?");
                    int bet = scanner.nextInt();
                    //passChoice++;
                    if(secondStage == 0){
                        if(bet <= playerBalance){
                            if(bet >= 10 && bet <= 200){
                                totalPassBet += bet;
                                playerBalance -= bet;
                            }
                            else{
                                System.out.println("ERROR! Minimum bets start at $10.00 while Maximum bets are capped at $200.00. Please try again!");
                            }
                        }
                        else{System.out.println("You don't have enough funds!");} 
                    }
                    else{
                        if(bet <= playerBalance){
                            if(bet >= 10 && bet <= 200){
                                totalCome += bet;
                                playerBalance -= bet;
                            }
                            else{
                                System.out.println("ERROR! Minimum bets start at $10.00 while Maximum bets are capped at $200.00. Please try again!");
                            }
                        }
                        else{System.out.println("You don't have enough funds!");}
                    } 
                    response = betMenu(startBet); 
                }
                if(response == 2){
                    System.out.println("You have " + playerBalance + ". How much would you like to spend?");
                    int bet = scanner.nextInt();
                    
                    //dontPassChoice++;
                    // Parameter for not being able to bet more
                    if(secondStage == 0){
                        if(bet <= playerBalance){
                            if(bet >= 10 && bet <= 200){
                                totalDontPass += bet;
                                playerBalance -= bet;
                            }
                            else{
                                System.out.println("ERROR! Minimum bets start at $10.00 while Maximum bets are capped at $200.00. Please try again!");
                            }
                        }
                        else{System.out.println("You don't have enough funds!");} 
                    }
                    else{
                        if(bet <= playerBalance){
                            if(bet >= 10 && bet <= 200){
                                totalDontCome += bet;
                                playerBalance -= bet;
                            }
                            else{
                                System.out.println("ERROR! Minimum bets start at $10.00 while Maximum bets are capped at $200.00. Please try again!");
                            }
                        }
                        else{System.out.println("You don't have enough funds!");}
                    } 
                    response = betMenu(startBet); 
                }
            }

            if(response == 3){
                
                dye = randomDice();
                // Random warning? Fix later 
                Dice.printDice(dye);
                startBet = false; 
                if(secondStage == 0){
                    
                   

                    // IF DICE HITS 7 OR 11     
                    if(dye == 7 || dye == 11){
                        System.out.println("Pass wins, selected winners awarded!");
                        playerBalance += (totalPassBet*2);
                        totalPassBet = 0;
                        totalDontPass = 0;
                        secondStage = 0;
                        startBet = true; 
                    }else if(dye == 2 || dye == 3  || dye == 12){
                        System.out.println("Dont Pass wins, selected winners awarded!");
                        playerBalance += (totalDontPass*2);
                        totalPassBet = 0;
                        totalDontPass = 0;
                        secondStage = 0;
                        startBet = true;  
                    }else{
                        pointDye = dye;
                        secondStage++;;}

                    
                }
                else{  //SECOND STAGE OF GAME, COME, DON'T COME
                // IF DYE HITS DIRECTLY ON POINT

                    if(startBet != true){
                        if(dye == pointDye){
                            System.out.println("Pass wins, selected winners awarded!");
                            playerBalance += (totalPassBet*2);
                            totalPassBet = 0;
                            totalDontPass = 0;
                            totalCome = 0;
                            totalDontCome = 0;
                            secondStage = 0;
                            startBet = true;      
                        }
                        // IF DYE HITS 7
                        if(dye == 7){
                            System.out.println("Dont Pass wins, selected winners awarded!");
                            playerBalance += (totalDontPass*2);
                            totalPassBet = 0;
                            totalDontPass = 0;
                            totalCome = 0;
                            totalDontCome = 0;
                            secondStage = 0;
                            startBet = true;        
                        }
                        if(lateBet == true){
                            if(dye == 7 || dye == 11)
                            {
                                System.out.println("Come wins, selected winners awarded!1");
                                playerBalance += (totalCome*2);
                                totalPassBet = 0;
                                totalDontPass = 0;
                                totalCome = 0;
                                totalDontCome = 0;
                                secondStage = 0;
                                startBet = true;       
                            }else if(dye == 2 || dye == 3 || dye == 12)
                            {
                                System.out.println("Dont Come Wins, selected winners awarded!");
                                playerBalance += (totalDontCome*2);
                                totalPassBet = 0;
                                totalDontPass = 0;
                                totalCome = 0;
                                totalDontCome = 0;
                                secondStage = 0;
                                startBet = true;     
                            }else{
                                if(totalCome > 0){
                                    comeDye = dye;
                                    dye = 0;
                                    lateBet = false; 
                                } 
                                if(totalDontCome > 0){
                                    dontComeDye = dye;
                                    dye = 0;
                                    lateBet = false;   
                                }
    
                            }
                        }
                        // HONESTLY DONT KNOW ANYMORE 
                  
                        if(comeDye > 0){
                            if(dye == comeDye){
                                System.out.println("Come wins, selected winners awarded!!2");
                                playerBalance += (totalCome*2);
                                startBet = true;
                                pointDye = 0;
                                totalDontPass = 0; 
                                totalPassBet = 0;
                                totalCome = 0;
                                totalDontCome = 0;
                                comeDye = 0;
                                dontComeDye = 0;
                            }
                            if(dye == 7){
                                startBet = true;
                                pointDye = 0;
                                totalDontPass = 0; 
                                totalPassBet = 0;
                                totalCome = 0;
                                totalDontCome = 0;
                                comeDye = 0;
                                dontComeDye = 0;
                            }
                        }
                  
                        if(dontComeDye > 0){
                            if(dye == dontComeDye){
                                System.out.println("Dont Come Wins, selected winners awarded!");
                                playerBalance += (totalDontCome*2);
                                startBet = true;
                                pointDye = 0;
                                totalDontPass = 0; 
                                totalPassBet = 0;
                                totalCome = 0;
                                totalDontCome = 0;
                                comeDye = 0;
                                dontComeDye = 0;
                            }
                            if(dye == 7){
                                startBet = true;
                                pointDye = 0;
                                totalDontPass = 0; 
                                totalPassBet = 0;
                                totalCome = 0;
                                totalDontCome = 0;
                                comeDye = 0;
                                dontComeDye = 0;
                            }
                        }
                    }
                }

            }

            if(response == 4)
            {
                System.out.println("Thank you for playing!");
                System.exit(0);
            }

        

        }
        System.out.println("GAME OVER! COME AGAIN ANOTHER TIME!");
        
     
    }
    public static void startGame(){
        // STARTING VARIABLES TO SET THE GAME
        int dye = 0;
        int secondStage = 0;  
        float playerBalance = 500.00f;
        boolean startBet = true;
        boolean lateBet = true; 
        int pointDye = 0;
        int totalDontPass = 0; 
        int totalPassBet = 0;
        int totalCome = 0;
        int totalDontCome = 0;
        int comeDye = 0;
        int dontComeDye = 0;

        System.out.println("Welcome to CRAPS (JAVA Edition)!\n" + "--------------------------------\n");
        loadRound(dye, startBet, playerBalance, secondStage, pointDye, totalPassBet, totalDontPass, totalCome, totalDontCome, comeDye, dontComeDye, lateBet);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("\nWould you like to start a game of craps? (Y/N)");
        char answerChoice = '/';
        Scanner scanner = new Scanner(System.in); 
        while(answerChoice != 'Y' && answerChoice != 'N'){

            answerChoice = scanner.next().charAt(0);
            switch(Character.toUpperCase(answerChoice)){
                case 'Y':
                    startGame();
                    break;
                case 'N':
                    System.out.println("That's okay! Come again when you're up to it!");
                    break;
                default:
                    System.out.println("Error! Wrong character choice! Please try again!");
                    break;
            }
        }

        scanner.close();
    }


}
