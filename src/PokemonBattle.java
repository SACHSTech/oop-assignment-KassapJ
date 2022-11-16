import java.util.ArrayList;
import java.util.Random;
import java.io.*;

public class PokemonBattle{

    private String strBackground;
    private boolean isWildPokemon;
    private boolean isGymBattle;
    private int pkmnTrainerCount;
    private ArrayList<PokemonTrainer> pkmnTrainers;


    public PokemonBattle() throws IOException{
        // Create an instance of the Random class
        Random rand = new Random();

        // Generate a number from 1-3 that will determine what kind of battle we're in
        int intRandom = rand.nextInt(3);
        // If the number was a 0, we're in a wild pokemon battle
        if(intRandom == 0){
            strBackground = "Wild Grass";
            isWildPokemon = true;
            isGymBattle = false;
            pkmnTrainerCount = 1;
        }
        // If the number was a 1, it's a non gym pokemon trainer battle
        else if(intRandom == 1){
            strBackground = "Desert";
            isWildPokemon = false;
            isGymBattle = false;
            pkmnTrainerCount = 2;
        }
        // If the number was a 2, it's a gym battle
        else if(intRandom == 2){
            strBackground = "Gym";
            isWildPokemon = false;
            isGymBattle = true;
            pkmnTrainerCount = 2;
        }

        createTrainers();
        
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
                System.out.println("Please name your trainer: ");
                trainerName = keyboard.readLine();
                System.out.print("Please tell me how many badges you have (up to 8): ");
                trainerBadges = Integer.parseInt(keyboard.readLine());
                while(trainerBadges > 8){
                    System.out.println("Please tell me how many badges you have (up to 8): ");
                    trainerBadges = Integer.parseInt(keyboard.readLine());
                }

                pkmnTrainers.add(new PokemonTrainer(trainerName, trainerBadges));
            }
            // second trainer is random
            else if(i == 1){
                String strRandName = "";
                int intRandBadges = 0;
                int intRandom = rand.nextInt(10);
                // Determine Random Name
                if(isGymBattle){
                    if(intRandom == 0){
                        strRandName = "Gym Leader Brock";
                        intRandBadges = 8;
                    }else if(intRandom == 1){
                        strRandName = "Gym Leader Blue";
                        intRandBadges = 8;
                    }
                    else if(intRandom == 2){
                        strRandName = "Gym Leader Misty";
                        intRandBadges = 8;
                    }
                    else if(intRandom == 3){
                        strRandName = "Gym Leader Sabrina";
                        intRandBadges = 8;
                    }
                    else if(intRandom == 4){
                        strRandName = "Gym Leader Roxanne";
                        intRandBadges = 8;
                    }
                    else if(intRandom == 5){
                        strRandName = "Gym Leader Byron";
                        intRandBadges = 8;
                    }
                    else if(intRandom == 6){
                        strRandName = "Gym Leader Flannery";
                        intRandBadges = 8;
                    }
                    else if(intRandom == 7){
                        strRandName = "Gym Leader Juan";
                        intRandBadges = 8;
                    }
                    else if(intRandom == 8){
                        strRandName = "Gym Leader Winona";
                        intRandBadges = 8;
                    }
                    else if(intRandom == 9){
                        strRandName = "Gym Leader Norman";
                        intRandBadges = 8;
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
                pkmnTrainers.add(new PokemonTrainer(strRandName, intRandBadges));
            }
        }
    }
}