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
        this.intPokemonAttack = attack;
        this.intPokemonDEF = defense;
        this.intPokemonSPATTACK = spattack;
        this.intPokemonSPDEF = spdefense;
        this.intPokemonSPEED = speed;
        moves = new ArrayList<Moves>();
    } 

    public void createMove(){
        if(this.intPokemonType == 0){
            moves.add(new Moves("Leech Life", this.intPokemonType, false, 20, 100));
            moves.add(new Moves("Pin Missile", this.intPokemonType, false, 42, 85));
            moves.add(new Moves("Twineedle", this.intPokemonType, false, 25, 100));
        }
        else if(this.intPokemonType == 1){
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
        }
        else if(this.intPokemonType == 2){
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
        }
        else if(this.intPokemonType == 3){
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
        }
        else if(this.intPokemonType == 4){
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
        }
        else if(this.intPokemonType == 5){
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
        }
        
        else if(this.intPokemonType == 6){
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
        }
        
        else if(this.intPokemonType == 7){
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
        }
        else if(this.intPokemonType == 8){
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
        }
        
        else if(this.intPokemonType == 9){
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
        }
        else if(this.intPokemonType == 10){
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
        }
        else if(this.intPokemonType == 11){
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
        }
        
        else if(this.intPokemonType == 12){
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
        }
        else if(this.intPokemonType == 13){
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, false, movePower, Accuracy));
        }
        else if(this.intPokemonType == 14){
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
            moves.add(new Moves("Name", this.intPokemonType, true, movePower, Accuracy));
        }
        
        
    }

    public void takeDamage(int power, boolean isSpecial, int opponentType){
        // calculate multiplier based on type difference
        int multiplier = 1; 

        if(isSpecial){
            this.dblPokemonHP -= ((power / (intPokemonSPDEF / 2)) * multiplier);
        }
        else{
            this.dblPokemonHP -= ((power / (intPokemonDEF / 2)) * multiplier);
        }

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
}
