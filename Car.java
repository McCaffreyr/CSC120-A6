import java.util.ArrayList;

public class Car{

    //Attributes
    private ArrayList<Passenger> passengersOnboard;
    private int maxCapacity;
    public ArrayList<Passenger> totalppl;


    /**Constructer
     * @param maxCapacity Max capacity of a car
     */
    public Car(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList<Passenger>(maxCapacity);
        this.totalppl = new ArrayList<Passenger>();
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
    public ArrayList printManifest(ArrayList totalppl){
        if (passengersOnboard.size() > 0){
            System.out.println("People on board:");
            for (int i = 0; i < passengersOnboard.size(); i++){
                System.out.println(passengersOnboard.get(i).name);
                totalppl.add(passengersOnboard.get(i));
            }
        }else{
            System.out.println("This car is EMPTY.");
            }
        return totalppl;
        }

    public static void main(String[] args) {
        Car myCar = new Car(50);
        Passenger jill = new Passenger("Jill");
        Passenger steve = new Passenger("Steve");
        Passenger abby = new Passenger("Abby");

        myCar.addPassenger(jill);
        myCar.addPassenger(steve);
        myCar.addPassenger(abby);

        ArrayList<Passenger> trainppl = new ArrayList<Passenger>();
        System.out.println(myCar.seatsRemaining());
        myCar.printManifest(trainppl);
    }

}


   
