package character;

public class Cave {
    private int size;

    public Cave() {
        this.size = 1; // Размер пещеры
    }

    public void expand(int amount) {
        size += amount; // Увеличиваем размер пещеры
        System.out.println("Cave expanded by " + amount + ". New size: " + size);
    }
}