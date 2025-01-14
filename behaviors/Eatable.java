package behaviors;
import inventory.FoodType;
public interface Eatable {
    FoodType foodType(); // Получение типа еды
    boolean isInfinite(); // Проверка на бесконечность
}