public class EndCondition
{
	
	//Constructor
	public EndCondition()
	{
		
	}
	
	//Method to check if the game has ended.
	public int checkEnd(int php, int ehp)
	{
		//Checks if either player or enemy has reached 0 health
		if(php <=0 || ehp <= 0)
		{
			//If player is still alive while enemy died.
			if (php > 0 && ehp <= 0)
			{
				JOptionPane.showMessageDialog(null, "You Win!");
			}
			//If enemy is still alive while player died.
			else if (php <= 0 && ehp > 0)
			{
				JOptionPane.showMessageDialog(null, "You Lose!");
			}
			//If both player and enemy died.
			else if (php <= 0 && ehp <= 0)
			{
				JOptionPane.showMessageDialog(null, "You Draw!");
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
}