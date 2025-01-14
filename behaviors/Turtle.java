package behaviors;
import inventory.FoodType;
import inventory.Inventory;

public class Turtle extends Inventory implements Eatable {
    @Override
    public FoodType foodType() {
        return FoodType.TURTLE_MEAT; // Тип еды
    }

    @Override
    public boolean isInfinite() {
        return false; // Конечный запас
    }

    public void eat() {
        System.out.println("Eating turtle meat..."); // Употребление яиц черепахи
    }
}