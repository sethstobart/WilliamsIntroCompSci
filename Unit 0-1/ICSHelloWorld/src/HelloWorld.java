import java.util.Scanner;

import TicTacToe.TicTacToe;

public class HelloWorld {
	
	private static Scanner keyboard;
	static String playing;
	static String game;
	
	public static void main (String [] args) {
		keyboard = new Scanner(System.in);  //Input object
		HelloWorld.playing(); //Start program
	}
	
	public static void playing() {
		
		System.out.println("Hello World"); //Intro
		System.out.println("Shall we play a game?");
		System.out.println("y/n");
		playing = keyboard.nextLine().trim().toLowerCase(); //What is your response?
				
		if (playing.equals("y")) { //Yes I would like to play
			HelloWorld.gameChoice(); //Move to game choice
		}
		
		else { //No I don't want to play
			System.out.println("You sure, you don't want to play?"); //C'monn play my game pleaseeeeee
			playing = keyboard.nextLine().trim().toLowerCase();
			
			if (playing.equals("n")){ //Yes I would like to play
				HelloWorld.gameChoice();
			}
			
			else {//No I don't
				System.out.println("Shame. See you next time.");
			}
		}
		
	}
	
	public static void gameChoice() {
		System.out.println("What should we play?"); //Game options
		System.out.println("gamegameChess: c");
		System.out.println("gameCheckers: ch");
		System.out.println("Tic Tac Toe: ttt");
		System.out.println("Thermonuclear war: tw");
		
		game = keyboard.next().trim().toLowerCase(); //Keyboard inputs
		
		if (game.equals("c")) { //Game methods
			HelloWorld.gameChess();
		}
		
		if (game.equals("ch")) {
			HelloWorld.gameCheckers();
		}
		
		if (game.equals("ttt")) {
			HelloWorld.gameTicTacToe();
		}
		
		if (game.equals("tw")) {
			HelloWorld.gameThermoNuclearWar();
		}
		
	}
	
	public static void gameChess() {
		Chess.Application.main(null); //NOT MY CODE NOT MY CODE NOT MY CODE
		}
	
	public static void gameCheckers() {
		checkers.Checkers.main(null); //NOT MY CODE NOT MY CODE NOT MY CODE
	}
	
	public static void gameTicTacToe() {
		System.out.println("Strarting Game...");
		TicTacToe.main(null); //NOT MY CODE NOT MY CODE NOT MY CODE
	}
	
	public static void gameThermoNuclearWar() {
		String team; //What team you're playing
		String launch; //Are you going to try to launch
		
		System.out.println("Would you like to play USA (u) or Russia (r)?"); //Which team?		
		team = keyboard.nextLine().trim().toLowerCase();
		team = keyboard.nextLine().trim().toLowerCase();
		
		if (team.equals("u")) { 
			System.out.println("Playing USA, would you like to launch?"); //Playing USA
			System.out.println("y/n");
			launch = keyboard.nextLine().trim().toLowerCase();
			if (launch.equals("y")) {
				HelloWorld.launch(); //Launch the missles
			}
			if (launch.equals("n")) {
				HelloWorld.peace(); //Don't launch
			}
		}
		
		if (team.equals("r")) {
			System.out.println("Playing Russia, would you like to launch?");
			System.out.println("y/n");
			launch = keyboard.nextLine().trim().toLowerCase();
			if (launch.equals("y")) {
				HelloWorld.launch(); //Launch the missles
			}
			if (launch.equals("n")) {
				HelloWorld.peace(); //Don't launch
			}
		}
		
		if (team.equals("nk")) {
			System.out.println("Hello rocketman, would you like to launch?"); //Easter egg funtime
			System.out.println("y/n");
			launch = keyboard.nextLine().trim().toLowerCase();
			if (launch.equals("y")) {
				System.out.println("Well you tried. Sadley your nukes don't launch. (Sorry I gotta be realistic here)\n Switching to something more your speed."); 
				checkers.Checkers.main(null);
			}
			
			if (launch.equals("n")) {
				HelloWorld.peace();
			}
		}
	}
	
	public static void launch() {
		System.out.println("Way to go you started World War Three. You lose.");
	}
	
	public static void peace() {
		String launch;
		System.out.println("Well that's boring. I guess there's world peace now. But for how long?");
		System.out.println("Press l to launch..."); //One last chance
		launch = keyboard.nextLine().trim().toLowerCase();
		
		if (launch.equals("l")) {
			HelloWorld.launch(); 
		}
		
		else {
			System.out.println("Well I guess you solved all of the worlds problems. Congrats loser, you win.");
		}
	}
}
