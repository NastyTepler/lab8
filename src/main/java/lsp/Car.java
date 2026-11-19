package lsp;

public class Car implements EngineVehicle {
    @Override
    public void startEngine() {
        System.out.println("[LSP] Запуск двигателя автомобиля...");
    }
}