import java.util.Scanner;

public class World {
    private int cellPositionX;
    private int cellPositionY;
    private int wiersz = 20;
    private int kolumna = 20;
    private int startingCells;
    private Cell[][] world;

    public void startingCells() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość komórek startowych");
        this.startingCells = scan.nextInt();


    }

    public void getPosition() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pozycje komorki w osi X, od 0do 19");
        this.cellPositionX = scan.nextInt();

        System.out.println("Podaj pozycje komorki w osi Y, od 0do 19");
        this.cellPositionY = scan.nextInt();

    }


    public void getWorld() {
        startingCells();
        Cell[][] world = new Cell[kolumna][wiersz];

// tworzenie czystej planszy
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                world[i][j] = new Cell();
                world[i][j].getEmptyCell();


            }
        }
//dodawanie zywych komorek
        for (int q = 0; q < startingCells; q++) {

            getPosition();
            world[cellPositionY][cellPositionX].getLivingCell();


        }

// wyswietlenie planszy startowej
        for (int e = 0; e < world.length; e++) {
            for (int r = 0; r < world[e].length; r++) {

                System.out.print(world[e][r].getCellStatus() + " ");


            }
            System.out.println();
        }


    }
}






