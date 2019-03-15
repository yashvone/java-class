package assignment1;
import java.util.*;

abstract class themepark{
	Scanner s = new Scanner(System.in);
	int cost(int m, int n) {
		return (m*300+n*500);
	}
	
	abstract void playGame();
}

class queensland extends themepark{
	static boolean[] Games = new boolean[30];
	queensland() {
		playGame();
	}
	
	void playGame() {
		System.out.println("Enter the game code to be played(0-29)");
		int i = s.nextInt();
		if(Games[i]) {
			System.out.println("Already played, Enter another game code: ");
			playGame();
		} 
		else Games[i]=true;
	}
}

class wonderla extends themepark{
	int[] Games = new int[40];
	int count, repeat, non;
	wonderla(){
		playGame();
	}
	void playGame() {
		count++;
		boolean cont = true;
		System.out.println("Enter the game code to be played(0-39)");
		int i = s.nextInt();
		Games[i]++;
		System.out.println("Do you want to continue? Type 'yes': ");
		String ch = s.next();
		cont = (ch.toLowerCase().equals("yes"))? true: false;
		while(cont) playGame();
		for (int x: Games)
			if(x>1)
				repeat++;
			else if(x==0) non++;
		System.out.println("Total games played: "+count+"\nNumber of games which were repeated: "+repeat+"\nNumber of games which were not played at all: "+non);
	}
	
}

public class abstractclass {
	public static void main(String[] args) {
		boolean stop = false;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number for adults: ");
		int n = s.nextInt();
		System.out.println("Enter number of children: ");
		int m = s.nextInt(), c = 0;
		while(!stop) {
			System.out.println("1. Queenspark\n2. Wonderla\n3. Exit\nChoose the themepark: ");
			int ch = s.nextInt();
			switch(ch) {
			case 1: queensland q = new queensland();
					c = q.cost(m, n);
					break;
			case 2: wonderla w = new wonderla();
					c = w.cost(m, n);
					break;
			case 3: stop = true;
					break;
			}
		}
		System.out.println("Cost for "+n+" adults & "+m+" children: "+c);

	}
}
