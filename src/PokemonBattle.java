import java.util.ArrayList;
import java.util.Random;

public class PokemonBattle{

    private String strBackground;
    private boolean isWildPokemon;
    private boolean isGymBattle;
    private int pkmnTrainerCount;
    private ArrayList<PokemonTrainer> pkmnTrainers;


    public PokemonBattle(){
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

    public void createTrainers(){
        // Create an instance of the Random class
        Random rand = new Random();

        // Create required number of trainers based on randomized variables
        for(int i = 0; i < pkmnTrainerCount; i++){
            // first trainer is user input
            if(i == 0){
                pkmnTrainers.add(new PokemonTrainer());
            }
            // second trainer is random
            else if(i == 1){
                String strRandName;
                int intRandBadges;
                int intRandom = rand.nextInt(10);
                // Determine Random Name
                if(isGymBattle){
                    if(intRandom == 0){
                        
                    }
                }
                else{
                    if(intRandom == 0){

                    }
                }

                // if gym leader, 8 badges
                pkmnTrainers.add(new PokemonTrainer(strRandName, intRandBadges));
            }
        }
    }
}