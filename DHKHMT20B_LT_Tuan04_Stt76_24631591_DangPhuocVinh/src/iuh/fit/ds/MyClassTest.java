
package iuh.fit.ds;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyClassTest {

    @Test
    void testCase1_aEqualsZero() {
        MyClass mc = new MyClass();
        assertEquals(0, mc.foo(0, 1, 2, 3)); 
    }

    @Test
    void testCase2_aEqualsB() {
        MyClass mc = new MyClass();
        assertEquals(1, mc.foo(1, 1, 2, 3)); 
    }

    @Test
    void testCase3_cEqualsD() {
        MyClass mc = new MyClass();
        assertEquals(1, mc.foo(2, 3, 4, 4)); 
    }

    @Test
    void testCase4_NoConditionTrue() {
        MyClass mc = new MyClass();
        assertThrows(ArithmeticException.class,
                () -> mc.foo(1, 2, 3, 4)); 
    }

    @Test
    void testCase5_NegativeNumbers_aEqualsB() {
        MyClass mc = new MyClass();
        assertEquals(1, mc.foo(-5, -5, 7, 8)); 
    }

    @Test
    void testCase6_NegativeNumbers_cEqualsD() {
        MyClass mc = new MyClass();
        assertEquals(1, mc.foo(-3, 4, -9, -9)); 
    }

    @Test
    void testCase7_LargeNumbers() {
        MyClass mc = new MyClass();
        assertEquals(1, mc.foo(1000000, 1000000, 0, 1)); 
    }

    @Test
    void testCase8_AllEqual() {
        MyClass mc = new MyClass();
        assertEquals(1, mc.foo(5, 5, 5, 5)); 
    }

    @Test
    void testCase9_aZeroButOthersEqual() {
        MyClass mc = new MyClass();
        assertEquals(0, mc.foo(0, 0, 10, 10)); 
    }

    @Test
    void testCase10_AllDifferentNegatives() {
        MyClass mc = new MyClass();
        assertThrows(ArithmeticException.class,
                () -> mc.foo(-1, -2, -3, -4)); 
 
}
}
