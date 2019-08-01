import java.util.Scanner;

public class GoLTest {

    public static void main(String[] args) {


        World game = new World();


        game.startWorld();
        game.getWorld();
        System.out.println();
        for (int x = 0; x < 10; x++) {
            game.checkWorld();
            game.nextTurn();
            game.getWorld();
            System.out.println();
        }


    }
}

