package touchtime_tests; /**
 * Created by Evan Ansell on 2017-11-26.
 */

import com.example.mattpo.touchtime_3xa3.TouchTime;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class vibCountTest {



    @Test
    public void minTime() {
        assertTrue(TouchTime.Engine.vibCalc(11,59).equals([11,5,9]));
    }

    @Test
    void maxTime() {
        //TODO find out what the new pattern is for 12:00, see if hour is in system as 0 or 12
        assertTrue(TouchTime.Engine.vibCalc(12,00).equals([?,0,0]));
    }
}
