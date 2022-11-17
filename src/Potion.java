public class Potion extends Items{
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

    public int getPotionType(){
        return this.intPotionType;
    }
    public void setPotionType(int x){
        this.intPotionType = x;
    }
    public double getdblHealPoints(){
        return this.dblHealPoints;
    }

    public double usePotion(double maxHP, double HP){
        double newHP = 0;

        newHP += this.dblHealPoints;
        if(newHP > maxHP){
            newHP = maxHP;
        }

        return newHP;
    }
}
