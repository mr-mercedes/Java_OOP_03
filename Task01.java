package ru.geekbrains.oop03.homework;
/*
    1. Написать итератор, который будет выдавать N случайных целых чисел
 */
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Task01 implements Iterable<Integer> {
    private final int end;

    public Task01(int end) {
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Random random = new Random();
            private int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < end;
            }

            @Override
            public Integer next() {
                int rnd = random.nextInt(100);
                counter++;
                return rnd;
            }
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of numbers: ");
        int number = scanner.nextInt();
        Task01 iterator = new Task01(number);
        for (Integer integer : iterator) {
            System.out.println(integer);
        }
    }
}
