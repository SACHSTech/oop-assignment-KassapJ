import java.util.ArrayList;

import javax.lang.model.element.TypeElement;

public class Pokemon {
    private String strPokemonName;
    private int intPokemonType;
    private int intPokemonLevel;
    private double dblPokemonExp;
    private double dblPokemonMAXHP;
    private double dblPokemonHP;
    private int intPokemonAttack;
    private int intPokemonDEF;
    private int intPokemonSPATTACK;
    private int intPokemonSPDEF;
    private int intPokemonSPEED;
    private ArrayList<Moves> moves;

    public Pokemon(String name, int type, int level, double exp, double hp, int attack, int defense, int spattack, int spdefense, int speed){
        // Types of pokemon 0 = bug, 1 = dragon, 2 = electric, 3 = fighting, 4 = fire, 5 = flying, 6 = ghost, 7 = grass, 8 = ground, 9 = ice, 10 = normal, 11 = poison, 12 = psychic, 13 = rock, 14 = water
        
        this.strPokemonName = name;
        this.intPokemonType = type;
        this.intPokemonLevel = level;
        this.dblPokemonExp = exp;
        this.dblPokemonMAXHP = hp;
        this.dblPokemonHP = hp;
        this.intPokemonAttack = attack;
        this.intPokemonDEF = defense;
        this.intPokemonSPATTACK = spattack;
        this.intPokemonSPDEF = spdefense;
        this.intPokemonSPEED = speed;
        moves = new ArrayList<Moves>();

        // Give the pokemon moves

        createMoves();
    } 

    public void createMoves(){
        if(this.intPokemonType == 0){
            // Bug 
            moves.add(new Moves("Leech Life", this.intPokemonType, false, 20, 100));
            moves.add(new Moves("Pin Missile", this.intPokemonType, false, 42, 85));
            moves.add(new Moves("Twineedle", this.intPokemonType, false, 25, 100));
        }
        else if(this.intPokemonType == 1){
            // Dragon 
            moves.add(new Moves("Dragon Rage", this.intPokemonType, true, 40, 100));
        }
        else if(this.intPokemonType == 2){
            // Electric
            moves.add(new Moves("Thunder", this.intPokemonType, true, 120, 70));
            moves.add(new Moves("Thunder Punch", this.intPokemonType, true, 75, 100));
            moves.add(new Moves("Thunder Shock", this.intPokemonType, true, 40, 100));
            moves.add(new Moves("Thunderbolt", this.intPokemonType, true, 95, 100));
        }
        else if(this.intPokemonType == 3){
            // Fighting
            moves.add(new Moves("Hi Jump Kick", this.intPokemonType, false, 85, 90));
            moves.add(new Moves("Jump Kick", this.intPokemonType, false,70 , 95));
            moves.add(new Moves("Low Kick", this.intPokemonType, false, 50, 90));
            moves.add(new Moves("Submission", this.intPokemonType, false, 80, 80));
        }
        else if(this.intPokemonType == 4){
            // Fire
            moves.add(new Moves("Ember", this.intPokemonType, true, 40, 100));
            moves.add(new Moves("Fire Blast", this.intPokemonType, true, 120, 85));
            moves.add(new Moves("Fire Punch", this.intPokemonType, true, 75, 100));
            moves.add(new Moves("Flamethrower", this.intPokemonType, true, 95, 100));
        }
        else if(this.intPokemonType == 5){
            // Flying
            moves.add(new Moves("Drill Peck", this.intPokemonType, false, 80, 100));
            moves.add(new Moves("Fly", this.intPokemonType, false, 70, 95));
            moves.add(new Moves("Peck", this.intPokemonType, false, 35, 100));
            moves.add(new Moves("Sky Attack", this.intPokemonType, false, 140, 60));
        }
        
        else if(this.intPokemonType == 6){
            // Ghost
            moves.add(new Moves("Lick", this.intPokemonType, false, 20, 100));
            moves.add(new Moves("Night Shade", this.intPokemonType, false, 50, 100));
        }
        
        else if(this.intPokemonType == 7){
            // Grass
            moves.add(new Moves("Razor Leaf", this.intPokemonType, true, 70, 100));
            moves.add(new Moves("Solar Beam", this.intPokemonType, true, 120, 50));
        }
        else if(this.intPokemonType == 8){
            // Ground
            moves.add(new Moves("Bone Club", this.intPokemonType, false, 65, 85));
            moves.add(new Moves("Bonemerang", this.intPokemonType, false, 100, 90));
            moves.add(new Moves("Dig", this.intPokemonType, false, 100, 100));
            moves.add(new Moves("Earthquake", this.intPokemonType, false, 100, 100));
        }
        
        else if(this.intPokemonType == 9){
            // Ice
            moves.add(new Moves("Aurora Beam", this.intPokemonType, true,65, 100));
            moves.add(new Moves("Blizzard", this.intPokemonType, true, 120, 90));
            moves.add(new Moves("Ice Beam", this.intPokemonType, true, 95, 100));
            moves.add(new Moves("Ice Punch", this.intPokemonType, true, 75, 100));
        }
        else if(this.intPokemonType == 10){
            // Normal
            moves.add(new Moves("Tackle", this.intPokemonType, false, 35, 95));
        }
        else if(this.intPokemonType == 11){
            // poison
            moves.add(new Moves("Acid", this.intPokemonType, false, 40, 100));
            moves.add(new Moves("Poison Sting", this.intPokemonType, false, 15, 100));
            moves.add(new Moves("Sludge", this.intPokemonType, false, 65, 100));
            moves.add(new Moves("Smog", this.intPokemonType, false, 20, 70));
        }
        
        else if(this.intPokemonType == 12){
            // psychic
            moves.add(new Moves("Confusion", this.intPokemonType, true, 50, 100));
            moves.add(new Moves("Psybeam", this.intPokemonType, true, 65, 100));
            moves.add(new Moves("Psychic", this.intPokemonType, true, 90, 100));
        }
        else if(this.intPokemonType == 13){
            // rock
            moves.add(new Moves("Rock Slide", this.intPokemonType, false, 75, 90));
            moves.add(new Moves("Rock Throw", this.intPokemonType, false, 50, 65));
        }
        else if(this.intPokemonType == 14){
            // water
            moves.add(new Moves("Bubble", this.intPokemonType, true, 20, 100));
            moves.add(new Moves("Hydro Pump", this.intPokemonType, true, 120, 80));
            moves.add(new Moves("Surf", this.intPokemonType, true, 95, 100));
            moves.add(new Moves("Water Gun", this.intPokemonType, true, 40, 100));
        }
        
        
    }

