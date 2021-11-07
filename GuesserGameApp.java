package abcTraining;
import java.util.Scanner;
/**
 * Guess the number guessed by the player and the guesser with the help of umpire who will compare the number and give the result
 * accordingly.
 * @author Syed Athar Hussain
 * @version 16.0
 * @since 30-09-2021
 * */

class Guesser{
	int gnum;
	/**
	 * This is guessNum method which will get an input from the guesser and return it.
	 * @return gnum
	 * */
	int guessNum() {
		System.out.println("Guesser! kindly guess a number between 1 to 100: ");
		Scanner sc = new Scanner(System.in);
		gnum = sc.nextInt();
		return gnum;
	}
}
class Player{
	int pnum;
	/**
	 * This is playerNum method which will get an input from the player and return it.
	 * @return pnum
	 * */
	int playerNum() {
		System.out.println("Player! kindly guess a number between 1 to 100: ");
		Scanner sc = new Scanner(System.in);
		pnum = sc.nextInt();
		return pnum;
	}
}

class Umpire{
	int guessNumGuesser;
	int player1NumGuess;
	int player2NumGuess;
	int player3NumGuess;
	/**
	 * This is guessNumFromGuesser method which creates an object of guesser and get the input into a variable.
	 * @return nothing
	 * */
	void guessNumFromGuesser() {
		Guesser g = new Guesser();
		guessNumGuesser = g.guessNum();
	}
	/**
	 * This is guessNumFromPlayer method which create objects of player and get the input into a variable.
	 * @return nothing
	 * */
	void guessNumFromPlayer() {
		Player p1 = new Player();
	
		/*
		 * Player p2 = new Player(); Player p3 = new Player();
		 */
		player1NumGuess = p1.playerNum();
		player2NumGuess = p1.playerNum();
		player3NumGuess = p1.playerNum();
	}
	/**
	 * This is compare method which compares the guesses from guesser and players and give a result.
	 * @return nothing
	 * */
	void compare() {
		if(player1NumGuess==guessNumGuesser) {
			System.out.println("Player1 won");
		}
		if(player2NumGuess==guessNumGuesser) {
			System.out.println("Player2 won");
		}
		if(player3NumGuess==guessNumGuesser) {
			System.out.println("Player3 won");
		}
		else{
			System.out.println("No one won!! Try again");
		}
	}
}
public class GuesserGameApp {
	/**
	 * This is main method which create an object of umpire and also calls the method in the umpire class.
	 * @return nothing
	 * */
	final static int CHANCES = 3;

	public static void main(String[] args) { 
		Umpire u = new Umpire();
		int i=0;
		while(i<CHANCES) {
			u.guessNumFromGuesser();
			u.guessNumFromPlayer();
			u.compare();
			i++;
		}

	}

}
