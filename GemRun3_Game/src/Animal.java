public class Animal extends CellItem {

    /**
     * Constructor that initializes Animal attributes
     *
     * @param name     String for attribute 'name'
     * @param baseCost int for base cost of the Animal
     * @param id       int for the ID of the Cell
     */
    public Animal(String name, int baseCost, int id) {
        super(name, baseCost * id);
    }
}
