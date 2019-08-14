package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cat ourcat = new Cat();
        ourcat.eat();
        ourcat.sleep();

        String say = ourcat.speak("Play with me");
        System.out.println(say);


//        int a = 0,b=1;
//        if (a == b)
//            System.out.println("a и b равны!");
//        else
//            System.out.println("a и b не равны!");


        int day = 3;
        String dayString;
        switch (day) {
            case 1:
                dayString = "Понедельник";
                break;
            case 2:
                dayString = "Вторник";
                break;
            case 3:
                dayString = "Среда";
                break;
            case 4:
                dayString = "Четверг";
                break;
            case 5:
                dayString = "Пятница";
                break;
            case 6:
                dayString = "Суббота";
                break;
            case 7:
                dayString = "Воскресенье";
                break;
            default:
                dayString = "Ошибка";
                break;
        }
        System.out.println(dayString);

       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца:");
        int month = scanner.nextInt();
        String res;
        switch (month) {
            case 1:
                res="Qish, Yanvar oyi";
            case 2:
            case 12:
                res = "Зима";
                break;
            case 3:
            case 4:
                res="Bahor, Aprel oyi";
                break;
            case 5:
                res = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                res = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                res = "Осень";
                break;
            default:
                res = "Нет такого месяца!";
        }

        System.out.println(res);

        */

       Scanner kiritilgan= new Scanner(System.in);
        System.out.println("raqam kiriting");
        int raqam= kiritilgan.nextInt();
        int natija=0;
        for (int sanoq=1; sanoq<=raqam; sanoq++)
        natija+=sanoq;
        System.out.printf("1 dan %d gacha bolgan raqamlar igindisi: %d ", raqam,natija);




    }


}
