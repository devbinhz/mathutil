package com.binh.util.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test
    public void verifyFactorialGivenRightArg3RunsWell() {
        assertEquals(6, MathUtility.getFactorial(3));
    }
    @Test
    public void verifyFactorialGivenRightArg2RunsWell() {
        assertEquals(2, MathUtility.getFactorial(2));
    }

    @Test
    public void verifyFactorialGivenRightArg1RunsWell() {
        assertEquals(1, MathUtility.getFactorial(1));
    }
    @Test // tương đương hàm main(), code trong phần này sẽ run trong hàm main()
    // biến mỗi test case thành test run, thành main() để chạy
    public void verifyFactorialGivenRightArg0RunsWell() {
        assertEquals(1, MathUtility.getFactorial(0));
    }
}