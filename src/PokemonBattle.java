import java.util.ArrayList;
import java.util.Random;
import java.io.*;

public class PokemonBattle{
    /**
    * A class that randomly generates and takes information from all the other classes, uses and compares the variables 
    * to simulate a Pokemon Battle between 1-2 trainers OR a wild pokemon.
    * @author John Matthew Kassapian
    */


    private String strBackground;
    private boolean isWildPokemon;
    private boolean isGymBattle;
    private int pkmnTrainerCount;
    private ArrayList<PokemonTrainer> pkmnTrainers;
    private boolean isCatchable;


    public PokemonBattle() throws IOException{
        // Create an instance of the Random class
        Random rand = new Random();

        // initialize the pkmnTrainer list
        pkmnTrainers = new ArrayList<PokemonTrainer>();

        // Generate a number from 1-3 that will determine what kind of battle we're in
        int intRandom = rand.nextInt(3);
        // If the number was a 0, we're in a wild pokemon battle
        if(intRandom == 0){
            this.strBackground = "Wild Grass";
            this.isWildPokemon = true;
            this.isGymBattle = false;
            this.pkmnTrainerCount = 1;
        }
        // If the number was a 1, it's a non gym pokemon trainer battle
        else if(intRandom == 1){
            this.strBackground = "Desert";
            this.isWildPokemon = false;
            this.isGymBattle = false;
            this.pkmnTrainerCount = 2;
        }
        // If the number was a 2, it's a gym battle
        else if(intRandom == 2){
            this.strBackground = "Gym";
            this.isWildPokemon = false;
            this.isGymBattle = true;
            this.pkmnTrainerCount = 2;
        }

        createTrainers();
        // Create input 
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        
        

        // Roll a random move for the opponent and do the moves depending on which pokemon speed stat is faster
        // Count that decides what pokemon the trainers are at
        int trainer1count = 0;
        int trainer2count = 0;
        int moveChoice = 0;
        while(trainer1count < pkmnTrainers.get(0).getPokemonAmount() &&  trainer2count < pkmnTrainers.get(1).getPokemonAmount()){
            // Battle Sequence
        // First define what kind of battle we're in, and if we can catch this pokemon
        System.out.println(pkmnTrainers.get(0).getTrainerName() + " has " + (pkmnTrainers.get(0).getPokemonAmount() - trainer1count) + " pokemon.");
        System.out.println(pkmnTrainers.get(1).getTrainerName() + " has " + (pkmnTrainers.get(1).getPokemonAmount() - trainer2count) + " pokemon.");
        System.out.println(pkmnTrainers.get(0).getTrainerName() + " sends out " + pkmnTrainers.get(0).getPokemonName(trainer1count) + ".");
        if(pkmnTrainers.get(1).getisWildPokemon()){
            System.out.println("A wild " + pkmnTrainers.get(1).getPokemonName(trainer2count) + " appeared.");
            isCatchable = true;
        }
        else{
            System.out.println(pkmnTrainers.get(1).getTrainerName() + " sends out " + pkmnTrainers.get(1).getPokemonName(trainer2count) + ".");
        }
        while(pkmnTrainers.get(0).getPokemonHP(trainer1count) >= 0 && pkmnTrainers.get(1).getPokemonHP(trainer2count) >= 0){
                // Throw out the first pokemon, let them do moves, higher speed goes first, when HP reaches 0 throw out next pokemon
            System.out.println("Choose a move: 1 = " + pkmnTrainers.get(0).getPokemonMoveName(trainer1count, 0));
            if(pkmnTrainers.get(0).getMoveAmount(trainer1count) == 2){
                System.out.println(" 2 = " + pkmnTrainers.get(0).getPokemonMoveName(trainer1count, 1));
            }
            else if(pkmnTrainers.get(0).getMoveAmount(trainer1count) == 3){
                System.out.print(" 2 = " + pkmnTrainers.get(0).getPokemonMoveName(trainer1count, 1));
                System.out.println(" 3 = " + pkmnTrainers.get(0).getPokemonMoveName(trainer1count, 2));
            }
            else if(pkmnTrainers.get(0).getMoveAmount(trainer1count) == 4){
                System.out.print(" 2 = " + pkmnTrainers.get(0).getPokemonMoveName(trainer1count, 1));
                System.out.print(" 3 = " + pkmnTrainers.get(0).getPokemonMoveName(trainer1count, 2));
                System.out.println(" 4 = " + pkmnTrainers.get(0).getPokemonMoveName(trainer1count, 3));
            }
            moveChoice = Integer.parseInt(keyboard.readLine());
            while(moveChoice < 0 || moveChoice > (pkmnTrainers.get(0).getMoveAmount(0))){
                System.out.print("Value not accepted");
                moveChoice = Integer.parseInt(keyboard.readLine());
            }

            moveChoice -= 1;

            // get all the stats of the pokemon and the move its using
        
                int movePower1 = pkmnTrainers.get(0).getMovePower(trainer1count, moveChoice);
                boolean isSpecial1 = pkmnTrainers.get(0).getIsSpecial(trainer1count, moveChoice);
                int attackerPokemonType1 = pkmnTrainers.get(0).getPokemonType(trainer1count);
                int defenderPokemonType1 = pkmnTrainers.get(0).getPokemonType(trainer1count);

                int randMove = rand.nextInt(pkmnTrainers.get(1).getMoveAmount(trainer2count) - 1);
                int movePower2 = pkmnTrainers.get(1).getMovePower(trainer2count, randMove);
                boolean isSpecial2 = pkmnTrainers.get(1).getIsSpecial(trainer2count, randMove);
                int attackerPokemonType2 = pkmnTrainers.get(1).getPokemonType(trainer2count);
                int defenderPokemonType2 = pkmnTrainers.get(1).getPokemonType(trainer2count);

                if(pkmnTrainers.get(0).getPokemonSPEED(trainer1count) >= pkmnTrainers.get(1).getPokemonSPEED(trainer2count)){
                        // Decide if trainer1 goes first or if trainer2 goes first
                        // input these stats and make the recieving pokemon take damage for it
                    System.out.println(pkmnTrainers.get(0).getPokemonName(trainer1count) + " uses " + pkmnTrainers.get(0).getPokemonMoveName(trainer1count, moveChoice));
                    pkmnTrainers.get(1).takeDamage(trainer2count, movePower1, isSpecial1, attackerPokemonType1, defenderPokemonType2);
                    
                    // check if a pokemon fainted
                    if(pkmnTrainers.get(1).getPokemonHP(trainer2count) <= 0){
                        System.out.println(pkmnTrainers.get(1).getPokemonName(trainer1count) + " fainted.");
                        trainer2count++;
                        break;
                    }
                    // next player attacks
                    System.out.println(pkmnTrainers.get(1).getPokemonName(trainer2count) + " uses " + pkmnTrainers.get(1).getPokemonMoveName(trainer2count, randMove));
                    pkmnTrainers.get(0).takeDamage(trainer1count, movePower2, isSpecial2, attackerPokemonType2, defenderPokemonType1);
                    // check if a pokemon fainted
                    if(pkmnTrainers.get(0).getPokemonHP(trainer1count) <= 0){
                        System.out.println(pkmnTrainers.get(0).getPokemonName(trainer1count) + " fainted.");
                        trainer1count++;
                        break;
                    }
                }
                else if(pkmnTrainers.get(1).getPokemonSPEED(trainer2count) >= pkmnTrainers.get(0).getPokemonSPEED(trainer1count)){
                    // input these stats and make the recieving pokemon take damage for it
                    System.out.println(pkmnTrainers.get(1).getPokemonName(trainer2count) + " uses " + pkmnTrainers.get(1).getPokemonMoveName(trainer2count, randMove));
                    pkmnTrainers.get(0).takeDamage(trainer1count, movePower2, isSpecial2, attackerPokemonType2, defenderPokemonType1);
                    // check if a pokemon fainted
                    if(pkmnTrainers.get(0).getPokemonHP(trainer1count) <= 0){
                        System.out.println(pkmnTrainers.get(0).getPokemonName(trainer1count) + " fainted.");
                        trainer1count++;
                        break;
                    }
                    // next player attacks
                    System.out.println(pkmnTrainers.get(0).getPokemonName(trainer1count) + " uses " + pkmnTrainers.get(0).getPokemonMoveName(trainer1count, moveChoice));
                    pkmnTrainers.get(1).takeDamage(trainer2count, movePower1, isSpecial1, attackerPokemonType1, defenderPokemonType2);
                    
                    // check if a pokemon fainted
                    if(pkmnTrainers.get(1).getPokemonHP(trainer2count) <= 0){
                        System.out.println(pkmnTrainers.get(1).getPokemonName(trainer2count) + " fainted.");
                        trainer2count++;
                        break;
                    }
                }
                
                
            }
        }

        System.out.println("game done");
        // when one person has no pokemon, they lose

        // then add all the win prizes
        
    }

