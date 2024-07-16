package org.geekbrains.sem_6.hw_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LaptopLists db = new LaptopLists();
        db.populateLaptops();
        userInterface(db);
    }

    public static void userInterface(LaptopLists db) {
        Map<String, String> answer = new HashMap<>();
        int command;
        String parameter = "";
        Scanner scanCommand = new Scanner(System.in);
        Scanner scanParameter = new Scanner(System.in);
        boolean flagGlobal = true;
        boolean flagInner = true;

        while (flagGlobal) {
            while (flagInner) {
                System.out.println("""
                        Выберите характеристику/характеристики для поиска:\s
                        1 - Операционная система (Windows (10 или 11), Linux, macOS)
                        2 - Цвет ноутбука
                        3 - Диагональ экрана
                        4 - Объем ОЗУ
                        5 - Объем SSD
                        6 - Модель процессора
                        7 - Завершить выбор и вывести список ноутбуков""");

                command = scanCommand.nextInt();

                if (command == 1) {
                    System.out.println("Введите название операционной системы: ");
                    parameter = scanParameter.nextLine();
                    answer.put("OS", parameter);
                } else if (command == 2) {
                    System.out.println("Введите цвет: ");
                    parameter = scanParameter.nextLine();
                    answer.put("Color", parameter);
                } else if (command == 3) {
                    System.out.println("Введите диагональ в дюймах: ");
                    parameter = scanParameter.nextLine();
                    answer.put("ScreenDiagonal", parameter);
                } else if (command == 4) {
                    System.out.println("Введите объем ОЗУ: ");
                    parameter = scanParameter.nextLine();
                    answer.put("RAM", parameter);
                } else if (command == 5) {
                    System.out.println("Введите объем SSD: ");
                    parameter = scanParameter.nextLine();
                    answer.put("MemoryCapacity", parameter);
                } else if (command == 6) {
                    System.out.println("Введите модель процессора: ");
                    parameter = scanParameter.nextLine();
                    answer.put("Processor", parameter);
                } else {
                    if (answer.isEmpty()) {
                        System.out.println("Не введено ни одного параметра для поиска");
                    } else {
                        db.outputLaptopsSet(db.filteringLaptopsSet(answer));
                    }
                    flagInner = false;
                }
            }
            System.out.println("""
                    Повторить ввод параметров и поиск?
                    1 - Да
                    2 - Нет (завершить программу)""");
            command = scanCommand.nextInt();
            if (command == 1) {
                flagInner = true;
            } else if (command == 2) {
                flagGlobal = false;
            }
        }
        scanCommand.close();
        scanParameter.close();
    }
}
