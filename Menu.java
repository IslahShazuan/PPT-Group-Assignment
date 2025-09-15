import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu
{
	//Variables
	private String sent1 = "Welcome to the game.";
	JFrame mainFrame = new JFrame("Welcome to the game!");
	JLabel label1 = new JLabel("<html>" + sent1 + "</html>");
	
	//Constructor
	public Menu()
	{
		//Initialise the window.
		mainFrame.add(textPanel1);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainFrame.setVisible(true);
	}
	
	public void mainMenu()
	{
		
	}
}