package character;

import behaviors.Eatable; // Импортируем интерфейс Eatable
import environment.Environment;
import inventory.FoodNotAvailableException;
import inventory.Inventory; // Импортируем класс Inventory
import inventory.FoodType;
import java.util.Random;

public class Character {
    private final Inventory inventory; // Переименуем в inventory для ясности
    private final Environment weather;
    private EmotionalState emotionalState;
    private Cave cave;

    public Character(Environment weather, EmotionalState emotionalState, Cave cave) {
        this.inventory = new Inventory(); // Инициализация инвентаря
        this.weather = new Environment();
        this.emotionalState = emotionalState;
        this.cave = cave;
    }

    public void addFoodToInventory(Eatable food) { // Изменено на Eatable
        inventory.addFood(food.foodType(), food.isInfinite()); // Используем inventory
    }

    public HuntResult hunt(FoodType foodType) {
        if (weather.checkWeather() && foodType != FoodType.GOAT_MEAT) {
            return new HuntResult(foodType, false, "Cannot hunt due to rain."); // Невозможность охоты в дождь
        }

        boolean success = new Random().nextInt(100) >= 50; // 50% шанс успешной охоты
        if (success) {
            return new HuntResult(foodType, true, "Successful hunt for " + foodType + "."); // Успех охоты
        }
        return new HuntResult(foodType, false, "Failed to hunt " + foodType + "."); // Неудача охоты
    }

    public void eat(FoodType foodType) {
        try {
            inventory.useFood(foodType); // Употребление еды
            System.out.println("Ate some " + foodType + "."); // Сообщение о употреблении
        } catch (FoodNotAvailableException e) {
            System.out.println(e.getMessage()); // Сообщение об отсутствии еды
        }
    }

    public void checkSupplies() {
        System.out.println("Current supplies: " + inventory.listSupplies()); // Список запасов
    }

    public void evaluateSafety() {
        System.out.println("Safety evaluated: " + emotionalState.isSafe()); // Оценка состояния безопасности
    }

    public void expandCave(int amount) {
        cave.expand(amount); // Расширение пещеры на заданное количество
    }

    public void huntForTurtleMeat() {
        HuntResult result = hunt(FoodType.TURTLE_MEAT); // Охота на черепашье мясо
        System.out.println(result); // Вывод результата охоты
    }
}