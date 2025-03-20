import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class TrainTest {

    public Train x;

    @Before
    public void setup(){
        this.x = new Train(FuelType.ELECTRIC, 50.0, 6, 1);
    }

    // Engine Tests
    @Test
    public void testEngineConstructor() {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 6.0,50.0);
        assertEquals(FuelType.ELECTRIC, myEngine.getFuelType());
        assertEquals(6.0, myEngine.getCurrentFuel(), 0);
        assertEquals(50.0, myEngine.getMaxFuel(), 0);
    }

    @Test
    public void testEngineGo() {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 6.0,50.0);
        assertEquals(true, myEngine.go());
        assertEquals(false, myEngine.go());
    }

    // Car Tests
    @Test
    public void testCarAddPassenger() {
        Passenger jill = new Passenger("Jill");
        assertEquals(50, x.getCar(2).seatsRemaining());
        x.getCar(2).addPassenger(jill);
        assertEquals(49, x.getCar(2).seatsRemaining());
    }

    @Test
    public void testCarRemovePassenger() {
        Passenger bill = new Passenger("Bill");
        assertEquals(50, x.getCar(3).seatsRemaining());
        x.getCar(3).removePassenger(bill);
        assertEquals(50, x.getCar(3).seatsRemaining());
    }


    // Passenger Tests
    @Test
    public void testPassengerBoardCarWithSpace() {
        Passenger steve = new Passenger("Steve");
        steve.boardCar(x.getCar(1));
        assertEquals(49, x.getCar(1).seatsRemaining());
    }

    @Test
    public void testPassengerBoardCarFull() {
        Car myCar = new Car(0);
        Passenger steve = new Passenger("Steve");
        steve.boardCar(myCar);
        assertEquals(0, myCar.seatsRemaining());
    }

    // Train Tests
    @Test
    public void testTrainConstructor() {
       assertEquals(6, x.nCars);
    }

    @Test
    public void testTrainPassengerCount() {
        Train myTrain = new Train(FuelType.ELECTRIC, 100.0, 6, 50);
        assertEquals(300, myTrain.seatsRemaining());
        Passenger jill = new Passenger("Jill");
        myTrain.getCar(2).addPassenger(jill);
        assertEquals(299, myTrain.seatsRemaining());
        myTrain.getCar(2).removePassenger(jill);
        assertEquals(300, myTrain.seatsRemaining());
    }

    @Test
    public void testTrainGetCar() {
        Train myTrain = new Train(FuelType.ELECTRIC, 100.0, 6, 50);
        assertEquals(50,myTrain.getCar(2).seatsRemaining());
        Passenger jill = new Passenger("Jill");
        myTrain.getCar(2).addPassenger(jill);
        assertEquals(49,myTrain.getCar(2).seatsRemaining());
        assertEquals(50,myTrain.getCar(1).seatsRemaining());
        }

    @Test
    public void testTrainPrintManifest() {
        Train myTrain = new Train(FuelType.ELECTRIC, 100.0, 6, 50);
        Passenger jill = new Passenger("Jill");
        myTrain.getCar(2).addPassenger(jill);
        Passenger abby = new Passenger("Abby");
        myTrain.getCar(1).addPassenger(abby);
        Passenger steve = new Passenger("Steve");
        myTrain.getCar(3).addPassenger(steve);

        ArrayList<Passenger> trainpeople = new ArrayList<Passenger>();
        assertEquals(3, myTrain.printManifest(trainpeople).size());
        }
    }