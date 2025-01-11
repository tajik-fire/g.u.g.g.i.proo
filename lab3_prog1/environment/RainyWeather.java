package environment;

import java.util.Random;

public class RainyWeather extends Weather {

    public RainyWeather() {
        super(true); // Устанавливаем состояние дождя по умолчанию
    }   

    @Override
    public void changeWeather() {
        // Изменяем состояние на случайное значение
        isRaining = new Random().nextBoolean();
        System.out.println("Weather changed to Rainy. Rain: " + isRaining);
    }
}