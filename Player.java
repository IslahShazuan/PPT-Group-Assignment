public class Player
{
	//Variables
	private String playerName;
	private int playerLevel, playerCurrentHealth, playerMaxHealth, playerMana, playerAttack, playerDefence;
	
	//Constructor
	public Player()
	{
		playerLevel = 0;
	    playerCurrentHealth = 10;
	    playerMaxHealth = 10;
	    playerMana = 10;
	    playerAttack = 3;
	    playerDefence = 3;
	}
	
	//Setter for player name
	public void setPlayerName(String name)
	{
		playerName = name;
	}
	
	//Getter for player name
	public String getPlayerName()
	{
		return playerName;
	}
	
	//Setter for player level
	public void setPlayerLevel(int pl)
	{
		playerLevel = pl;
	}
	
	//Getter for player level
	public int getPlayerLevel()
	{
		return playerLevel;
	}
        
	//Setter for player current health
	public void setPlayerCurrentHealth(int php)
	{
		playerCurrentHealth = php;
	}
	
	//Getter for player current health
	public int getPlayerCurrentHealth()
	{
		return playerCurrentHealth;
	}
	
	//Setter for player max health
	public void setPlayerMaxHealth(int php)
	{
		playerMaxHealth += php;
	}
	
	//Getter for player max health
	public int getPlayerMaxHealth()
	{
		return playerMaxHealth;
	}
    
	//Setter for player current mana
	public void setPlayerMana(int pmp)
	{
		playerMana = pmp;
	}
	
	//Getter for player current mana
	public int getPlayerMana()
	{
		return playerMana;
	}
	
	//Setter for player attack
	public void setPlayerAttack(int patt)
	{
		playerAttack += patt;
	}
	
	//Getter for player attack
	public int getPlayerAttack()
	{
		return playerAttack;
	}
	
	//Setter for player defence
	public void setPlayerDefence(int pdef)
	{
		playerDefence += pdef;
	}
	
	//Getter for player defence
	public int getPlayerDefence()
	{
		return playerDefence;
	}
}