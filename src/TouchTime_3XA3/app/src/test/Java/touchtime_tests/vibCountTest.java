package touchtime_tests; /**
 * Created by Evan Ansell on 2017-11-26.
 */



import com.example.mattpo.touchtime_3xa3.VibrationMethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class vibCountTest {

    int[] expected;
    int[] result;

    @Before
    public void setUp() {
        expected = new int[3];
    }

    @After
    public void tearDown() {
        expected = null;
        result = null;
    }


    @Test
    public void maxTime() {
        expected[0] = 12; expected[1] = 5; expected[2] = 9;
        result = VibrationMethods.vibCalc(12,59);
        for (int i = 0; i < 2; i++){
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void minTime() {
        expected[0] = 1; expected[1] = 0; expected[2] = 0;
        result = VibrationMethods.vibCalc(1,00);
        for (int i = 0; i < 2; i++){
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void hour12Test() {
        expected[0] = 12; expected[1] = 0; expected[2] = 0;
        result = VibrationMethods.vibCalc(12,00);
        for (int i = 0; i < 2; i++){
            assertEquals(expected[i], result[i]);
        }
    }

}
