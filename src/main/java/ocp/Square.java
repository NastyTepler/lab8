package ocp;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("[OCP] Рисование квадрата");
    }
}
