package main;

import character.Character;
import character.EmotionalState;
import character.HuntResult;
import character.Cave;
import environment.Weather;
import inventory.FoodType;
import behaviors.Grape;
import behaviors.TurtleEgg;
import inventory.Inventory;
import environment.RainyWeather;
import environment.SunnyWeather;
import environment.Weather;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
//        Weather rainyWeather = new RainyWeather();
//        Weather sunnyWeather = new SunnyWeather();
        Weather weather =  new RainyWeather();
//        Weather weather = new Weather(false);
        EmotionalState emotionalState = new EmotionalState(true);
        Cave cave = new Cave();
        Character character = new Character(weather, emotionalState, cave);

        // Добавление еды в инвентарь
        character.addFoodToInventory(new Grape());
        character.addFoodToInventory(new TurtleEgg());

        // Симуляция дней
        Random random = new Random();
        for (int day = 14; day <= 26; day++) {
            System.out.println("Day " + day + ":");
            weather.changeWeather(); // Изменяем погоду
            if (day == 26) {
                character.huntForTurtleMeat(); // Охота на черепашье мясо
            }
            if (weather.checkWeather()) {
                System.out.println("It is raining. Staying inside...");
                character.expandCave(random.nextInt(3)); // Расширяем пещеру на 1 единицу в дождь
            } else {
                // Случайная охота на козлятину или черепашье мясо
                if (new Random().nextBoolean()) {
                    HuntResult result = character.hunt(FoodType.GOAT_MEAT); // Охота на козлятину
                    System.out.println(result); // Вывод результата охоты на козлятину
                }
            }
//            if (random.nextInt(2)) {
//
//            }
//            if (Inventory.checkFoodAvailability()) {
//                System.out.print("Hungry");
//            }
//            else {
//                System.out.print("YEAH, we have food");
//
//            }
            character.eat(FoodType.GRAPE); // Употребляем виноград
            character.eat(FoodType.GOAT_MEAT); // Употребляем виноград
            character.eat(FoodType.TURTLE_EGG); // Употребляем яйца черепахи
            character.checkSupplies(); // Проверка запасов
            character.evaluateSafety(); // Оценка безопасности

        }
    }
}