    public String getBackground(){
        return strBackground;
    }

    public boolean getIsWildPokemon(){
        return isWildPokemon;
    }

    public boolean getIsGymBattle(){
        return isGymBattle;
    }
    
    public int getPkmnTrainerNum(){
        return pkmnTrainerCount;
    }

    public void createTrainers() throws IOException{
        // Create an instance of the Random class
        Random rand = new Random();

        // Create input 
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Create required number of trainers based on randomized variables
        for(int i = 0; i < pkmnTrainerCount; i++){
            // first trainer is user input
            if(i == 0){
                String trainerName;
                int trainerBadges;
                System.out.print("Please name your trainer: ");
                trainerName = keyboard.readLine();
                System.out.print("Please tell me how many badges you have (up to 8): ");
                trainerBadges = Integer.parseInt(keyboard.readLine());
                while(trainerBadges > 8 && trainerBadges >= 0){
                    System.out.println("Please tell me how many badges you have (up to 8): ");
                    trainerBadges = Integer.parseInt(keyboard.readLine());
                }

                pkmnTrainers.add(new PokemonTrainer(trainerName, trainerBadges, false));
            }
            // second trainer is random
            else if(i == 1 && isWildPokemon != true){
                String strRandName = "";
                int intRandBadges = 0;
                int intRandom = rand.nextInt(10);
                // Determine Random Name
                if(isGymBattle){
                    intRandBadges = 8;
                    if(intRandom == 0){
                        strRandName = "Gym Leader Brock";
                    }else if(intRandom == 1){
                        strRandName = "Gym Leader Blue";
                    }
                    else if(intRandom == 2){
                        strRandName = "Gym Leader Misty";
                    }
                    else if(intRandom == 3){
                        strRandName = "Gym Leader Sabrina";
                    }
                    else if(intRandom == 4){
                        strRandName = "Gym Leader Roxanne";
                    }
                    else if(intRandom == 5){
                        strRandName = "Gym Leader Byron";
                    }
                    else if(intRandom == 6){
                        strRandName = "Gym Leader Flannery";
                    }
                    else if(intRandom == 7){
                        strRandName = "Gym Leader Juan";
                    }
                    else if(intRandom == 8){
                        strRandName = "Gym Leader Winona";
                    }
                    else if(intRandom == 9){
                        strRandName = "Gym Leader Norman";
                    }
                    
                }
                else{
                    if(intRandom == 0){
                        strRandName = "Pokemon Trainer Red";
                        intRandBadges = 0;
                    }
                    else if(intRandom == 1){
                        strRandName = "Pokemon Trainer Ethan";
                        intRandBadges = 1;
                    }
                    else if(intRandom == 2){
                        strRandName = "Pokemon Trainer May";
                        intRandBadges = 2;
                    }
                    else if(intRandom == 3){
                        strRandName = "Bug Catcher Vik";
                        intRandBadges = 3;
                    }
                    else if(intRandom == 4){
                        strRandName = "Sewer Manager Alfred";
                        intRandBadges = 4;
                    }
                    else if(intRandom == 5){
                        strRandName = "Pokemon Fanatic Valerie";
                        intRandBadges = 3;
                    }
                    else if(intRandom == 6){
                        strRandName = "Prep Kid Rick";
                        intRandBadges = 5;
                    }
                    else if(intRandom == 7){
                        strRandName = "Pokemon Lover Eli";
                        intRandBadges = 2;
                    }
                    else if(intRandom == 8){
                        strRandName = "Pokemon Trainer David";
                        intRandBadges = 0;
                    }
                    else if(intRandom == 9){
                        strRandName = "Cool Guy Joseph";
                        intRandBadges = 0;
                    }
                }

                // if gym leader, 8 badges
                pkmnTrainers.add(new PokemonTrainer(strRandName, intRandBadges, false));
            }
            
        }
        if(this.isWildPokemon){
            pkmnTrainers.add(new PokemonTrainer("Wild", 0, true));
        }
    }
}