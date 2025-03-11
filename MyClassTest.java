import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class MyClassTest {

    public MyClass x;

    @Before
    public void setup(){
        this.x = new MyClass();
    }

    @Test
    public void testtoCaps(){
        String testString = "maggie";
        String expectedString = "MAGGIE";
        assertEquals(expectedString, x.toCaps(testString));

    }

    @Test
    public void testgetMeAThree(){
        assertEquals(3, x.getMaAThree());

    }
    
}
