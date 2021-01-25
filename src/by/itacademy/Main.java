package by.itacademy;

import by.itacademy.builder.Good;
import by.itacademy.singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        //Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton1.setName("Bill");
        singleton2.setName("Fill");
        System.out.println(singleton1);
        System.out.println(singleton2);

        //Builder можно использовать вместо set'ов, намного удобнее чем много set'ов, либо что бы не пергружать конструктор.
        Good good = new Good.Builder(1,2)
                .d(3)
                .c(4)
                .e(5)
                .build();
        System.out.println(good);


    }
}
