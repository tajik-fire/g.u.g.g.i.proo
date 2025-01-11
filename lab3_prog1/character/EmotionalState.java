package character;

public class EmotionalState {
    private boolean isSafe;

    public EmotionalState(boolean isSafe) {
        this.isSafe = isSafe; // Изначальное состояние безопасности
    }

    public boolean isSafe() {
        return isSafe; // Проверка, безопасно ли
    }

    public void setSafety(boolean isSafe) {
        this.isSafe = isSafe; // Установка состояния безопасности
    }
}