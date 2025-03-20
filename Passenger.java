public class Passenger{
    
    public String name;

    /**Constructer
     * @param name Name of passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Adds a passenger to a car if there is room
     */
    public void boardCar(Car c){
        c.addPassenger(this);
        }

    /**
     * Removes a passenger from a car
     */
    public void getOffCar(Car c){
        c.removePassenger(this);
        }

}