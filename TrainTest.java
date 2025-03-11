import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TrainTest {

    public Train x;

    @Before
    public void setup(){
        this.x = new Train(FuelType.ELECTRIC, 50.0, 3, 50);
    }

    // Engine Tests
    @Test
    public void testEngineConstructor() {
        String expectedfuel = "ELECTRIC";
        assertEquals(expectedfuel, x.getEngine().getFuelType());
    }

    @Test
    public void testEngineGo() {
        fail();
    }

    // Car Tests
    @Test
    public void testCarAddPassenger() {
        fail();
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
