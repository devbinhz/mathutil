package com.binh.util.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    // Chuan bị bộ data để riêng -- DD -- Data Driven
    // Lát hồi Fill vào hàm so sánh -- T -- Testing
    // Fill vào qua tham số hàm - hàm làm việc với nhiều data
    // DDT còn gọi tên khác: PARAMETERIZED TESTING -> kiểm thử theo kểu tham số hóa

    // Bộ data: nằm trong hàm static - tĩnh 1 chỗ để các nơi vào lấy
    // Bộ data: thường là mảng 2 chiều, giá trị đầu vào và giá trị kì vọng
    public static Object[][] initData(){
        return new Object[][]{{0, 1},
                              {1, 1},
                              {2, 2},
                              {3, 6},
                              {4, 24},
                              {5, 120},
                              {6, 720}};
                            //n    expected
    }


    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgsRunWell(int n, long expected){

        assertEquals(expected, MathUtility.getFactorial(n));
    }

}