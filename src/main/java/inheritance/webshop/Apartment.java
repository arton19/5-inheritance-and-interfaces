package inheritance.webshop;

/**
 * The Apartment class represents an apartment in a webshop. Like the Vehicle
 * class, the Apartment class should inherit the Product class.
 *
 * In real life an apartment would likely have additional properties, such as
 * the number of rooms, the size in square meters, the floor number, etc. In
 * this exercise, you can decide yourself which properties you want to add. You
 * can also decide yourself how the toString() method should look like.
 *
 * This class will not be autograded, so it is up to you to test it. You can
 * also skip this class and continue with the next part of the exercise if you
 * feel that you have understood the concept of inheritance.
 */
public class Apartment extends Product{

    private int roomAmount;
    private double size;
    private int floorNumber;

    public Apartment (String title, String description, double price, int roomAmount, double size, int floorNumber) {
        super(title, description, price);
        this.roomAmount = roomAmount;
        this.size = size;
        this.floorNumber = floorNumber;
    }

    public int getRooms() {
        return this.roomAmount;
    }

    public double getSquareMeters() {
        return this.size;
    }

    public int getFloor() {
        return this.floorNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", room amount: " + this.roomAmount + ", size (m^2): " + this.size + " m2, floor number: " + this.floorNumber;
    }
}
