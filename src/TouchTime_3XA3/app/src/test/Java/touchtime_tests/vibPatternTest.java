package touchtime_tests;

/**
 * Created by Evan Ansell on 2017-11-26.
 */

import com.example.mattpo.touchtime_3xa3.TouchTime;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class vibPatternTest {

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
    public void minTime() {

    }

    @Test
    public void maxTime() {

    }
}