    public void takeDamage(int power, boolean isSpecial, int attackerType, int defenderType){
        // calculate multiplier based on type difference
        // Super eff = * 1.25, not effective = 0.8
        double multiplier = 1; 
        System.out.println(this.dblPokemonHP);
        if(defenderType == 0){
            if(attackerType == 4 || attackerType == 5 || attackerType == 11 || attackerType == 13){
                multiplier = 1.25;
            }
            else if(attackerType == 7){
                multiplier = 0.8;
            }
        }
        else if(defenderType == 1){
            if(attackerType == 9){
                multiplier = 1.25;
            }
        }
        else if(defenderType == 2){
            if(attackerType == 8){
                multiplier = 1.25;
            }
            else if(attackerType == 2 || attackerType == 5){
                multiplier = 0.8;
            }
        }
        else if(defenderType == 3){
            if(attackerType == 5 || attackerType == 12){
                multiplier = 1.25;
            }
            else if(attackerType == 13){
                multiplier = 0.8;
            }
        }
        else if(defenderType == 4){
            if(attackerType == 8 || attackerType == 13 || attackerType == 14){
                multiplier = 1.25;
            }
            else if(attackerType == 0 || attackerType == 7){
                multiplier = 0.8;
            }
        }
        else if(defenderType == 5){
            if(attackerType == 2 || attackerType == 9 || attackerType == 12){
                multiplier = 1.25;
            }
            else if(attackerType == 0 || attackerType == 3 || attackerType == 7){
                multiplier = 0.8;
            }
            else if(attackerType == 8){
                multiplier = 0;
            }
        }
        else if(defenderType == 6){
            if(attackerType == 3 || attackerType == 10){
                multiplier = 0;
            }
        }
        else if(defenderType == 7){
            if(attackerType == 0 || attackerType == 4 || attackerType == 5 || attackerType == 9 || attackerType == 11){
                multiplier = 1.25;
            }
            else if(attackerType == 2 || attackerType == 7 || attackerType == 8 || attackerType == 14){
                multiplier = 0.8;
            }
        }
        else if(defenderType == 8){
            if(attackerType == 7 || attackerType == 9 || attackerType == 14){
                multiplier = 1.25;
            }
            else if(attackerType == 11){
                multiplier = 0.8;
            }
            else if(attackerType == 2){
                multiplier = 0;
            }
        }
        else if(defenderType == 9){
            if(attackerType == 3 || attackerType == 4 || attackerType == 13){
                multiplier = 1.25;
            }
            else if(attackerType == 9 || attackerType == 14){
                multiplier = 0.8;
            }
        }
        else if(defenderType == 10){
            if(attackerType == 3){
                multiplier = 1.25;
            }
            else if(attackerType == 6){
                multiplier = 0;
            }
        }
        else if(defenderType == 11){
            if(attackerType == 0 || attackerType == 8 || attackerType == 12){
                multiplier = 1.25;
            }
            else if(attackerType == 7 || attackerType == 11){
                multiplier = 0.8;
            }
        }
        else if(defenderType == 12){
            if(attackerType == 0){
                multiplier = 1.25;
            }
            else if(attackerType == 3 || attackerType == 12){
                multiplier = 0.8;
            }
            else if(attackerType == 6){
                multiplier = 0;
            }
        }
        else if(defenderType == 13){
            if(attackerType == 3 || attackerType == 7 || attackerType == 8 || attackerType == 14){
                multiplier = 1.25;
            }
            else if(attackerType == 0 || attackerType == 4|| attackerType == 5 || attackerType == 11 || attackerType == 13){
                multiplier = 0.8;
            }
        }
        else if(defenderType == 14){
            if(attackerType == 2 || attackerType == 7){
                multiplier = 1.25;
            }
            else if(attackerType == 4 || attackerType == 9){
                multiplier = 0.8;
            }
        }
        
        

        if(isSpecial){
            this.dblPokemonHP -= ((power / (intPokemonSPDEF / 2)) * multiplier);
        }
        else{
            this.dblPokemonHP -= ((power / (intPokemonDEF / 2)) * multiplier);
        }

        System.out.println(this.dblPokemonHP);
    }

