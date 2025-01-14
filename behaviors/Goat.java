package behaviors;
import inventory.FoodType;
public class Goat implements Eatable {
    @Override
    public FoodType foodType() {
        return FoodType.GOAT_MEAT; // Тип еды
    }

    @Override
    public boolean isInfinite() {
        return false; // Конечный запас
    }

    public void eat() {
        System.out.println("Eating goat meat..."); // Употребление козлятины
    }
}