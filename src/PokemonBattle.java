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

        if(isWildPokemon){
            // create a wild pokemon to fight if we are fighting a wild pokemon
        }
        
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

                pkmnTrainers.add(new PokemonTrainer(trainerName, trainerBadges));
            }
            // second trainer is random
            else if(i == 1){
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
                pkmnTrainers.add(new PokemonTrainer(strRandName, intRandBadges));
            }
        }
    }
}