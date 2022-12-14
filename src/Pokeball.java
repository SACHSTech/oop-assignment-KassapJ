import java.util.Random;

public class Pokeball extends Items{
    /**
    * An extension of the items class, which holds the information an item might have, as well as
    * giving extra functionality to catch a pokemon.
    * @author John Matthew Kassapian
    */
    private int intPokeballType;
    private double dblCatchRate;
    private int N;
    private int Ball;

    public Pokeball(String name, int amount, int type){
        super(name, amount);
        
        // Random object
        Random rand = new Random();

        // Make sure the pokeball types fit properly
        this.intPokeballType = type;
        if(this.intPokeballType < 0){
            this.intPokeballType = 0;
        }
        else if(this.intPokeballType > 4){
            this.intPokeballType = 4;
        }
        // Determine catch rate based on type of pokeball
        // 0 = Pokeball 0 - 255, 1 = great ball 0 - 200, 2 = Ultra Ball 0 - 150, 3 = Master Ball (if used the pokemon is caught)
        // REAL EQUATION FOR CATCHING A POKEMON IS GOING TO BE USED
        if(this.intPokeballType == 0){
            this.N = rand.nextInt(255);
            this.Ball = 12;
        }
        else if(this.intPokeballType == 1){
            this.N = rand.nextInt(200);
            this.Ball = 8;
        }
        else if(this.intPokeballType == 2){
            this.N = rand.nextInt(150);
            this.Ball = 12;
        }
    }
    
    /**
    * this method returns an int value which represent which type of pokeball this is
    *
    * @param N/A
    * @return int intPokeballType
    */
    public int getPokeballType(){
        return this.intPokeballType;
    }

    /**
    * this method sets the type of pokeball this is
    *
    * @param int x, which is the int value to give this pokeball 
    * @return N/A
    */
    public void setPokeballType(int x){
        this.intPokeballType = x;
    }

    /**
    * this pokeball runs the calculations to see if the trainer was successful in catching a wild pokemon
    *
    * @param double MaxHP, which is the opposing wild pokemon's max hp value, double HP, which is the opposing wild pokemon's current hp value
    * @return boolean value that represents if the pokemon was caught or not
    */
    public boolean usePokeball(double MaxHP, double HP){
        double f = 0;

        f = (MaxHP * 255 * 4) / (HP * this.Ball);
        if(f > 255){
            f = 255;
        }

        if(f >= this.N){
            return true;
        }
        else if(this.intPokeballType == 3){
            // return true if masterball
            return true;
        }

        return false;
    }
}
