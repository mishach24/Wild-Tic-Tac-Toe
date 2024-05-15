//Name:Mahrosh Chaudhry
//Date: October 21 2021
//Purpose: Wild Tic Tac Toe
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;
import java.applet.*;
import java.util.*;
import java.text.*;
public class ChaudhryMahroshWildTicTacToe extends Applet implements ActionListener
{
    Panel p_card; //to hold all of the screens
    Panel card1, card2, card3, card4; //the screens
    CardLayout cdLayout = new CardLayout ();

    //game photos
    JLabel pic;
    //Game board buttons
    JButton a, b, c, d, ee, f, g, h, i;
    //board
    int board[] [] = new int [3] [3];
    //Turn for current player
    int turn = 1;
    //for photos on game baord
    int icon = 1;
    //player current
    JLabel current;
    //sound file
    AudioClip soundFile;
    //Date
    Date now = new Date ();
    DateFormat df = DateFormat.getDateInstance ();
    String s = df.format (now);

    public void init ()
    {
	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	opening ();
	instructions ();
	gameScreen ();
	end ();
	resize (350, 590);
	setLayout (new BorderLayout ());
	add ("Center", p_card);
	//mario music
	soundFile = getAudioClip (getDocumentBase (), "sound.snd");
	soundFile.loop ();
	//Welcome formalities before game
	String input = JOptionPane.showInputDialog ("Who is the character in mario named after a fruit?");
	JOptionPane.showMessageDialog (null, s, "Date", JOptionPane.ERROR_MESSAGE);
	String input1 = JOptionPane.showInputDialog ("Player 1 name:");
	String input2 = JOptionPane.showInputDialog ("Player 2 name:");
	JOptionPane.showMessageDialog (null, createImageIcon ("welcometogame.png"), "Welcome to the game " + input1 + " and " + input2, JOptionPane.INFORMATION_MESSAGE);
    }



    public void opening ()
    { //screen 1 is set up.
	card1 = new Panel ();
	card1.setBackground (new Color (254, 220, 236));
	JLabel title1 = new JLabel (createImageIcon ("p1.png"));
	title1.setForeground (Color.white);
	//logo for game.
	JLabel name = new JLabel (createImageIcon ("pinkpeach.jpg"));
	name.setPreferredSize (new Dimension (320, 453));
	//Button to mandatory insturctions screen
	JButton next = new JButton (createImageIcon ("startt.png"));
	next.setActionCommand ("2");
	next.addActionListener (this);
	next.setPreferredSize (new Dimension (160, 48));
	card1.add (title1);
	card1.add (name);
	card1.add (next);
	p_card.add ("1", card1);
    }


    public void instructions ()
    { //screen 2 - instructions- is set up.'
	//mandatory game screen.
	card2 = new Panel ();
	card2.setBackground (new Color (254, 220, 236));
	Panel p = new Panel ();
	//instruction screen. mandatory screen.
	JButton gameScreen = new JButton (createImageIcon ("openpinkins.png"));
	gameScreen.setActionCommand ("4");
	gameScreen.addActionListener (this);
	gameScreen.setPreferredSize (new Dimension (350, 590));
	p.add (gameScreen);
	card2.add (p);
	p_card.add ("2", card2);
    }


