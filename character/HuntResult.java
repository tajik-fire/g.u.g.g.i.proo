package character;

import inventory.FoodType;

public class HuntResult {
    private final FoodType foodType;
    private final boolean success;
    private final String message;

    public HuntResult(FoodType foodType, boolean success, String message) {
        this.foodType = foodType;
        this.success = success;
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}