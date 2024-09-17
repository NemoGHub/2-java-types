package com.example.task10;

import static java.lang.Float.*;
import static java.lang.System.out;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.

        if (isNaN(a) && isNaN(b)) return true;
        if (isNaN(a) || isNaN(b)) return false;
        if (a == POSITIVE_INFINITY && b == POSITIVE_INFINITY || a == NEGATIVE_INFINITY && b == NEGATIVE_INFINITY) return true;
        if (isInfinite(a) || isInfinite(b)) return false;

        return Math.abs(a - b) < (float) Math.pow(0.1, precision);


//        a = (float) Math.abs(a * Math.pow( 10, precision));
//        b = (float) Math.abs(b * Math.pow( 10, precision));
//        out.println("``````````````````````````````````````  " + a + " - " + b + " = " + (a-b));
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        out.println(result);

    }

}
