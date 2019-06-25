import java.util.Scanner;

public class World {
    private int cellPositionX;
    private int cellPositionY;
    private int wiersz = 20;
    private int kolumna = 20;
    private int startingCells;
    private String[][] world;

    public int startingCells(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość komórek startowych");
        this.startingCells= scan.nextInt();
        return startingCells;

    }

    public void getPosition() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pozycje komorki w osi X, od 0do 19");
        this.cellPositionX= scan.nextInt();

        System.out.println("Podaj pozycje komorki w osi Y, od 0do 19");
        this.cellPositionY= scan.nextInt();

    }
public void inputCell(){

            getPosition();
            world[cellPositionY][cellPositionX]=Cell.getLivingCell();

    System.out.println(world);


}


    public void getWorld() {
                world = new String[wiersz][kolumna];




        for (int i = 0; i < world.length; i++) {

            String[] jedenBok = world[i];

            for (int j = 0; j < jedenBok.length; j++) {
                world[i][j] = "[ ]";

                //=world[cellPositionY][cellPositionX];

                //world[cellPositionY][cellPositionX] = "[x]";
                /*for(int g=0;g<startingCells;g++){
                    int nr=1;

                    System.out.println("Podaj pozycje na osi X, komórki nr."+nr);
                    String cellPositionY = scan.nextLine();
                    System.out.println("Podaj pozycje na osi Y, komórki nr."+nr);
                    String cellPositionX = scan.nextLine();
                    nr++;
                world[Integer.parseInt(cellPositionY)][Integer.parseInt(cellPositionX)] = "[x]";//zywa komorka
            }*/

                //System.out.print(world[i][j] + " ");


            }

            //System.out.println();

        }

    }



}


