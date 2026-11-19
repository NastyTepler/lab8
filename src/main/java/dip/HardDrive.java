package dip;

public class HardDrive implements Storage {
    @Override
    public void saveData() {
        System.out.println("[DIP] Сохранение данных на жесткий диск...");
    }
}