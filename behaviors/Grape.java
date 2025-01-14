package behaviors;
import inventory.FoodType;
public class Grape implements Eatable {
    @Override
    public FoodType foodType() {
        return FoodType.GRAPE; // Тип еды
    }

    @Override
    public boolean isInfinite() {
        return true; // Бесконечный запас
    }

    public void eat() {
        System.out.println("Eating grapes..."); // Употребление винограда
    }
}