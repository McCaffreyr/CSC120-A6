import java.util.ArrayList;

public class Train{

    //Attributes
    private ArrayList<Car> carsattached;
    private FuelType fuelType;
    private double fuelCapacity;
    private int nCars;
    private int passengerCapacity;
    private Engine myEngine;

    /**Constructer
     * @param fuelType Train's fuel type
     * @param fuelCapacity Train's fuel capacity
     * @param nCars Number of cars in the train
     * @param passengerCapacity Total number of passengers that can fit on the train
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.carsattached = new ArrayList<>();
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.nCars = nCars;
        this.passengerCapacity = passengerCapacity;
        this.myEngine = new Engine(fuelType, nCars, passengerCapacity);
        for (int i = 0; i < nCars; i++) {
            Car myCar = new Car(50);
            this.carsattached.add(myCar);
        }
    }

    /**
     * @return Engine information
     */
    public Engine getEngine(){
        return this.myEngine;
    }

    /**
     * @return Information about a certain car i
     */
    public Car getCar(int i){
        return carsattached.get(i);
    }

    /**
     * @return Max capacity of the train
     */
    public int getMaxCapacity(){
        int total = 0;
        for (int j = 0; j < nCars; j++){
            total += carsattached.get(j).getCapacity();
            //System.out.println(total);
        }
        return total;
    }

    /**
     * @return Number of seats left open on the train
     */
    public int seatsRemaining(){
        int seatsleft = 0;
        for (int j = 0; j < nCars; j++){
            seatsleft += carsattached.get(j).seatsRemaining();
        }
        return seatsleft;
    }

    /**
     * Prints all the names of the passengers on the train
     */
    public void printManifest(){
        for (int k = 0; k < nCars; k++){
            carsattached.get(k).printManifest();
        }
    }

    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.ELECTRIC, 50.0, 3, 50);
        Passenger jill = new Passenger("Jill");
        Passenger steve = new Passenger("Steve");
        Passenger abby = new Passenger("Abby");

        myTrain.getCar(2).addPassenger(jill);
        myTrain.getCar(2).addPassenger(steve);
        myTrain.getCar(2).addPassenger(abby);

        //myTrain.getCar(2).printManifest();

        System.out.println(myTrain.seatsRemaining());

        myTrain.printManifest();
    }


}
