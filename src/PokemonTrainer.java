import java.util.ArrayList;
import java.util.Random;

public class PokemonTrainer{
    private String strTrainerName;
    private int intTrainerBadges;
    private boolean isWildPkmn;
    private ArrayList<Pokemon> pkmn;
    private ArrayList<Items> items;
    private ArrayList<Pokeball> pokeballs;
    private ArrayList<Potion> potions;
    private int pokemonCount;
    private int itemCount;

    public PokemonTrainer(String strName, int intBadges, boolean isWild){
        this.strTrainerName = strName;
        this.intTrainerBadges = intBadges;
        this.isWildPkmn = isWild;
        // initialize arraylist
        pkmn = new ArrayList<Pokemon>();
        items = new ArrayList<Items>();
        pokeballs = new ArrayList<Pokeball>();
        potions = new ArrayList<Potion>();

        // Says the names of trainer and their badges
        // System.out.println(this.strTrainerName);
        // System.out.println(this.intTrainerBadges);

        // Random object
        Random rand = new Random();

        // If it's a wild pokemon, one pokemon, no items
        if(this.isWildPkmn){
            createWildPokemon();
        }
        else{
            // create normal trainer
            createTrainerItems();
            createTrainerPokemon();
        }

        
        
    }

    public void takeDamage(int i, int movePower, boolean isSpecial, int attackerPokemonType, int defenderPokemonType){
        pkmn.get(i).takeDamage(movePower, isSpecial, attackerPokemonType, defenderPokemonType);
    }

    public int getMoveAmount(int i){
        return pkmn.get(i).getMoveAmount();
    }

    public String getPokemonName(int i){
        return pkmn.get(i).getPokemonName();
    }
    public int getPokemonType(int i){
        return pkmn.get(i).getPokemonType();
    }
    public int getPokemonLevel(int i){
        return pkmn.get(i).getPokemonLevel();
    }
    public double getPokemonExp(int i){
        return pkmn.get(i).getPokemonExp();
    }
    public double getPokemonMAXHP(int i){
        return pkmn.get(i).getPokemonMAXHP();
    }
    public double getPokemonHP(int i){
        return pkmn.get(i).getPokemonHP();
    }
    public int getPokemonAttack(int i){
        return pkmn.get(i).getPokemonATTACK();
    }
    public int getPokemonDEF(int i){
        return pkmn.get(i).getPokemonDEF();
    }
    public int getPokemonSPATTACK(int i){
        return pkmn.get(i).getPokemonSPATTACK();
    }
    public int getPokemonSPDEF(int i){
        return pkmn.get(i).getPokemonSPDEF();
    }
    public int getPokemonSPEED(int i){
        return pkmn.get(i).getPokemonSPEED();
    }
    

    public String getPokemonMoveName(int i, int move){
        return pkmn.get(i).getMoveName(move);
    }

    public int getMovePower(int i, int move){
        return pkmn.get(i).getMovePower(move);
    }

    public boolean getIsSpecial(int i, int move){
        return pkmn.get(i).getIsSpecial(move);
    }

    public boolean getisWildPokemon(){
        return this.isWildPkmn;
    }

    public String getTrainerName(){
        return this.strTrainerName;
    }

    public void setTrainerName(String x){
        this.strTrainerName = x;
    }

    public int getTrainerBadges(){
        return this.intTrainerBadges;
    }

    public void setTrainerBadges(int x){
        this.intTrainerBadges = x;
    }

    public int getPokemonAmount(){
        return pkmn.size();
    }

    public void createWildPokemon(){
        // Random object
        Random rand = new Random();
            this.pokemonCount = 1;
            this.itemCount = 0;
            this.strTrainerName = "Wild Pokemon";

            int randLevel = rand.nextInt(100 - 50 + 1) + 50;
            double randExp = rand.nextDouble(50);
            //create random pokemon for this trainer
            // Create a random pokemon
           String strRandomName = "";
           int intRandomType = 0;

            int intRandomPokemon = rand.nextInt(15);
            if(intRandomPokemon == 0){
                strRandomName = "Wurmple";
                intRandomType = 0;
            }
            else if(intRandomPokemon == 1){
                strRandomName = "Garchomp";
                intRandomType = 1;
            }
            else if(intRandomPokemon == 2){
                strRandomName = "Pikachu";
                intRandomType = 2;
            }
            else if(intRandomPokemon == 3){
                strRandomName = "Machamp";
                intRandomType = 3;
            }
            else if(intRandomPokemon == 4){
                strRandomName = "Charizard";
                intRandomType = 4;
            }
            else if(intRandomPokemon == 5){
                strRandomName = "Pidgey";
                intRandomType = 5;
            }
            else if(intRandomPokemon == 6){
                strRandomName = "Gengar";
                intRandomType = 6;
            }
            else if(intRandomPokemon == 7){
                strRandomName = "Venasaur";
                intRandomType = 7;
            }
            else if(intRandomPokemon == 8){
                strRandomName = "Diglett";
                intRandomType = 8;
            }
            else if(intRandomPokemon == 9){
                strRandomName = "Empoleon";
                intRandomType = 9;
            }
            else if(intRandomPokemon == 10){
                strRandomName = "Bidoof";
                intRandomType = 10;
            }
            else if(intRandomPokemon == 11){
                strRandomName = "Ekans";
                intRandomType = 11;
            }
            else if(intRandomPokemon == 12){
                strRandomName = "Alakazam";
                intRandomType = 12;
            }
            else if(intRandomPokemon == 13){
                strRandomName = "Geodude";
                intRandomType = 13;
            }
            else if(intRandomPokemon == 14){
                strRandomName = "Blastoise";
                intRandomType = 14;
            }
            
            

           pkmn.add(new Pokemon(strRandomName, intRandomType, randLevel, randExp, randLevel * 5, randLevel * 5, randLevel * 2, randLevel * 2, randLevel * 2, randLevel * 2));
            
    }

