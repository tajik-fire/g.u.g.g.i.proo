package environment;

import java.util.Random;

public class SunnyWeather extends Weather {

    public SunnyWeather() {
        super(false); // Устанавливаем состояние солнечной погоды по умолчанию
    }

    @Override
    public void changeWeather() {
        // Изменяем состояние на случайное значение
        isRaining = new Random().nextBoolean();
        System.out.println("Weather changed to Sunny. Rain: " + isRaining);
    }
}