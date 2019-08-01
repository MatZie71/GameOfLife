public class Cell {

    private String cellStatus;
    public int neighbouringCell = 0;
    private boolean isCellDead;


    public String getLivingCell() {
        this.cellStatus = "[x]";
        return cellStatus;

    }


    public String emptyCell() {
        this.cellStatus = "[ ]";
        return cellStatus;

    }

    public String getCellStatus() {

        return cellStatus;
    }


    public void setNeighbouringCell(int x) {

        this.neighbouringCell = x;
    }

    public int getNeighbouringCell() {

        return neighbouringCell;
    }

    public void setIsCellDead(String x) {
        if (x.equals("yes")) {
            isCellDead = true;
        } else {
            isCellDead = false;
        }

    }

    public boolean getIsCellDead() {

        return isCellDead;
    }

}
