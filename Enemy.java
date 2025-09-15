import java.util.Random;

public class Enemy
{
	//Initialise rand class
	Random rand = new Random();
	
	//Variables
	private int rand_num1 = rand.nextInt(3);
	private String enemyName;	
	private int enemyCurrentHealth, enemyMaxHealth, enemyAttack, enemyDefence, enemyChoice;
	
	//Constructor
	public Enemy()
	{
		//Initialise the enemy by using the random class to randomise the enemy
 		switch(rand_num1)
		{
			case 0 ->
			{
				enemyName = "A";
				enemyMaxHealth = 10;
				enemyAttack= 2;
				enemyDefence= 2;
			}
			case 1 ->
			{
				enemyName = "O";
				enemyMaxHealth = 12;
				enemyAttack= 1;
				enemyDefence= 3;
			}
			case 2 ->
			{
				enemyName = "X";
				enemyMaxHealth = 8;
				enemyAttack= 3;
				enemyDefence= 1;
			}
		}
	}
	
	//Getter for enemy name
	public String getEnemyName()
	{
		return enemyName;
	}
	
	//Setter for enemy current health
	public void setEnemyCurrentHealth(int ehp)
	{
		enemyCurrentHealth = ehp;
	}
	
	//Getter for enemy current health
	public int getCurrentEnemyHealth()
	{
		return enemyCurrentHealth;
	}
	
	//Getter for enemy max health
	public int getMaxEnemyHealth()
	{
		return enemyMaxHealth;
	}
	
	//Getter for enemy attack
	public int getEnemyAttack()
	{
		return enemyAttack;
	}
	
	//Getter for enemy defence
	public int getEnemyDefence()
	{
		return enemyDefence;
	}

	//Setter for enemy choice
	public void setEnemyChoice()
	{
		//Variable for enemy action. The probability is set to out of 100.
		private int rand_num2 = rand.nextInt(100);
		
		//Decides what action the enemy takes.
		switch(rand_num1)
		{
			case 0 ->
			{
				if(rand_num2 >= 0 && rand_num2 <= 49)
				{
					enemyChoice = 1;
				}
				else if(rand_num2 => 50 && rand_num2 <= 99)
				{
					enemyChoice = 2;
				}
			}
			case 1 ->
			{
				if(rand_num2 >= 0 && rand_num2 <= 69)
				{
					enemyChoice = 1;
				}
				else if(rand_num2 >= 70 && rand_num2 <= 99)
				{
					enemyChoice = 2;
				}
			}
			case 2 ->
			{
				if(rand_num2 >= 0 && rand_num2 <= 29)
				{
					enemyChoice = 1;
				}
				else if(rand_num2 >= 30 && rand_num2 <= 99)
				{
					enemyChoice = 2;
				}
			}
		}
	}
	
	//Getter for enemy choice
	public int getEnemyChoice()
	{
		return enemyChoice;
	}
}