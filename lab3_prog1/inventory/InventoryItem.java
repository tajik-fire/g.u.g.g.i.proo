package inventory;

import java.util.Objects;

public record InventoryItem(FoodType foodType, boolean isInfinite){
    @Override
    public String toString() {
        return foodType + (isInfinite ? " (infinite)" : " (finite)"); // Форматированный вывод
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InventoryItem that)) return false;
        return isInfinite == that.isInfinite && foodType == that.foodType; // Сравнение объектов
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodType, isInfinite); // Генерация хэш-кода
    }
}