    public void createTrainerPokemon(){
        // Random object
        Random rand = new Random();
        // Create a random amount of Pokemon that will be given 1-6
        this.pokemonCount = rand.nextInt(6 - 1 + 1) + 1;

        for(int i = 0; i < this.pokemonCount; i++){
           // Create a random pokemon
           String strRandomName = "";
           int intRandomType = 0;
           int randLevel = rand.nextInt(100 - 5 + 1) + 5;
            double randExp = rand.nextDouble(50);

            int intRandomPokemon = rand.nextInt(15);
            if(intRandomPokemon == 0){
                strRandomName = "Wurmple";
                intRandomType = 0;
            }
            else if(intRandomPokemon == 1){
                strRandomName = "Garchomp";
                intRandomType = 1;
            }
            else if(intRandomPokemon == 2){
                strRandomName = "Pikachu";
                intRandomType = 2;
            }
            else if(intRandomPokemon == 3){
                strRandomName = "Machamp";
                intRandomType = 3;
            }
            else if(intRandomPokemon == 4){
                strRandomName = "Charizard";
                intRandomType = 4;
            }
            else if(intRandomPokemon == 5){
                strRandomName = "Pidgey";
                intRandomType = 5;
            }
            else if(intRandomPokemon == 6){
                strRandomName = "Gengar";
                intRandomType = 6;
            }
            else if(intRandomPokemon == 7){
                strRandomName = "Venasaur";
                intRandomType = 7;
            }
            else if(intRandomPokemon == 8){
                strRandomName = "Diglett";
                intRandomType = 8;
            }
            else if(intRandomPokemon == 9){
                strRandomName = "Empoleon";
                intRandomType = 9;
            }
            else if(intRandomPokemon == 10){
                strRandomName = "Bidoof";
                intRandomType = 10;
            }
            else if(intRandomPokemon == 11){
                strRandomName = "Ekans";
                intRandomType = 11;
            }
            else if(intRandomPokemon == 12){
                strRandomName = "Alakazam";
                intRandomType = 12;
            }
            else if(intRandomPokemon == 13){
                strRandomName = "Geodude";
                intRandomType = 13;
            }
            else if(intRandomPokemon == 14){
                strRandomName = "Blastoise";
                intRandomType = 14;
            }
            
            

           pkmn.add(new Pokemon(strRandomName, intRandomType, randLevel, randExp, randLevel * 5, randLevel * 5, randLevel * 2, randLevel * 2, randLevel * 2, randLevel * 2));
        }
    }

    public void createTrainerItems(){
        // Random object
        Random rand = new Random();
        // Create a random amount of items that will be made 0-10
        this.itemCount = rand.nextInt(11);


        for(int i = 0; i < this.itemCount; i++){
            // decide what kind of item it will be
            // 0 = pokeball, 1 = potion, 2 = rock
            int randNum = rand.nextInt(3);
            if(randNum == 0){
                // determine which type of pokeball to give
                // 0-5 = pokeball, 6-8 = great ball, 8-9 = ultra ball, 10 = master ball
                int randNum2 = rand.nextInt(11);
                if(randNum2 >= 0 && randNum2 < 6){
                    pokeballs.add(new Pokeball("Pokeball", 1, 0));
                }
                else if(randNum2 >= 6 && randNum2 < 9){
                    pokeballs.add(new Pokeball("Great Ball", 1, 1));
                }
                else if(randNum2 >= 8 && randNum2 < 10){
                    pokeballs.add(new Pokeball("Great Ball", 1, 2));
                }
                else if(randNum2 == 10){
                    pokeballs.add(new Pokeball("Great Ball", 1, 3));
                }
            }
            else if(randNum == 1){
                // determine which potion to give
                // 0-5 = potion, 6-8 = super potion, 8-9 Hyper Potion, 10 = full restore
                int randNum2 = rand.nextInt(11);
                if(randNum2 >= 0 && randNum2 < 6){
                    potions.add(new Potion("Potion", 1, 0));
                }
                else if(randNum2 >= 6 && randNum2 < 9){
                    potions.add(new Potion("Super Potion", 1, 1));
                }
                else if(randNum2 >= 8 && randNum2 < 10){
                    potions.add(new Potion("Hyper Potion", 1, 2));
                }
                else if(randNum2 == 10){
                    potions.add(new Potion("Full Restore", 1, 3));
                }
            }
            else if(randNum == 2){
                items.add(new Items("rock", 1));
            }

        }
    }


}