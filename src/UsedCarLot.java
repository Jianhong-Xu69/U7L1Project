import java.util.ArrayList;

public class UsedCarLot {
    // the car lot's inventory
    private ArrayList<Car> inventory;

    // constructs a new UsedCarLot object
    // sets inventory to an empty ArrayList of Cars
    public UsedCarLot() {
        /* IMPLEMENT ME! */
        inventory = new ArrayList<Car>();
    }

    // getter method: returns the inventory
    public ArrayList<Car> getInventory() {
        /* IMPLEMENT ME! */
        return inventory;
    }

    // adds a Car to the end of the inventory list
    public void addCar(Car carToAdd) {
        /* IMPLEMENT ME! */
        inventory.add(carToAdd);
    }

    // swaps the Car at idx1 with the Car at idx2 in inventory;
    // however, if either idx1 or idx2 exceed the bounds of the inventory,
    // do nothing (rather than crashing!).
    //
    // this method MODIFIES the state of the object (its inventory)
    public void swap(int idx1, int idx2) {
        /* IMPLEMENT ME! */
        if (idx1 < inventory.size() && idx2 < inventory.size()) {
            Car temp = inventory.set(idx1, inventory.get(idx2));
            inventory.set(idx2, temp);
        }
    }
}