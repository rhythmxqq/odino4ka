package com.company;

import java.util.Scanner;

public class Main {
    /*
    Задание на 18 работу. Создать класс,
     который выводит значение выражения 2*х+3/y.
     Создать можно только один объект данного класса
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите x");
        double x = in.nextDouble();
        System.out.println("введите x");
        double y = in.nextDouble();
	Singleton qq = new Singleton();
    qq.prim(x,y);
    }
    public static final class Singleton {
        private static Singleton _instance = null;
private double x;
        private double y;
        private Singleton() {
            this.x= 11;
            this.y=12;
        }

        public synchronized Singleton getInstance() {
            if (_instance == null)
                _instance = new Singleton();
            return _instance;
        }
        public void prim(double x,double y){
            double resault = (2*x+3)/y;
            System.out.println("ваш результат: " + resault);
        }
    }

}
