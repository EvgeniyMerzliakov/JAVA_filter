package org.geekbrains.sem_6.hw_1;

import java.util.*;

public class Laptops {

    int id;

    Map<String, String> parameters = new HashMap<>();

    public void fillingInformation(int serialID, String manufacturer, String model, String screenDiagonal,
                                   String color, String ram, String memoryCapacity, String oS, String processor){
        id = serialID;
        parameters.put("Manufacturer", manufacturer);
        parameters.put("Model", model);
        parameters.put("ScreenDiagonal", screenDiagonal);
        parameters.put("Color", color);
        parameters.put("RAM", ram);
        parameters.put("MemoryCapacity", memoryCapacity);
        parameters.put("OS", oS);
        parameters.put("Processor", processor);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (var elem : parameters.entrySet()) {
            result.append(String.format("%s: %s\n", elem.getKey(), elem.getValue()));
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object obj) {
        var elem = (Laptops) obj;
        return id == elem.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}





