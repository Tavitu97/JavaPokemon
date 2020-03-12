public class Main
{
    public static void main(String args[])

    {
        Pokemon Onix = new Pokemon(40,50,22.3);
        Pokemon Pikachu = new Pokemon(30,60,40.4);
        Pokemon Eevee = new Pokemon(25,30,33.5);
        Pokemon Snorlax = new Pokemon(50,30,18.5);
        Pokemon Charmander = new Pokemon(35,25,18.5);
        Pokemon Bulbasaur = new Pokemon (40,35,18.5);

        Pocket Ash = new Pocket();
        Pocket Brock = new Pocket();

        Ash.addPokemon(Onix);
        Ash.addPokemon(Pikachu);
        Ash.addPokemon(Bulbasaur);

        Brock.addPokemon(Eevee);
        Brock.addPokemon(Snorlax);
        Brock.addPokemon(Charmander);

        System.out.println("There are" + " " + Ash.getNumberOfPokemon()+ " " + "pokemons in this pocket ");
        System.out.println("The combined health is" + " " + Ash.getCombinedHealth());
        System.out.println("The combined power is" + " " + Ash.getCombinedPower());
        System.out.println("The combined type is" + " " + Ash.getCombinedType());

        System.out.println("There are"+" "+Brock.getNumberOfPokemon()+ " " + "pokemons in this pocket");
        System.out.println("The combined health is" + " "+ Brock.getCombinedHealth());
        System.out.println("The combined power is" + " " + Brock.getCombinedPower());
        System.out.println("The combined type is" + " " + Brock.getCombinedType());

    }

}
