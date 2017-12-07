package touchtime_tests;

/**
 * Created by Evan Ansell on 2017-11-26.
 */

import android.util.Log;

import com.example.mattpo.touchtime_3xa3.VibrationMethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.*;

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
        vibCount[0] = 1; vibCount[1] = 0; vibCount[2] = 0;
        expected = new long[4];
        expected[0] = 80; expected[1] = 400; expected[2] = 1000; expected[3] = 0;

        result = VibrationMethods.vibPatternMaker(vibCount);

        for (int i = 0; i < 4; i++){
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void maxTime() {
        vibCount[0] = 12; vibCount[1] = 5; vibCount[2] = 9;
        expected = new long[56];
        for (int i = 0; i<24; i++){
            if (i%2 == 0){
                expected[i] = 80;
            } else {
                expected[i] = 400;
            }
        }
        expected[24] = 1000; expected[25] = 0;
        for (int i = 26; i<36; i++){
            if (i%2 == 0){
                expected[i] = 80;
            } else {
                expected[i] = 400;
            }
        }
        expected[36] = 1000; expected[37] = 0;
        for (int i = 38; i<56; i++){
            if (i%2 == 0){
                expected[i] = 85;
            } else {
                expected[i] = 250;
            }
        }

        result = VibrationMethods.vibPatternMaker(vibCount);

        for (int i = 0; i < 56; i++){
            assertEquals(expected[i], result[i]);
        }

    }

    @Test
    public void hour12Test() {
        vibCount[0] = 12; vibCount[1] = 0; vibCount[2] = 0;
        expected = new long[26];
        for (int i = 0; i<24; i++){
            if (i%2 == 0){
                expected[i] = 80;
            } else {
                expected[i] = 400;
            }
        }
        expected[24] = 1000; expected[25] = 0;

        result = VibrationMethods.vibPatternMaker(vibCount);
        for (int i = 0; i < 2; i++){
            assertEquals(expected[i], result[i]);
        }
    }
}
