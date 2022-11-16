public class Pokeball extends Items{
    private int intPokeballType;
    private double dblCatchRate;

    public Pokeball(String name, int amount, int type){
        super(name, amount);
        this.intPokeballType = type;
    }
}
