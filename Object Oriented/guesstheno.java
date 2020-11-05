import java.util.Scanner;
import java.lang.Random;
class guesstheno{
	public static void main(String[] args) {
	game first = new game();
	System.out.print(game.game());
	}
}


class game{
	Random rand = new Random();
	public int game(){
      return rand.nextInt(4);
	}

}