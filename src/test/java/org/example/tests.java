package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class tests {
    @Test
    void testMethod1() {
        One one = new One();
        one.res(5);
        assertEquals(one.getX(),5);
    }

    @Test
    void testMethod2() {
        One one = new One();
        one.res(0);
        assertEquals(one.getY(),5.691994551479412);
    }

    @Test
    void testMethod3() {
        One one = new One();
        one.res(0);
        assertFalse(one.resIn());
    }

    @Test
    void testMethod4() {
        Two two = new Two();
        assertEquals(two.res(5),1.4526784E7);
    }

    @Test
    void testMethod5() {
        Two two = new Two();
        assertEquals(two.res(-2),1.4350444756099092);
    }

}
