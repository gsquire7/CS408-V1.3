package FightControl;
import java.io.IOException;
import java.util.ArrayList;

public class FightMoves {

	RandomGen random = new RandomGen();
//		moves.add(new MoveEffects("STRUGGLE", "N/A", 50, 100, 1, -0.5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0));
	ArrayList<MoveEffects> DB = null;

	
	public void populateMoves(ArrayList<MoveEffects> database) throws IOException
	{
		DB = database;
	}
	public int getStrength(String move)
	{
		int positionStrength  = getIndex(move);
		int strength = DB.get(positionStrength).getStrength();
		return strength;
	}

	public int getAccuracy(String move)
	{
		int positionAccuracy = getIndex(move);
		int accuracy = DB.get(positionAccuracy).getAccuracy();
		return accuracy;
	}

	public int getIndex(String moveName)
	{
		boolean found = false;
		int index = 0;
		while(found == false)
		{
			for(MoveEffects a: DB)
			{
				String b = a.getName();
				if(b.equals(moveName))
				{
					int odds = a.getExceptionsOdds();
					if(odds > 0)
					{
						if(random.GenerateNumber(100) > odds)
						{
							return index;
						}
						else
						{
							index++;
							return index;
						}
					}
					return index;
				}
				else
				{
					index++;
				}
			}
		}
		return 0;	
	}
	
	public double getHealthRegeneration(String move)
	{
		int healthRegeneration = getIndex(move);
		double regeneration = DB.get(healthRegeneration).getHealthRegeneration();
		return regeneration;
	}
	public int getMovePP(String move)
	{
		int moveLimit = getIndex(move);
		int pp = DB.get(moveLimit).getPP();
		return pp;
	}
}