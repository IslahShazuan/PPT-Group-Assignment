import javax.swing.JOptionPane;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        
        int rand_option1 = rand.nextInt(2);
        int rand_option2 = rand.nextInt(2);
        int rand_option3 = rand.nextInt(3);
        
        int playerHealth = 10;
        String playerName;
        int playerAttack = 2;
        int playerDefence = 1;
        int playerChoice;
        int playeroption = rand_option1;
        
        int enemyHealth = 5;
        String enemyName = null;
        int enemyAttack = 2;
        int enemyDefence = 1;
        int enemyChoice;
        int enemyoption = rand_option2;
        
        switch (rand_option3) {
            case 0 -> 
            {
                enemyName = "A";
            }
            case 1 ->
            {
                enemyName = "O";
            }
            case 2 -> 
            {
                enemyName = "X";
            }
        }
        
        int loop1 = 1;
        
        JOptionPane.showMessageDialog(null,"Welcome to the game");
        playerName = JOptionPane.showInputDialog("What is your name?");    
        JOptionPane.showMessageDialog(null,"A slime blocks your path. What do you do?\n" + playerName + " HP : " + playerHealth + " Attack : " + playerAttack + " Defence : " + playerDefence + "\n" + enemyName + " HP : " + enemyHealth + " Attack : " + enemyAttack + " Defence : " + enemyDefence);

        
        while (loop1 == 1)
        {
            JOptionPane.showMessageDialog(null,"A slime blocks your path. What do you do?\n" + playerName + " HP : " + playerHealth + " Attack : " + playerAttack + " Defence : " + playerDefence + "\n" + enemyName + " HP : " + enemyHealth + " Attack : " + enemyAttack + " Defence : " + enemyDefence);
            
            if (playeroption == 1)
            {
                if (enemyoption == 1)
                {
                    playerChoice = enemyAttack - playerDefence;
                    enemyChoice = playerAttack - enemyDefence;
                    
                    if (enemyChoice > 0)
                    {
                        playerHealth = playerHealth - enemyChoice;
                    }
                    
                    if (playerChoice > 0)
                    {
                        enemyHealth = enemyHealth - playerChoice;
                    }
                }
                else if (enemyoption == 2)
                {
                    playerChoice = enemyAttack - playerDefence;
                    enemyChoice = playerAttack - (enemyDefence * 2);
                    
                    if (enemyChoice > 0)
                    {
                        playerHealth = playerHealth - enemyChoice;
                    }
                    
                    if (playerChoice > 0)
                    {
                        enemyHealth = enemyHealth - playerChoice;
                    }
                }
            }
            else if (playeroption == 2)
            {
                if (enemyoption == 1)
                {
                    playerChoice = enemyAttack - (playerDefence * 2);
                    enemyChoice = playerAttack - enemyDefence;
                    
                    if (enemyChoice > 0)
                    {
                        playerHealth = playerHealth - enemyChoice;
                    }
                    
                    if (playerChoice > 0)
                    {
                        enemyHealth = enemyHealth - playerChoice;
                    }
                }
                else if (enemyoption == 2)
                {
                    playerChoice = enemyAttack - (playerDefence * 2);
                    enemyChoice = playerAttack - (enemyDefence * 2);
                    
                    if (enemyChoice > 0)
                    {
                        playerHealth = playerHealth - enemyChoice;
                    }
                    
                    if (playerChoice > 0)
                    {
                        enemyHealth = enemyHealth - playerChoice;
                    }
                }
            }
            
            if (playerHealth <= 0 || enemyHealth <= 0)
            {
                loop1 = 0;
            }
            
            rand_option1 = rand.nextInt(3);
            rand_option2 = rand.nextInt(3);
            playeroption = rand_option1;
            enemyoption = rand_option2;
        }
        
        if (playerHealth > 0 && enemyHealth <= 0)
        {
            JOptionPane.showMessageDialog(null,"You Win");
        }
        else if (playerHealth <= 0 && enemyHealth > 0)
        {
            JOptionPane.showMessageDialog(null,"You Lose");
        }
        else if (playerHealth <= 0 && enemyHealth <= 0)
        {
            JOptionPane.showMessageDialog(null,"You Draw");
        }       
    }
}