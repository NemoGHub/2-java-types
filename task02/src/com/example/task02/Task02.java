package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        /*
        В качестве аргумента функции передается строка, содержащая целое число.
        Определить самый наименьший целочисленный тип, к которому можно привести это число.
        */
        long value = Long.parseLong(input);
        if (value >= -128 && value <= 127) return "byte";
        else if (value >= -32_768 && value <= 32_767) return "short";
        else if (value >= -2_147_483_648 && value <= 2_147_483_647) return "int";
        else return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
