import java.util.Scanner;
public class GameMain {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		// Main Game Loop
		while(true) {
			System.out.println("rps? ");
			String move = scan.nextLine(); // accept player input
			
			String cMove = Character.toString("rps".charAt((int)(Math.random()*3)));
			
			System.out.println("Oponent: " + cMove);
			
			if(move.equals(cMove)) {
				System.out.println("Tie");
			}else if((move.equals("r") && cMove.equals("s")) || (move.equals("s") && cMove.equals("p")) || move.equals("p") && cMove.equals("r")) {
				System.out.println("Win!");
			}else {
				System.out.println("Lose!");
			}
	}

}
}
