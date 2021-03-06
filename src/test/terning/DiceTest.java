package test.terning;

import org.junit.Test;
import terning.Dice;

import static org.junit.Assert.*;

/**
 * Created by twast on 26/09/2016.
 */
public class DiceTest {
    Dice dn = new Dice();

    @Test
    public void roll() throws Exception {
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, total = 0;
        for (int i = 0; i < 60000; i++) {
            int num = dn.roll();

            switch (num) {
                case 1:
                    count1 += 1;
                    total += 1;
                    break;
                case 2:
                    count2 += 1;
                    total += 1;
                    break;
                case 3:
                    count3 += 1;
                    total += 1;
                    break;
                case 4:
                    count4 += 1;
                    total += 1;
                    break;
                case 5:
                    count5 += 1;
                    total += 1;
                    break;
                case 6:
                    count6 += 1;
                    total += 1;
                    break;
            }
        }
        System.out.println("count1: "+ count1 + "\ncount2:" + count2 + "\ncount3:" + count3 + "\ncount4:" + count4 + "\ncount5:" + count5 + "\ncount6:" + count6 + "\ntotal:" + total);
        assertEquals(60000, total, 0);      // Tests whether total dice rolls equals 60000.
        assertEquals(10000, count1, 400);   // Tests if count1 is 10000 ± 400
        assertEquals(10000, count2, 400);   // Tests if count2 is 10000 ± 400
        assertEquals(10000, count3, 400);   // Tests if count3 is 10000 ± 400
        assertEquals(10000, count4, 400);   // Tests if count4 is 10000 ± 400
        assertEquals(10000, count5, 400);   // Tests if count5 is 10000 ± 400
        assertEquals(10000, count6, 400);   // Tests if count6 is 10000 ± 400
    }
}