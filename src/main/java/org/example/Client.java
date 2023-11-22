package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        final String sensorName = "Sensor 111.01.0001";

        registerSensor(sensorName);

        Random random = new Random();
    }

    private static void registerSensor(String sensorName) {
        final String url = "http://localhost:8080/sensor/registration";

        Map<String,Object> jsonData= new HashMap<>();
    }
}
