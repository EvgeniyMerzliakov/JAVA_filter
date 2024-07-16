package org.geekbrains.sem_6.hw_1;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LaptopLists {
    Set<Laptops> laptopsSet = new HashSet<>();

    public void populateLaptops() {
        Laptops laptop1 = new Laptops();
        laptop1.fillingInformation(1, "Dell", "G5 15", "15", "Black", "16", "512", "Windows 10", "Intel Core i7");
        laptopsSet.add(laptop1);

        Laptops laptop2 = new Laptops();
        laptop2.fillingInformation(2, "Dell", "Inspiron 14", "14", "White", "8", "256", "Windows 11", "Intel Core i3");
        laptopsSet.add(laptop2);

        Laptops laptop3 = new Laptops();
        laptop3.fillingInformation(3, "Dell", "Latitude 7420", "14", "Titan Gray", "16", "512", "Windows 10", "Intel Core i7");
        laptopsSet.add(laptop3);

        Laptops laptop4 = new Laptops();
        laptop4.fillingInformation(4, "Dell", "XPS 13", "13.4", "Platinum Silver", "16", "512", "Windows 10", "Intel Core i7");
        laptopsSet.add(laptop4);

        Laptops laptop5 = new Laptops();
        laptop5.fillingInformation(5, "Dell", "Alienware m15", "15.6", "Lunar Light", "32", "1024", "Windows 11", "Intel Core i9");
        laptopsSet.add(laptop5);

        Laptops laptop6 = new Laptops();
        laptop6.fillingInformation(6, "Lenovo", "ThinkPad X1 Carbon", "14", "Black", "16", "512", "Linux", "Intel Core i7");
        laptopsSet.add(laptop6);

        Laptops laptop7 = new Laptops();
        laptop7.fillingInformation(7, "HP", "Envy 13", "13.3", "Silver", "16", "512", "Linux", "Intel Core i7");
        laptopsSet.add(laptop7);

        Laptops laptop8 = new Laptops();
        laptop8.fillingInformation(8, "Asus", "Zenbook 14", "14", "Silver", "16", "512", "Linux", "Intel Core i5");
        laptopsSet.add(laptop8);

        Laptops laptop9 = new Laptops();
        laptop9.fillingInformation(9, "Acer", "Swift 3", "14", "Blue", "8", "256", "Linux", "Intel Core i5");
        laptopsSet.add(laptop9);

        Laptops laptop10 = new Laptops();
        laptop10.fillingInformation(10, "HP", "Pavilion x360", "14", "Silver", "16", "512", "Linux", "Intel Core i5");
        laptopsSet.add(laptop10);

        Laptops laptop11 = new Laptops();
        laptop11.fillingInformation(11, "Lenovo", "Yoga C940", "14", "Iron Gray", "16", "512", "Linux", "Intel Core i7");
        laptopsSet.add(laptop11);

        Laptops laptop12 = new Laptops();
        laptop12.fillingInformation(12, "Apple", "MacBook Air", "13.3", "Gold", "8", "256", "macOS", "Apple M1");
        laptopsSet.add(laptop12);

        Laptops laptop13 = new Laptops();
        laptop13.fillingInformation(13, "Apple", "MacBook Pro", "14", "Space Gray", "16", "512", "macOS", "Apple M1");
        laptopsSet.add(laptop13);

        Laptops laptop14 = new Laptops();
        laptop14.fillingInformation(14, "Apple", "MacBook Pro", "16", "Silver", "32", "1024", "macOS", "Apple M1");
        laptopsSet.add(laptop14);

        Laptops laptop15 = new Laptops();
        laptop15.fillingInformation(15, "Apple", "MacBook Air", "13.3", "Silver", "16", "512", "macOS", "Apple M2");
        laptopsSet.add(laptop15);

        Laptops laptop16 = new Laptops();
        laptop16.fillingInformation(16, "Apple", "MacBook Pro", "14", "Space Gray", "16", "1024", "macOS", "Apple M2");
        laptopsSet.add(laptop16);

        Laptops laptop17 = new Laptops();
        laptop17.fillingInformation(17, "HP", "Pavilion 15", "14", "Silver", "8", "256", "Windows 11", "Intel Core i5");
        laptopsSet.add(laptop17);

        Laptops laptop18 = new Laptops();
        laptop18.fillingInformation(18, "Lenovo", "Legion 5", "17", "Black", "32", "1024", "Windows 10", "AMD Ryzen 7");
        laptopsSet.add(laptop18);

        Laptops laptop19 = new Laptops();
        laptop19.fillingInformation(19, "Acer", "Aspire 5", "15.6", "Blue", "12", "512", "Windows 10", "Intel Core i5");
        laptopsSet.add(laptop19);

        Laptops laptop20 = new Laptops();
        laptop20.fillingInformation(20, "Asus", "ROG Zephyrus G14", "14", "Gray", "24", "1024", "Windows 11", "AMD Ryzen 9");
        laptopsSet.add(laptop20);

        Laptops laptop21 = new Laptops();
        laptop21.fillingInformation(21, "Lenovo", "IdeaPad Gaming 3", "15.6", "Black", "16", "512", "Windows 10", "AMD Ryzen 5");
        laptopsSet.add(laptop21);

        Laptops laptop22 = new Laptops();
        laptop22.fillingInformation(22, "Acer", "Predator Helios 300", "15.6", "Black", "32", "1024", "Windows 10", "Intel Core i9");
        laptopsSet.add(laptop22);

        Laptops laptop23 = new Laptops();
        laptop23.fillingInformation(23, "Asus", "Vivobook 15", "15.6", "Gray", "8", "256", "Windows 11", "Intel Core i5");
        laptopsSet.add(laptop23);

        Laptops laptop24 = new Laptops();
        laptop24.fillingInformation(24, "HP", "Spectre x360", "13.3", "Poseidon Blue", "16", "512", "Windows 11", "Intel Core i7");
        laptopsSet.add(laptop24);

        Laptops laptop25 = new Laptops();
        laptop25.fillingInformation(25, "Dell", "G7 17", "17.3", "Black", "32", "1024", "Windows 10", "Intel Core i9");
        laptopsSet.add(laptop25);

        Laptops laptop26 = new Laptops();
        laptop26.fillingInformation(26, "Lenovo", "Legion Y740", "17.3", "Black", "32", "1024", "Windows 10", "Intel Core i9");
        laptopsSet.add(laptop26);

        Laptops laptop27 = new Laptops();
        laptop27.fillingInformation(27, "Asus", "TUF Gaming A15", "15.6", "Gray", "24", "1024", "Windows 11", "AMD Ryzen 7");
        laptopsSet.add(laptop27);

        Laptops laptop28 = new Laptops();
        laptop28.fillingInformation(28, "Lenovo", "Legion 7i", "15.6", "Slate Grey", "32", "1024", "Windows 11", "Intel Core i9");
        laptopsSet.add(laptop28);

        Laptops laptop29 = new Laptops();
        laptop29.fillingInformation(29, "HP", "OMEN 17", "17.3", "Shadow Black", "32", "1024", "Windows 10", "Intel Core i9");
        laptopsSet.add(laptop29);

        Laptops laptop30 = new Laptops();
        laptop30.fillingInformation(30, "Acer", "Spin 5", "13.5", "Steel Gray", "16", "512", "Linux", "Intel Core i7");
        laptopsSet.add(laptop30);

        Laptops laptop31 = new Laptops();
        laptop31.fillingInformation(31, "HP", "Spectre x360", "13.3", "Silver", "16", "512", "Linux", "Intel Core i7");
        laptopsSet.add(laptop31);
    }

    public void outputLaptopsSet(Set<Laptops> laptopsSet) {
        for (Laptops elem : laptopsSet) {
            System.out.println(elem);
        }
    }

    public Set<Laptops> filteringLaptopsSet(Map<String, String> answer) {
        Set<Laptops> filteredDatabase = new HashSet<>();

        boolean flag = true;

        for (Laptops elem : laptopsSet) {
            for (var mapElem : answer.entrySet()) {
                try {
                    double num = Double.parseDouble(mapElem.getValue());
                    double num1 = Double.parseDouble(elem.parameters.get(mapElem.getKey()));
                    if (num > num1) {
                        flag = false;
                    }
                } catch (NumberFormatException e) {
                    if (!mapElem.getValue().equalsIgnoreCase(elem.parameters.get(mapElem.getKey()))) {
                        flag = false;
                    }
                }
            }
            if (flag) {
                filteredDatabase.add(elem);
            }
            flag = true;
        }
        return filteredDatabase;
    }
}