import java.util.ArrayList;
import java.util.Random;

public class PokemonTrainer{
    private String strTrainerName;
    private int intTrainerBadges;
    private ArrayList<Pokemon> pkmn;
    private ArrayList<Items> items;

    public PokemonTrainer(String strName, int intBadges){
        this.strTrainerName = strName;
        this.intTrainerBadges = intBadges;
        // initialize arraylist
        pkmn = new ArrayList<Pokemon>();
        items = new ArrayList<Items>();
        // Says the names of trainer and their badges
        // System.out.println(this.strTrainerName);
        // System.out.println(this.intTrainerBadges);

        // Random object
        Random rand = new Random();

        // Create a random amount of items that will be made 0-10
        int intRandom = rand.nextInt(11);

        // Create a random amount of Pokemon that will be given 1-6
        int intRandom2 = rand.nextInt(6 - 1 + 1) + 1;
        
    }

    public String getTrainerName(){
        return strTrainerName;
    }

    public void setTrainerName(String x){
        strTrainerName = x;
    }

    public int getTrainerBadges(){
        return intTrainerBadges;
    }

    public void setTrainerBadges(int x){
        int getTrainerBadges = x;
    }

    public void createTrainerPokemon(){

    }

    public void createTrainerItems(){

    }


}