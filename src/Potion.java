public class Potion extends Items{
    /**
    * An extension of the items class, which holds the information an item might have, as well as
    * giving extra functionality to heal a pokemon.
    * @author John Matthew Kassapian
    */
    private int intPotionType;
    private double dblHealPoints;
    public Potion(String name, int amount, int Type){
        super(name, amount);
        this.intPotionType = Type;
        if(this.intPotionType < 0){
            this.intPotionType = 0;
        }
        else if(this.intPotionType > 3){
            this.intPotionType = 3;
        }
        // determine number of heal points based on type of potion
        // 0 = Regular Potion, 1 = Super Potion, 2 = Hyper Potion, 3 = Full Restore
        if(this.intPotionType == 0){
            this.dblHealPoints = 20.0;
        }
        else if(this.intPotionType == 1){
            this.dblHealPoints = 50.0;
        }
        else if(this.intPotionType == 2){
            this.dblHealPoints = 200.0;
        }
        else if(this.intPotionType == 3){
            this.dblHealPoints = 9999;
        }
    }

    /**
    * this method returns what type of potion this is.
    *
    * @param N/A
    * @return int value that represents the potion type
    */
    public int getPotionType(){
        return this.intPotionType;
    }

    /**
    * this method sets what type of potion this is
    *
    * @param int x being the type of potion
    * @return N/A
    */
    public void setPotionType(int x){
        this.intPotionType = x;
    }

    /**
    * this method returns the heal points the potion will heal
    *
    * @param N/A
    * @return double value, representing how much HP will be healed
    */
    public double getdblHealPoints(){
        return this.dblHealPoints;
    }

    /**
    * this method simulates using the potion, and will return a value for a new current HP, without going over the max
    *
    * @param double maxHP, double HP
    * @return double newHP, which is the newHP of the pokemon the potion is used on
    */
    public double usePotion(double maxHP, double HP){
        double newHP = 0;

        newHP += this.dblHealPoints;
        if(newHP > maxHP){
            newHP = maxHP;
        }

        return newHP;
    }
}
