package inventory;

public class FoodNotAvailableException extends Exception {
    public FoodNotAvailableException(String message) {
        super(message); // Передача сообщения в исключение
    }
}