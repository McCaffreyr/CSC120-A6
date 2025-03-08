import java.util.ArrayList;

public class Car implements CarRequirements{

    //Attributes
    private ArrayList<Passenger> passengersOnboard;
    private int maxCapacity;

    /**Constructer
     * @param maxCapacity Max capacity of a car
     */
    public Car(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList<Passenger>(maxCapacity);
    }

    /**
     * @return Car's max capacity
     */
    public int getCapacity(){
        return this.maxCapacity;
    }

    /**
     * @return Number of open seats left in the car
     */
    public int seatsRemaining(){
        return this.maxCapacity - passengersOnboard.size();
    }

    /**
     * @returns T if the car has room to add another passenger, F if not
     */
    public Boolean addPassenger(Passenger p){
        if (this.maxCapacity - passengersOnboard.size() > 0){
            passengersOnboard.add(p);
            return true;
        }else{
            return false;
        }
    }

    /**
     * @return T if a passenger is in a car and can be removed, F if they aren't in the car
     */
    public Boolean removePassenger(Passenger p){
        if (passengersOnboard.contains(p)){
            passengersOnboard.remove(p);
            return true;
        }else{
            System.out.println("Passenger wasn't in the car to begin with");
            return false;
        }
    }

    /**
     * Prints a list of all the passenger's names in a train car
     */
    public void printManifest(){
        if (passengersOnboard.size() > 0){
            System.out.println("People on board:");
            for (int i = 0; i < passengersOnboard.size(); i++){
                System.out.println(passengersOnboard.get(i).name);
            }
        }else{
            System.out.println("This car is EMPTY.");
            }
        }

    public static void main(String[] args) {
        Car myCar = new Car(50);
        Passenger jill = new Passenger("Jill");
        Passenger steve = new Passenger("Steve");
        Passenger abby = new Passenger("Abby");

        myCar.addPassenger(jill);
        myCar.addPassenger(steve);
        myCar.addPassenger(abby);


        System.out.println(myCar.seatsRemaining());
        myCar.printManifest();
    }

}


   
