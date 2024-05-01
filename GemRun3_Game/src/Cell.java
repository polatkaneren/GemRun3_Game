public class Cell {

    private static int count = 0;
    private int id;
    private CellItem cellItem;
    private boolean cleared;
    private boolean visited;

    /**
     * Constructor that initializes Cell attributes:
     *     'num': current count
     *     'cellItem': a River with cost -15 or a random Animal
     *     'cleared' and 'visited': false
     */
    public Cell() {
        this.id = count; // assign ID number
        count++; // increment counter

        int randNum = (int) (100 * Math.random());

        if ((randNum % 4) == 0)
            this.cellItem = new CellItem("River", -15);
        else {
            randNum = (int) (4 * Math.random());
            this.cellItem = initAnimal(randNum);
        }

        this.cleared = false;
        this.visited = false;
    }

    /**
     * Creates a random Animal object
     *
     * @param randNum a random integer 0-3
     * @return an Animal object
     */
    private Animal initAnimal(int randNum) {
        String name;
        int cost;
        switch (randNum) {
            case 0:
                name = "Wolf";
                cost = -2;
                break;
            case 1:
                name = "Boar";
                cost = -1;
                break;
            case 2:
                name = "Elk";
                cost = 0;
                break;
            default:
                name = "Hare";
                cost = 1;
                break;
        }
        return new Animal(name, cost, this.id);
    }

    /* Getter methods */

    public CellItem getCellItem() {
        return this.cellItem;
    }

    public int getID() {
        return this.id;
    }

    public boolean getCleared() {
        return this.cleared;
    }

    public boolean getVisited() {
        return this.visited;
    }

    public int getCellCost() {
        if (this.visited)
            return 0;
        else
            return this.cellItem.getCost();
    }

    /* Setter methods */

    public void setCellItem(CellItem item) {
        this.cellItem = item;
    }

    public void setCleared(boolean cleared) {
        this.cleared = cleared;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    /**
     * Overriding toString() method that returns:
     *     " X " if Cell has been cleared and visited
     *     The first letter the item's name if Cell has been cleared but not visited
     *     A blank string ("   ") if the cell has not been cleared
     *
     * @return String containing cell's information
     */
    @Override
    public String toString() {
        if (this.cleared) {
            if (this.visited) {
                return " X ";
            } else {
                return " " + this.cellItem.toString().charAt(0) + " ";
            }
        } else {
            return "   ";
        }
    }

    /**
     * Check if two cells are the same in a grid, based on id.
     *
     * @param other the other cell to compare to this
     * @return true if same, false otherwise.
     */
    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass())
            return false;
        Cell cell = (Cell) other;
        return id == cell.id;
    }
}
