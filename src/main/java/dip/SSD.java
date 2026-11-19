package dip;

public class SSD implements Storage {
    @Override
    public void saveData() {
        System.out.println("[DIP] Сохранение данных на быстрый SSD...");
    }
}