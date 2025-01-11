package environment;

public abstract class Weather {
    protected boolean isRaining;

     Weather(boolean isRaining) {
        this.isRaining = isRaining; // Устанавливаем исходное состояние
    }

    public boolean checkWeather() {
        return isRaining; // Проверка дождя
    }

    public abstract void changeWeather(); // Метод для изменения погоды
}