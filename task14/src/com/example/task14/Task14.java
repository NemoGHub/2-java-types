package com.example.task14;

import static java.lang.System.out;

public class Task14 {


    public static int reverse(int value) {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке
        String str = new StringBuilder(Integer.toString(value)).reverse().toString();
        // out.println(value + " -> " + str);
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = reverse(345);
        System.out.println(result);
        */
    }


}
