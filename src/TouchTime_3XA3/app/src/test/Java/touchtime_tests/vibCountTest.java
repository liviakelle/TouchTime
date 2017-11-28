package touchtime_tests; /**
 * Created by Evan Ansell on 2017-11-26.
 */


import android.support.wearable.watchface.CanvasWatchFaceService;

import com.example.mattpo.touchtime_3xa3.TouchTime;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;
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
    public void minTime() {
        expected[0] = 11; expected[1] = 5; expected[2] = 9;
        result = TouchTime.vibCalc(11,59);
        for (int i = 0; i < 2; i++){
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void maxTime() {
        //TODO find out what the new pattern is for 12:00, see if hour is in system as 0 or 12
        expected[0] = ?; expected[1] = 0; expected[2] = 0;
        result = TouchTime.vibCalc(0,00);
        for (int i = 0; i < 2; i++){
            assertEquals(expected[i], result[i]);
        }
    }
}
