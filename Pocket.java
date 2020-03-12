import java.util.ArrayList;
public class Pocket
{
    protected ArrayList<Pokemon> pocketPokemon;


    public Pocket()
    {
        pocketPokemon = new ArrayList<Pokemon>();
    }

    public void addPokemon(Pokemon pokemon)
    {
        pocketPokemon.add(pokemon);
    }


    public int getNumberOfPokemon()
    {
        return pocketPokemon.size();
    }


    public int getCombinedHealth()
    {
        int combinedHealth = 0;
        for (Pokemon pokemon : pocketPokemon) {
            combinedHealth = combinedHealth + pokemon.getHealth();
        }
        return combinedHealth;
    }


    public int getCombinedPower()
    {
        int combinedPower = 0;
        for (Pokemon pokemon : pocketPokemon) {
            combinedPower = combinedPower + pokemon.getPower();
        }
        return combinedPower;
    }


    public double getCombinedType()
    {
        double combinedType = 0;
        for (Pokemon pokemon : pocketPokemon)
        {
            combinedType = combinedType + pokemon.getHealth();
        }
        return combinedType;
    }


}

