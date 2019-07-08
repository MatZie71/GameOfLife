public class Cell {

    private String cellStatus;


    public String getLivingCell() {
        this.cellStatus = "[x]";
        return cellStatus;

    }

    public String getDeadCell() {
        this.cellStatus = "[o]";
        return cellStatus;
    }

    public String getEmptyCell() {
        this.cellStatus = "[ ]";
        return cellStatus;

    }

    public String getCellStatus() {

        return cellStatus;
    }

}
