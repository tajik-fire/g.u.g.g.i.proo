package behaviors;
import inventory.FoodType;
public class TurtleEgg implements Eatable {
    @Override
    public FoodType foodType() {
        return FoodType.TURTLE_EGG; // Тип еды
    }

    @Override
    public boolean isInfinite() {
        return true; // Конечный запас
    }

    public void eat() {
        System.out.println("Eating turtle eggs..."); // Употребление яиц черепахи
    }
}