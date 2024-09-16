package com.example.task10;

import static java.lang.Float.isNaN;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        a = (float) (Math.round(a * Math.pow( 10, precision)) / Math.pow( 10, precision));
        b = (float) (Math.round(b * Math.pow( 10, precision)) / Math.pow( 10, precision));

        boolean result = (a == b);
        if (isNaN(a) && isNaN(b)) result = true;

        return result;

    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }

}
