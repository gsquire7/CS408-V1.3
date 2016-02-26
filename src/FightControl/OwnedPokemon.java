package FightControl;

import java.io.IOException;
import java.util.ArrayList;

public class OwnedPokemon {

	public ArrayList<PokemonState> pokemon(ArrayList<MoveEffects> database) throws IOException
	{
		ArrayList<PokemonState> party = new ArrayList<PokemonState>();
		FightMoves FM = new FightMoves();
		FM.populateMoves(database);

		//id, pokemon, name, level, type, xp, xpMax, hp, hpMax,
		//attack, defence, speed, specialAttack, specialDefence
		//move1, move2, move3, move4
		//move1PPmax, move2ppmax, move3ppmax, move4ppmax
		//move1pp, move2pp, move3pp, move4pp
		//poisoned, frozen, paralysed, confused, burned, sleeping
		//front image, back image
		String move1 = "ABSORB";
		String move2 = "ACID";
		String move3 = "ACID ARMOUR";
		String move4 = "AEROBLAST";
		String move5 = "AURORA BEAM";
		String move6 = "ANCIENT POWER";
		party.add(new PokemonState(01234, "BLASTOISE", "BLASTOISE", 30, "Psychic", 4555, 7000, 200, 200, 
				50, 60, 45, 55, 55,
				move1, move2, move5, move6,
				FM.getMovePP(move1),FM.getMovePP(move2), FM.getMovePP(move5), FM.getMovePP(move6),
				1, 1, 1, 1,
				false, false, false, false, false, false,
				 "Front Pics/009.png", "Back Pics/009.png"));
//		party.add(new PokemonState(01235, "PIDGEY", "PIDGEY", 20, "Flying", 45655, 50000, 100, 150, 
//				50, 60, 45, 55, 55,
//				move1, move2, move3, move4,
//				FM.getMovePP(move1),FM.getMovePP(move2), FM.getMovePP(move3), FM.getMovePP(move4),
//				10, 10, 10, 5,
//				false, false, false, false, false, false,
//				"Front Pics/016.png", "Back Pics/016.png"));
//		party.add(new PokemonState(01236, "ESPEON", "ESPEON", 22, "Flying", 49999, 50000, 100, 109, 
//				50, 60, 45, 55, 55,
//				move1, move2, move3, move4,
//				FM.getMovePP(move1),FM.getMovePP(move2), FM.getMovePP(move3), FM.getMovePP(move4),
//				10, 10, 10, 5,
//				false, false, false, false, false, false,
//				"Front Pics/189.png", "Back Pics/189.png"));
		party.add(new PokemonState(01237, "ARTICUNO", "ARTICUNO", 47, "Flying", 45655, 500000, 189, 189, 
				50, 60, 45, 55, 55,
				move1, move2, move3, move4,
				FM.getMovePP(move1),FM.getMovePP(move2), FM.getMovePP(move3), FM.getMovePP(move4),
				10, 10, 10, 5,
				false, false, false, false, false, false,
				"Front Pics/144.png", "Back Pics/144.png"));
		party.add(new PokemonState(0123, "MEW", "MEW", 12, "Flying", 4565, 50000, 48, 76, 
				50, 60, 45, 55, 55,
				move1, move2, move3, move4,
				FM.getMovePP(move1),FM.getMovePP(move2), FM.getMovePP(move3), FM.getMovePP(move4),
				10, 10, 10, 5,
				false, false, false, false, false, false,
				"Front Pics/151.png", "Back Pics/151.png"));
		return party;
		
	}
}