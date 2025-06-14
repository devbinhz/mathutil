package com.binh.util;

import com.binh.util.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        verifyFactorialGivenRightArg0RunsWell();
        verifyFactorialGivenRightArg1RunsWell();
        verifyFactorialGivenRightArg2RunsWell();
        verifyFactorialGivenRightArgRunsWell();
    }

    // Test case #3: VERIFY THE GETFACTORIAL() WITH N = 2;

    // Test case #4,5,6,...: VERIFY THE GETFACTORIAL() WITH N = 3, 4, 5, 6,..;

    public static void verifyFactorialGivenRightArgRunsWell(){

        // test là so sánh
        System.out.println("3! = expected: 6" + ", actual: " + MathUtility.getFactorial(3));
        System.out.println("4! = expected: 24" + ", actual: " + MathUtility.getFactorial(4));
        System.out.println("5! = expected: 120" + ", actual: " + MathUtility.getFactorial(5));
        System.out.println("6! = expected: 720" + ", actual: " + MathUtility.getFactorial(6));
    }

    public static void verifyFactorialGivenRightArg2RunsWell(){

        // test là so sánh
        System.out.println("2! = expected: 2" + ", actual: " + MathUtility.getFactorial(2));
    }



    // Test case #2: VERIFY THE GETFACTORIAL() WITH N = 1;

    public static void verifyFactorialGivenRightArg1RunsWell(){
        int n = 1;
        long expected = 1; // hy vọng 1 trả về nếu tính 1!
        long actual = MathUtility.getFactorial(n);
        // test là so sánh
        System.out.println("1! = expected: "+ expected + ", actual: " + actual);
    }

    // Test thử hàm tính giai thừa, gọi trong Main()
    // Muốn Test gì đó thì phải có test case!!!
    // Test case #1: VERIFY THE GETFACTORIAL() WITH N = 0;
    // Steps:
    //          Given n = 0
    //          Call getFactorial(n=0)
    // Expected result:
    //          the method must return 1 as the result of 0! = 1
    // Status: passed | failed phải chờ

    public static void verifyFactorialGivenRightArg0RunsWell(){
        int n = 0;
        long expected = 1; // hy vọng 1 trả về nếu
        long actual = MathUtility.getFactorial(n);
        // test là so sánh
        System.out.println("0! = expected: "+ expected + ", actual: " + actual);
    }

}
// ký thuật vừa gõ code, vừa gõ test case, vừa gõ test run, đc gọi là
// TDD ( đưa vào CV