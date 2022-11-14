public class Main{
   
    public static void main(String[] args) throws Exception {
        PokemonBattle BattleOne = new PokemonBattle();
        System.out.println("Background = " + BattleOne.getBackground() + "// Wild Pokemon = " + BattleOne.getIsWildPokemon() + "// Gym Battle = " + BattleOne.getIsGymBattle() + "// with " + BattleOne.getPkmnTrainerNum() + " trainers.");
}
}
