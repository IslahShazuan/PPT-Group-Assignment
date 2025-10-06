import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener
{
	//Variables
	private String sent1 = "Welcome to the game.";
	private String sent2, sent3;
	private String sent4 = "v0.3 Code Complete";
	private int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
	private int end1 = 0, pchoice;
	
	//Initialise GUI components
	JFrame mainFrame = new JFrame("Welcome to the game!");
	JLabel label1 = new JLabel("<html><font color = black>" + sent1 + "</font><html>");
	JLabel label2 = new JLabel("<html><font color = black> Name : " + sent2 +  "</font><html>");
	JLabel label3 = new JLabel("<html><font color = black> Level : " + num1 + "</font><html>");
	JLabel label4 = new JLabel("<html><font color = black> Health : " + num2 + " / " + num3 + "</font><html>");
	JLabel label5 = new JLabel("<html><font color = black> Mana : " + num4 + "</font><html>");
	JLabel label6 = new JLabel("<html><font color = black> Attack : " + num5 + "</font><html>");
	JLabel label7 = new JLabel("<html><font color = black> Defence : " + num6 + "</font><html>");
	JLabel label8 = new JLabel("<html><font color = black> Name : " + sent3 + "</font><html>");
	JLabel label9 = new JLabel("<html><font color = black> Health : " + num7 + " / " + num8 + "</font><html>");
	JLabel label10 = new JLabel("<html><font color = black> Attack : " + num9 + "</font><html>");
	JLabel label11 = new JLabel("<html><font color = black> Defence : " + num10 + "</font><html>");
	JLabel label12 = new JLabel("<html><font color = black>" + sent4 + "</font><html>");
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenuItem exitItem = new JMenuItem("Exit");
	JPanel panel1 = new JPanel();
	JButton button1 = new JButton("Start Game");
	JButton button2 = new JButton("New Game?");
	//JButton button3 = new JButton("Click Me");
	JButton button4 = new JButton("Attack");
	JButton button5 = new JButton("Defend");
	JButton button6 = new JButton("Heal");
	JButton button7 = new JButton("Special Attack");
	JButton button8 = new JButton("Level Up");
	//JButton button9 = new JButton("Level Up");
	JPanel textPanel1 = new JPanel();
	JPanel textPanel2 = new JPanel();
	JPanel textPanel3 = new JPanel();
	JPanel textPanel4 = new JPanel();
	GroupLayout layoutTop1 = new javax.swing.GroupLayout(textPanel1);
	GroupLayout layoutLeft1 = new javax.swing.GroupLayout(textPanel2);
	GroupLayout layoutBottom1 = new javax.swing.GroupLayout(textPanel4);
	GroupLayout layoutRight1 = new javax.swing.GroupLayout(textPanel3);
	GroupLayout layoutCenter1 = new javax.swing.GroupLayout(panel1);
	GroupLayout layoutMain1 = new javax.swing.GroupLayout(mainFrame.getContentPane());
	
	//Initialise objects
	Player p1 = new Player();
	Enemy e1 = new Enemy();
	Combat c1 = new Combat();
	
	//Constructor
	public Menu()
	{
		//Initialise the window.
		//Menu window
		fileMenu.add(exitItem);
		menuBar.add(fileMenu);
		//Set panels and colour
		textPanel1.setOpaque(true);
		textPanel1.setBackground(Color.WHITE); 
		textPanel2.setOpaque(true);
		textPanel2.setBackground(Color.BLUE);
		textPanel3.setOpaque(true);
		textPanel3.setBackground(Color.RED);
		textPanel4.setOpaque(true);
		textPanel4.setBackground(Color.LIGHT_GRAY);
		//Set main frame
		mainFrame.setJMenuBar(menuBar);
		mainFrame.getContentPane().setBackground(Color.gray);
		mainFrame.setSize(1000, 800);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		//Set layout for top portion
		textPanel1.setLayout(layoutTop1);
		layoutTop1.setHorizontalGroup
		(
			layoutTop1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layoutTop1.createSequentialGroup()
				.addGap(134, 134, 134)
				.addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(121, Short.MAX_VALUE))
		);
		layoutTop1.setVerticalGroup
		(
			layoutTop1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layoutTop1.createSequentialGroup()
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(label1)
				.addContainerGap())
		);
		//Set layout for left portion
		textPanel2.setLayout(layoutLeft1);
		layoutLeft1.setHorizontalGroup
		(
			layoutLeft1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layoutLeft1.createSequentialGroup()
				.addContainerGap()
				.addGroup(layoutLeft1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(label2)
					.addComponent(label3)
					.addComponent(button4)
					.addComponent(button5)
					.addComponent(button6)
					.addComponent(button7)
					.addComponent(button8)
					.addComponent(label4)
					.addComponent(label5)
					.addComponent(label6)
					.addComponent(label7))
				.addContainerGap(46, Short.MAX_VALUE))
		);
		layoutLeft1.setVerticalGroup
		(
			layoutLeft1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layoutLeft1.createSequentialGroup()
				.addContainerGap()
				.addComponent(label2)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(label3)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(label4)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(label5)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(label6)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(label7)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
				.addComponent(button4)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(button5)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(button6)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(button7)
				.addGap(15, 15, 15)
				.addComponent(button8)
				.addContainerGap())
		);
		//Set layout for bottom portion
		textPanel4.setLayout(layoutBottom1);
		layoutBottom1.setHorizontalGroup
		(
			layoutBottom1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutBottom1.createSequentialGroup()
				.addGap(327, 327, 327)
				.addComponent(label12)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		layoutBottom1.setVerticalGroup
		(
			layoutBottom1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutBottom1.createSequentialGroup()
				.addContainerGap()
				.addComponent(label12)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		//Set layout for right portion
		textPanel3.setLayout(layoutRight1);
		layoutRight1.setHorizontalGroup
		(
			layoutRight1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layoutRight1.createSequentialGroup()
				.addContainerGap()
				.addGroup(layoutRight1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(label8)
					.addComponent(label9)
					.addComponent(label10)
					.addComponent(label11))
				.addContainerGap(67, Short.MAX_VALUE))
		);
		layoutRight1.setVerticalGroup
		(
			layoutRight1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layoutRight1.createSequentialGroup()
				.addContainerGap()
				.addComponent(label8)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(label9)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(label10)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(label11)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		//Set layout for center portion
		panel1.setLayout(layoutCenter1);
		layoutCenter1.setHorizontalGroup
		(
			layoutCenter1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layoutCenter1.createSequentialGroup()
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(button1)
				.addGap(176, 176, 176))
		);
		layoutCenter1.setVerticalGroup
		(
			layoutCenter1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layoutCenter1.createSequentialGroup()
				.addGap(154, 154, 154)
				.addComponent(button1)
				.addContainerGap(158, Short.MAX_VALUE))
		);
		
		mainFrame.getContentPane().setLayout(layoutMain1);
		layoutMain1.setHorizontalGroup
		(
			layoutMain1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layoutMain1.createSequentialGroup()
				.addContainerGap()
				.addGroup(layoutMain1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(textPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(layoutMain1.createSequentialGroup()
						.addComponent(textPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(textPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addComponent(textPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addContainerGap())
		);
		layoutMain1.setVerticalGroup
		(
			layoutMain1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layoutMain1.createSequentialGroup()
				.addContainerGap()
				.addComponent(textPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layoutMain1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(textPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(textPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(textPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addContainerGap())
		);
		//Initilise buttons
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				p1.setPlayerName(JOptionPane.showInputDialog("Enter input : "));
				sent2 = p1.getPlayerName();
				label2.setText("<html><font color = black> Name : " + sent2 +  "</font><html>");
			}
		});
		
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				e1.enemyReset();
				p1.setPlayerMana(10);
				setValues();
				layoutCenter1.replace(button2, button1);
			}
		});
		
		button4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				pchoice = 1;
				combatloop();
			}
		});

		button5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				pchoice = 2;
				combatloop();
			}
		});

		button6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(p1.getPlayerMana() > 0)
				{
					pchoice = 3;
					combatloop();
				}
			}
		});
		
		button7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(p1.getPlayerMana() > 0)
				{
					pchoice = 4;
					combatloop();
				}
			}
		});
		
		button8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				pchoice = 4;
				combatloop();
			}
		});
		
		exitItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
				combatloop();
			}
		});
	}
	//Main menu method
	public void mainMenu()
	{
        setValues();
	}
	//Method to initialise the text areas
	public void setValues()
	{
		num1 = p1.getPlayerLevel();
		num2 = p1.getPlayerCurrentHealth();
		num3 = p1.getPlayerMaxHealth();
		num4 = p1.getPlayerMana();
		num5 = p1.getPlayerAttack();
		num6 = p1.getPlayerDefence();
		sent3 = e1.getEnemyName();
		num7 = e1.getEnemyCurrentHealth();
		num8 = e1.getEnemyMaxHealth();
		num9 = e1.getEnemyAttack();
		num10 = e1.getEnemyDefence();
		
		label3.setText("<html><font color = black> Level : " + num1 + "</font><html>");
		label4.setText("<html><font color = black> Health : " + num2 + " / " + num3 + "</font><html>");
		label5.setText("<html><font color = black> Mana : " + num4 + "</font><html>");
		label6.setText("<html><font color = black> Attack : " + num5 + "</font><html>");
		label7.setText("<html><font color = black> Defence : " + num6 + "</font><html>");
		label7.setText("<html><font color = black> Defence : " + num6 + "</font><html>");
		label8.setText("<html><font color = black> Name : " + sent3 + "</font><html>");
		label9.setText("<html><font color = black> Health : " + num7 + " / " + num8 + "</font><html>");
		label10.setText("<html><font color = black> Attack : " + num9 + "</font><html>");
		label11.setText("<html><font color = black> Defence : " + num10 + "</font><html>");
	}
	//Method to change health fields
	public void changeHealth()
	{
		num2 = p1.getPlayerCurrentHealth();
		num7 = e1.getEnemyCurrentHealth();
		
		label4.setText("<html><font color = black> Health : " + num2 + " / " + num3 + "</font><html>");
		label9.setText("<html><font color = black> Health : " + num7 + " / " + num8 + "</font><html>");
	}
	//Method to change mana fields
	public void changeMana()
	{
		if(pchoice == 3 || pchoice == 4)
		{
			p1.setPlayerMana(-2);
		}
		
		num4 = p1.getPlayerMana();
		
		label5.setText("<html><font color = black> Mana : " + num4 + "</font><html>");
	}
	//Method for combat gameplay
	public void combatloop()
	{
		num7 = c1.combatPhasePlayer(p1.getPlayerAttack(), pchoice, e1.getEnemyCurrentHealth(), e1.getEnemyDefence(), e1.getEnemyChoice());
		e1.setEnemyCurrentHealth(num7);
		num2 = c1.combatPhaseEnemy(p1.getPlayerCurrentHealth(), p1.getPlayerDefence(), pchoice, e1.getEnemyAttack(), e1.getEnemyChoice());
		p1.setPlayerCurrentHealth(num2);
		changeHealth();
		changeMana();
		endCheck();
	}
	//Method to check if game can end
	public void endCheck()
	{
		EndCondition ec1 = new EndCondition();
		
		end1 = ec1.checkEnd(p1.getPlayerCurrentHealth(), e1.getEnemyCurrentHealth());
		
		if(end1 == 1)
		{
			layoutCenter1.replace(button1, button2);
			sent1 = "Congratulations!";
			label1.setText("<html><font color = black>" + sent1 + "</font><html>");
		}
	}
	//Override for actionperformed method
	@Override
	public void actionPerformed(ActionEvent e)
	{
	}
}