    public String getPokemonName(){
        return this.strPokemonName;
    }

    public void setPokemonName(String x){
        this.strPokemonName = x;
    }
    
    public int getPokemonType(){
        return this.intPokemonType;
    }

    public void setPokemonType(int x){
        this.intPokemonType = x;
    }

    public int getPokemonLevel(){
        return this.intPokemonLevel;
    }

    public void setPokemonLevel(int x){
        this.intPokemonLevel = x;
    }

    public double getPokemonExp(){
        return this.dblPokemonExp;
    }

    public void setPokemonExp(double x){
        this.dblPokemonExp = x;
    }

    public double getPokemonMAXHP(){
        return this.dblPokemonMAXHP;
    }

    public void setPokemonMAXHP(double x){
        this.dblPokemonMAXHP = x;
    }


    public double getPokemonHP(){
        return this.dblPokemonHP;
    }

    public void setPokemonHP(double x){
        this.dblPokemonHP = x;
    }

    public int getPokemonATTACK(){
        return this.intPokemonAttack;
    }

    public void setPokemonATTACK(int x){
        this.intPokemonAttack = x;
    }

    public int getPokemonDEF(){
        return this.intPokemonDEF;
    }

    public void setPokemonDEF(int x){
        this.intPokemonDEF = x;
    }

    public int getPokemonSPATTACK(){
        return this.intPokemonSPATTACK;
    }

    public void setPokemonSPATTACK(int x){
        this.intPokemonSPATTACK = x;
    }

    public int getPokemonSPDEF(){
        return this.intPokemonSPDEF;
    }

    public void setPokemonSPDEF(int x){
        this.intPokemonSPDEF = x;
    }

    public int getPokemonSPEED(){
        return this.intPokemonSPEED;
    }

    public void setPokemonSPEED(int x){
        this.intPokemonSPEED = x;
    }

    public String getMoveName(int i){
        return moves.get(i).getMoveName();
    }

    public int getMovePower(int i){
        return moves.get(i).getMovePower();
    }

    public boolean getIsSpecial(int i){
        return moves.get(i).getIsSpecial();
    }

    public int getMoveAmount(){
        return moves.size();
    }
}