    public void gameScreen ()
    { //screen 4 - gameScreen - is set up.
	//game, reset, insturctions in dialog box.
	card3 = new Panel ();
	resize (350, 590);
	JLabel pic3 = new JLabel (createImageIcon ("peach.png"));
	card3.setBackground (new Color (254, 220, 236));
	Panel p3 = new Panel ();
	resize (470, 470);
	current = new JLabel ("1");
	current.setForeground (Color.black);
	//Tells which player is playing.
	JLabel prompt = new JLabel ("Current turn: Player");
	prompt.setForeground (Color.black);
	p3.add (prompt);
	p3.add (current);
	JLabel prompt2 = new JLabel ("Current icon");
	prompt2.setForeground (Color.black);
	pic = new JLabel (createImageIcon ("peach.png"));
	p3.add (prompt2);
	p3.add (pic);

	card3.add (p3);
	//game board.
	Panel p4 = new Panel (new GridLayout (3, 3));
	a = new JButton (createImageIcon ("crown.png"));
	a.addActionListener (this);
	a.setActionCommand ("a");
	a.setPreferredSize (new Dimension (100, 100));
	p4.add (a);

	b = new JButton (createImageIcon ("crown.png"));
	b.addActionListener (this);
	b.setActionCommand ("b");
	b.setPreferredSize (new Dimension (100, 100));
	p4.add (b);

	c = new JButton (createImageIcon ("crown.png"));
	c.addActionListener (this);
	c.setActionCommand ("c");
	c.setPreferredSize (new Dimension (100, 100));
	p4.add (c);

	d = new JButton (createImageIcon ("crown.png"));
	d.addActionListener (this);
	d.setActionCommand ("d");
	d.setPreferredSize (new Dimension (100, 100));
	p4.add (d);

	ee = new JButton (createImageIcon ("crown.png"));
	ee.addActionListener (this);
	ee.setActionCommand ("ee");
	ee.setPreferredSize (new Dimension (100, 100));
	p4.add (ee);

	f = new JButton (createImageIcon ("crown.png"));
	f.addActionListener (this);
	f.setActionCommand ("f");
	f.setPreferredSize (new Dimension (100, 100));
	p4.add (f);

	g = new JButton (createImageIcon ("crown.png"));
	g.addActionListener (this);
	g.setActionCommand ("g");
	g.setPreferredSize (new Dimension (100, 100));
	p4.add (g);

	h = new JButton (createImageIcon ("crown.png"));
	h.addActionListener (this);
	h.setActionCommand ("h");
	h.setPreferredSize (new Dimension (100, 100));
	p4.add (h);

	i = new JButton (createImageIcon ("crown.png"));
	i.addActionListener (this);
	i.setActionCommand ("i");
	i.setPreferredSize (new Dimension (100, 100));
	p4.add (i);
	card3.add (p4);
	//switch button, reset button, insturctions button and end game button.
	Panel p5 = new Panel ();
	JButton change = new JButton (createImageIcon ("switch.png"));
	change.addActionListener (this);
	change.setActionCommand ("change");
	change.setPreferredSize (new Dimension (48, 48));
	p5.add (change);
	JButton reset = new JButton (createImageIcon ("reset.png"));
	reset.addActionListener (this);
	reset.setActionCommand ("reset1");
	reset.setPreferredSize (new Dimension (48, 48));
	p5.add (reset);
	JButton run = new JButton (createImageIcon ("instructions.png"));
	run.addActionListener (this);
	run.setActionCommand ("instruct");
	run.setPreferredSize (new Dimension (48, 48));
	p5.add (run);
	card3.add (p5);
	Panel f = new Panel ();
	JButton end = new JButton ("End Game");
	end.addActionListener (this);
	end.setActionCommand ("end");
	end.setBackground (Color.pink);
	end.setForeground (Color.white);
	end.setPreferredSize (new Dimension (300, 48));
	f.add (end);
	card3.add (p5);
	card3.add (f);
	p_card.add ("3", card3);

    }


    public void end ()
    { //screen 4 - ending screen.
	card4 = new Panel ();
	card4.setBackground (new Color (254, 220, 236));
	Panel p = new Panel ();
	JLabel endtitle = new JLabel ("Thank You For Playing");
	endtitle.setFont (new Font ("Creepster", Font.BOLD, 15));
	Panel x = new Panel ();
	JLabel pic4 = new JLabel (createImageIcon ("peachumb.png"));
	Panel p6 = new Panel ();
	JButton back = new JButton ("Back To Home");
	back.addActionListener (this);
	back.setActionCommand ("back");
	back.setBackground (Color.pink);
	back.setForeground (Color.white);
	p6.add (back);
	p.add (endtitle);
	x.add (pic4);
	card4.add (p);
	card4.add (x);
	card4.add (back);
	p_card.add ("4", card4);
    }


    public void actionPerformed (ActionEvent e)
    { //moves between the screens

	if (e.getActionCommand ().equals ("1"))
	    cdLayout.show (p_card, "1");
	else if (e.getActionCommand ().equals ("2"))
	    cdLayout.show (p_card, "2");
	else if (e.getActionCommand ().equals ("4"))
	    cdLayout.show (p_card, "3");
	else if (e.getActionCommand ().equals ("end"))
	{
	    //last screen
	    cdLayout.show (p_card, "4");
	}
	else if (e.getActionCommand ().equals ("reset1"))
	{
	    reset ();
	}
	else if (e.getActionCommand ().equals ("back"))
	{
	    cdLayout.show (p_card, "1");
	}
	else if (e.getActionCommand ().equals ("instruct"))
	{
	    //instructions for game screen
	    JOptionPane.showMessageDialog (null, "* * * I N S T R U C T I O N S *    * * \n \n"
		    + "You and another player will be playing Tic Tac Toe \n"
		    + "with a spinoff. Both you and the other player are allowed \n"
		    + "to choose whether you want to be Princess Peach or Kirby on each turn. \n"
		    + "Use the 'Switch' button to switch between characters.\n"
		    + "The purpose is to get three in a row \n"
		    + "either diagonally, vertically or horizontally. \n"
		    + "Use the reset button to play again. \n \n"
		    + "Enjoy!!", "Instructions", JOptionPane.QUESTION_MESSAGE);
	}
	else if (e.getActionCommand ().equals ("change"))
	{
	    //to switch characters.
	    flipicon ();
	}
	else
	{
	    String space = e.getActionCommand ();
	    updateBoard (space);
	    drawBoard ();
	    win ();
	    flip ();
	}
    }


