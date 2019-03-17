package com.study;

/**
 * @ClassName Test
 * @Description TODO
 * @Auther 靓仔
 * @Date 2018/12/22 9:49
 **/
public class Test {
    private static boolean ready;
    private static int number;
    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            while(!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }
    public static void main(String[] args) {
        System.out.println(ready);
        /*new ReaderThread().start();
        number = 42;
        ready = true;*/
    }
}
