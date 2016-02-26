package FightControl;

import java.io.IOException;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) throws IOException {
		OwnedPokemon OP = new OwnedPokemon();
		MapPrototype MP = new MapPrototype();
		FightController FC = new FightController();
		FightMoveDatabase dbBuilder = new FightMoveDatabase();
		
		ArrayList<MoveEffects> database = null;
		ArrayList<PokemonState> currentPokemon = new ArrayList<PokemonState>();
		ArrayList<PokemonState> enemyPokemon = new ArrayList<PokemonState>();
		
		database = dbBuilder.fillmoves();
		currentPokemon = OP.pokemon(database);
		enemyPokemon = MP.pokemon(database);
		currentPokemon = FC.runBattle(currentPokemon, enemyPokemon, database);
	}	

}