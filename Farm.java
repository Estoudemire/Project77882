
import java.util.ArrayList;
import java.util.Scanner;


public class Farm extends Location{
    public ArrayList<Pokemon> farmPokemon;
    public boolean here = false; 
    
    public Farm(String name) {
        super(name, 0, 0); 
        this.farmPokemon = new ArrayList<>();
       }

    public void addPokemon(Pokemon pokemon) {
        farmPokemon.add(pokemon);
        System.out.println(pokemon.getName() + " has been added to the farm.");
    }

    public void seePokemon(){
        for (int i = 0; i < farmPokemon.size(); i++ ){
            System.out.print("There is a "); 
            System.out.println(farmPokemon.get(i).getName()); 
        }
    }

    public void setHere(boolean here){
        this.here = here; 
    }

    public boolean here(){
        return this.here(); 
    }
    public void leave(){
        this.here = false; 
    }

    //inventory of pokemon
    //ability to interact with pokemon


 
}