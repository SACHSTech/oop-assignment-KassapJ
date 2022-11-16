import java.util.ArrayList;

public class PokemonTrainer{
    private String strTrainerName;
    private int intTrainerBadges;
    private ArrayList<Pokemon> pkmn;
    private ArrayList<Items> items;

    public PokemonTrainer(String strName, int intBadges){
        this.strTrainerName = strName;
        this.intTrainerBadges = intBadges;
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


}