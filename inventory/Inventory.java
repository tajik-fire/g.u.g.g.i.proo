package inventory;

import behaviors.Eatable;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final List<InventoryItem> items = new ArrayList<>();

    public void addFood(FoodType foodType, boolean isInfinite) {
        for (InventoryItem item : items) {
            if (item.foodType() == foodType) {
                if (!item.isInfinite() && isInfinite) {
                    items.remove(item);
                    items.add(new InventoryItem(foodType, true)); // Обновляем запасы
                }
                return; // Если еда уже есть, выходим
            }
        }
        items.add(new InventoryItem(foodType, isInfinite)); // Добавляем новую еду
    }

    public boolean useFood(FoodType foodType) throws FoodNotAvailableException {
        for (InventoryItem item : items) {
            if (item.foodType() == foodType) {
                if (item.isInfinite()) {
                    return true; // Если еда бесконечная, используй ее
                }
                items.remove(item); // Убираем конечный запас
                return true;
            }
        }
        throw new FoodNotAvailableException("Food of type " + foodType + " is not available!"); // Исключение, если нет еды
    }

    public List<InventoryItem> listSupplies() {
        return new ArrayList<>(items); // Возвращает список запасов
    }

    public boolean checkFoodAvailability(FoodType foodType) {
        return items.stream().anyMatch(item -> item.foodType() == foodType); // Проверка наличия еды
    }
}