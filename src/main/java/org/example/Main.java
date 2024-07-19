/*
package org.example;

public class Main {

    public static void doA() {
        for (int i = 0; i <= 500; i++) {
            System.out.println(Thread.currentThread().getName() + "i = " + i);
        }
    }

    public static void doB() {
        System.out.println("start...................");
        try {//1초 쉬게 하는 코드
            //1초동안 CPU를 점유하지 않겠다.
            //우선순위를 제어할 순 있지만 동일한우선순위에서는 제어할 수 없다.
            //https로 빼놨다 ? 모두가 접속할 수 있다.

            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("end........................................" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        //4번 돌렸으니까 for문으로 사용가능
        for (int i = 0; i < 4; i++) {
            doB();
            //new Thread(() -> doA()).start();  //람다식
            //쓰레드를 객체로 만들지 마라고했는데 new라는 객체로 만들었는데
            //결과값이 일정하지않음
        }
        System.out.println("The End");
    }
}*/
package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public  static void doA() {
        for (int i = 1; i <= 500; i++) {
            System.out.println(Thread.currentThread().getName() + "  i = " + i);
        }
    }

    public static void doB(){

        System.out.println("start..................." + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        }catch(Exception e){}
        System.out.println("end.................." + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        for (int i = 0; i < 4; i++) {
            new Thread(() -> doB()).start();
        }//end for

        System.out.println("THE END");

    }
}