import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


@SuppressWarnings("SpellCheckingInspection")
class BufferTest {

    static int[] iarr = null;
    static String[] sarr = null;
    static double[] darr = null;
    static Lifo<Integer> lifoi1 = null;
    static Lifo<String> lifos1 = null;
    static Lifo<Double> lifod1 = null;
    static Fifo<Integer> fifoi1 = null;
    static Fifo<String> fifos1 = null;
    static Fifo<Double> fifod1 = null;

    @BeforeEach
    void setUp(){
        iarr = new int[] {1,2,3,4,5};
        sarr = new String[] {"eins","zwei","drei","vier","fuenf"};
        darr = new double[] {1.0,2.0,3.0,4.0,5.0};
        lifoi1 = new Lifo<Integer>(5);
        lifos1 = new Lifo<String>(5);
        lifod1 = new Lifo<Double>(5);
        fifoi1 = new Fifo<Integer>(5);
        fifos1 = new Fifo<String>(5);
        fifod1 = new Fifo<Double>(5);
    }

    @AfterEach
    void tearDown() {
        iarr = null;
        sarr = null;
        darr = null;
    }

    @Test
    void lifopushpoptest() {

        for(int i=0;i<5;i++) {
            lifoi1.push(iarr[i]);
        }
        for(int i=1;i<5;i++) {
            assertEquals(lifoi1.pop(),iarr[iarr.length-i]);
        }

        for(int i=0;i<5;i++) {
            lifos1.push(sarr[i]);
        }
        for(int i=1;i<5;i++) {
            assertEquals(lifos1.pop(),sarr[sarr.length-i]);
        }

        for(int i=0;i<5;i++) {
            lifod1.push(darr[i]);
        }
        for(int i=1;i<5;i++) {
            assertEquals(lifod1.pop(),darr[darr.length-i]);
        }

    }

    @Test
    void fifopushpoptest() {

        for(int i=0;i<5;i++) {
            fifoi1.push(iarr[i]);
        }
        for(int i=0;i<5;i++) {
            assertEquals(fifoi1.pop(),iarr[i]);
        }

        for(int i=0;i<5;i++) {
            fifos1.push(sarr[i]);
        }
        for(int i=0;i<5;i++) {
            assertEquals(fifos1.pop(),sarr[i]);
        }

        for(int i=0;i<5;i++) {
            fifod1.push(darr[i]);
        }
        for(int i=0;i<5;i++) {
            assertEquals(fifod1.pop(),darr[i]);
        }

    }


    @Test
    void capacity() {
       assertEquals(lifoi1.capacity(),5);
       assertEquals(lifoi1.size(),0);
       lifoi1.push(5);
        assertEquals(lifoi1.capacity(),5);
        assertEquals(lifoi1.size(),1);
    }
}