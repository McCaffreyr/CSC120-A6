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
        if (c.addPassenger(this)){
            c.addPassenger(this);
        }else{
            System.out.println("Car is full.");
        }
    }

    /**
     * Removes a passenger from a car
     */
    public void getOffCar(Car c){
        if (c.removePassenger(this)){
            c.removePassenger(this);
        }else{
            System.out.println("This passenger wasn't in this car to begin with.");
        }
    }


}