package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {
        /*
        Метод на вход принимает количество сантиметров.
        Нужно сделать так, чтобы метод возвращал число полных метров в centimetre. (1 метр = 100 см).
        */
        return centimetre/100;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = getMetreFromCentimetre(345);
        System.out.println(result);
        */
    }

}
