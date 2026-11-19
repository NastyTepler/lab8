package app;

import srp.OrderProcessor;
import srp.NotificationService;

import ocp.ShapeDrawer;
import ocp.Circle;
import ocp.Square;

import lsp.Car;
import lsp.Bicycle;

import isp.SimplePrinter;
import isp.MultiFunctionDevice;

import dip.Computer;
import dip.HardDrive;
import dip.SSD;

public class Main {
    public static void main(String[] args) {
        System.out.println(" 1. Принцип единственной ответственности (SRP) ");
        OrderProcessor orderProcessor = new OrderProcessor();
        NotificationService notificationService = new NotificationService();
        orderProcessor.processOrder();
        notificationService.sendNotification();

        System.out.println("\n 2. Принцип открытости/закрытости (OCP) ");
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.draw(new Circle());
        drawer.draw(new Square());

        System.out.println("\n 3. Принцип подстановки Барбары Лисков (LSP) ");
        Car car = new Car();
        car.startEngine();
        Bicycle bicycle = new Bicycle();
        bicycle.ride();

        System.out.println("\n 4. Принцип разделения интерфейсов (ISP) ");
        SimplePrinter printer = new SimplePrinter();
        printer.print();

        MultiFunctionDevice mfu = new MultiFunctionDevice();
        mfu.print();
        mfu.scan();

        System.out.println("\n 5. Принцип инверсии зависимостей (DIP) ");
        // Используем жесткий диск
        Computer pcWithHDD = new Computer(new HardDrive());
        pcWithHDD.saveToStorage();

        // Используем SSD (легко заменили реализацию, не меняя класс Computer)
        Computer pcWithSSD = new Computer(new SSD());
        pcWithSSD.saveToStorage();
    }
}