    //Player 1 or Player 2.switch.
    public void flip ()
    {
	if (turn == 1)
	{
	    current.setText ("" + turn);
	    turn = 2;
	}


	else
	{
	    current.setText ("" + turn);
	    turn = 1;
	}
    }


    //Switches characters.
    public void flipicon ()
    {
	if (icon == 1)
	{
	    pic.setIcon (createImageIcon ("kirby.png"));
	    icon = 2;
	}


	else
	{
	    pic.setIcon (createImageIcon ("peach.png"));
	    icon = 1;
	}
    }


    //update as user plays, contains all game sqaures.
    public void updateBoard (String space)
    {
	if (space.equals ("a") && board [0] [0] == 0)
	    board [0] [0] = icon;
	else if (space.equals ("b") && board [0] [1] == 0)
	    board [0] [1] = icon;
	else if (space.equals ("c") && board [0] [2] == 0)
	    board [0] [2] = icon;
	else if (space.equals ("d") && board [1] [0] == 0)
	    board [1] [0] = icon;
	else if (space.equals ("ee") && board [1] [1] == 0)
	    board [1] [1] = icon;
	else if (space.equals ("f") && board [1] [2] == 0)
	    board [1] [2] = icon;
	else if (space.equals ("g") && board [2] [0] == 0)
	    board [2] [0] = icon;
	else if (space.equals ("h") && board [2] [1] == 0)
	    board [2] [1] = icon;
	else if (space.equals ("i") && board [2] [2] == 0)
	    board [2] [2] = icon;
    }


    //Game board photos.
    public String getPic (int n)
    {
	if (n == 0)
	    return "crown.png";
	else if (n == 1)
	    return "peach.png";
	else
	    return "kirby.png";
    }


    //Get photos.
    public void drawBoard ()
    {
	a.setIcon (createImageIcon (getPic (board [0] [0])));
	b.setIcon (createImageIcon (getPic (board [0] [1])));
	c.setIcon (createImageIcon (getPic (board [0] [2])));
	d.setIcon (createImageIcon (getPic (board [1] [0])));
	ee.setIcon (createImageIcon (getPic (board [1] [1])));
	f.setIcon (createImageIcon (getPic (board [1] [2])));
	g.setIcon (createImageIcon (getPic (board [2] [0])));
	h.setIcon (createImageIcon (getPic (board [2] [1])));
	i.setIcon (createImageIcon (getPic (board [2] [2])));
    }


    //declares winner.
    public void win ()
    {
	int winner = 0;
	if (board [0] [0] == board [0] [1] && board [0] [0] == board [0] [2] && board [0] [0] != 0)
	    winner = board [0] [0];
	else if (board [1] [0] == board [1] [1] && board [1] [0] == board [1] [2] && board [1] [0] != 0)
	    winner = board [1] [0];
	else if (board [2] [0] == board [2] [1] && board [2] [0] == board [2] [2] && board [2] [0] != 0)
	    winner = board [2] [0];
	else if (board [0] [0] == board [1] [0] && board [0] [0] == board [2] [0] && board [0] [0] != 0)
	    winner = board [0] [0];
	else if (board [0] [1] == board [1] [1] && board [0] [1] == board [2] [1] && board [0] [1] != 0)
	    winner = board [0] [1];
	else if (board [0] [2] == board [1] [2] && board [0] [2] == board [2] [2] && board [0] [2] != 0)
	    winner = board [0] [2];
	else if (board [0] [0] == board [1] [1] && board [0] [0] == board [2] [2] && board [0] [0] != 0)
	    winner = board [0] [0];
	else if (board [0] [2] == board [1] [1] && board [0] [2] == board [2] [0] && board [0] [2] != 0)

	    winner = board [0] [2];
	else if (board [0] [0] != 0 && board [0] [1] != 0 && board [0] [2] != 0 &&
		board [1] [0] != 0 && board [1] [1] != 0 && board [1] [2] != 0 &&
		board [2] [0] != 0 && board [2] [1] != 0 && board [2] [2] != 0)
	    winner = 3;
	//dialog boxes for wins, with photos
	if (winner == 1)
	{
	    JOptionPane.showMessageDialog (null, createImageIcon ("peachp.png"), "Peach Wins!!!", JOptionPane.INFORMATION_MESSAGE);
	}


	else if (winner == 2)
	{
	    JOptionPane.showMessageDialog (null, createImageIcon ("kkirbe.png"), "Kirby Wins!!!", JOptionPane.INFORMATION_MESSAGE);
	}


	else if (winner == 3)
	{
	    JOptionPane.showMessageDialog (null, "Cat's game!Tie", "oh rats",
		    JOptionPane.INFORMATION_MESSAGE);
	}
    }


    //For second button on game screen.
    public void reset ()
    {
	//starts game again.
	for (int k = 0 ; k < 3 ; k++)
	{
	    for (int j = 0 ; j < 3 ; j++)
	    {
		board [k] [j] = 0;
	    }
	}
	drawBoard ();
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = ChaudhryMahroshWildTicTacToe.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}


	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }
}






