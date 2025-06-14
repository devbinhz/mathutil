package com.binh.util.mathutil.core;

public class MathUtility {
    // class này dùng để mô phỏng các hàm tính toán, toán học
    // bắt trc class math. trong JDK
    // vì những tính toán này, tính xong rồi trả ra, ko cần lưu trữ lại
    // do đó ta thiết kế nó dạng static


    // ta làm hàm tính N! = 1,2,3,4,5,....N
    // quy ước:
    //0! = 1 ( của bên toán học)
    public static long getFactorial(int n){
        if (n < 0 || n > 20){
            throw new IllegalArgumentException("n must be between 0 and 20");
            // nếu đưa data n cà chớn, ném ra ngoại lệ, ném câu thông báo, ko có giá trị trả về
        }
        if (n == 0) {
            return 1;
        }

        // cpu chạy đc đến đây tức là n = 1, 2, 3, ..., 19, 20
        // tính n! = 1.2.3.4...thuật toán con heo đất, ốc bu nhồi thịt, nhân dồn, cộng dồn tích lũy
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
