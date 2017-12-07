package touchtime_tests;

/**
 * Created by Evan Ansell on 2017-11-26.
 */

import com.example.mattpo.touchtime_3xa3.VibrationMethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class vibPatternTest {

    int[] vibCount;
    long[] expected;
    long[] result;

    @Before
    public void setUp() {
        vibCount = new int[3];
        //expected = new long[];
    }

    @After
    public void tearDown() {
        expected = null;
        result = null;
    }

    @Test
    public void minTime() {
        vibCount[0] = 0; vibCount[1] = 0; vibCount[2] = 0;

        long[] vibPattern = VibrationMethods.vibPatternMaker(vibCount);

    }

    @Test
    public void maxTime() {

    }
}
