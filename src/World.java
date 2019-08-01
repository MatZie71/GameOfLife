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


    public void startWorld() {
        startingCells();
        this.world = new Cell[kolumna][wiersz];

// tworzenie czystej planszy
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                world[i][j] = new Cell();
                world[i][j].emptyCell();
                world[i][j].setNeighbouringCell(0);
                world[i][j].setIsCellDead("yes");


            }
        }
//dodawanie zywych komorek
        for (int q = 0; q < startingCells; q++) {

            getPosition();
            world[cellPositionY][cellPositionX].getLivingCell();
            world[cellPositionY][cellPositionX].setIsCellDead("no");

        }


    }

    public void getWorld() {
        // wyswietlenie planszy
        for (int e = 0; e < world.length; e++) {
            for (int r = 0; r < world[e].length; r++) {

                System.out.print(world[e][r].getCellStatus() + " ");


            }
            System.out.println();
        }


    }

    //Sprawdzanie sasiadow komorki1
    public void checkWorld() {

        for (int e = 0; e < world.length; e++) {
            for (int r = 0; r < world[e].length; r++) {
                int j = 0;

                if (e != 0) {
                    if (world[e - 1][r].getCellStatus().equals("[x]")) {
                        j++;
                    }

                }

                if (r != 0) {
                    if (world[e][r - 1].getCellStatus().equals("[x]")) {
                        j++;
                    }

                }

                if (e != 19) {
                    if (world[e + 1][r].getCellStatus().equals("[x]")) {
                        j++;
                    }

                }
                if (r != 19) {
                    if (world[e][r + 1].getCellStatus().equals("[x]")) {
                        j++;
                    }

                }
                if (r != 19 && e != 0) {
                    if (world[e - 1][r + 1].getCellStatus().equals("[x]")) {
                        j++;
                    }

                }

                if (r != 0 && e != 0) {
                    if (world[e - 1][r - 1].getCellStatus().equals("[x]")) {
                        j++;
                    }

                }
                if (r != 19 && e != 19) {
                    if (world[e + 1][r + 1].getCellStatus().equals("[x]")) {
                        j++;
                    }

                }
                if (r != 0 && e != 19) {
                    if (world[e + 1][r - 1].getCellStatus().equals("[x]")) {
                        j++;
                    }

                }
                world[e][r].setNeighbouringCell(j);


            }

        }

    }

    //Przejscie do nastepnej tury // zmiany w komorkach
    public void nextTurn() {

        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                if (world[i][j].getNeighbouringCell() < 2 && !world[i][j].getIsCellDead()) {


                    world[i][j].setIsCellDead("yes");
                }

                if ((world[i][j].getNeighbouringCell() == 3 || world[i][j].getNeighbouringCell() == 2) && !world[i][j].getIsCellDead()) {


                    world[i][j].setIsCellDead("no");

                }

                if (world[i][j].getNeighbouringCell() > 3 && !world[i][j].getIsCellDead()) {


                    world[i][j].setIsCellDead("yes");
                }

                if (world[i][j].getIsCellDead() == true && world[i][j].getNeighbouringCell() == 3) {

                    world[i][j].setIsCellDead("no");


                }

            }
        }
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                if (world[i][j].getIsCellDead()) {

                    world[i][j].emptyCell();
                }

                if ((world[i][j].getNeighbouringCell() == 3 || world[i][j].getNeighbouringCell() == 2) && !world[i][j].getIsCellDead()) {

                    world[i][j].getLivingCell();


                }

                if (world[i][j].getNeighbouringCell() > 3 && !world[i][j].getIsCellDead()) {

                    world[i][j].emptyCell();

                }

                if (world[i][j].getIsCellDead() == true && world[i][j].getNeighbouringCell() == 3) {
                    world[i][j].getLivingCell();


                }

            }
        }


    }


}























