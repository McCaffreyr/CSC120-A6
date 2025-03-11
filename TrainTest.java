import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TrainTest {

    public Train x;

    @Before
    public void setup(){
        this.x = new Train(FuelType.ELECTRIC, 50.0, 6, 50);
    }

    // Engine Tests
    @Test
    public void testEngineConstructor() {
        String expectedfuel = "Engine has fuel type: ELECTRIC current fuel level: 6.0 and max fuel level: 50.0";
        assertEquals(expectedfuel, x.getEngine().toString());
    }

    //why is it thinking nCars is current fuel?????




    @Test
    public void testEngineGo() {
        //because current fuel is 6, it'll go once and then not
        assertEquals(true, x.getEngine().go());
        assertEquals(false, x.getEngine().go());
    }

    // Car Tests
    @Test
    public void testCarAddPassenger() {
        assertEquals(50, x.getCar(2).seatsRemaining());
        Passenger jill = new Passenger("Jill");
        x.getCar(2).addPassenger(jill);
        assertEquals(49, x.getCar(2).seatsRemaining());
    }

    @Test
    public void testCarRemovePassenger() {
        fail();
    }

    // Passenger Tests
    @Test
    public void testPassengerBoardCarWithSpace() {
        fail();
    }

    @Test
    public void testPassengerBoardCarFull() {
        fail();
    }

    // Train Tests
    @Test
    public void testTrainConstructor() {
        fail();
    }

    @Test
    public void testTrainPassengerCount() {
        fail();
    }

    @Test
    public void testTrainGetCar() {
        fail();
    }

    @Test
    public void testTrainPrintManifest() {
        fail();
    }
    
}
