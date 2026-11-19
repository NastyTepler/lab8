package isp;

public class SimplePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("[ISP] Обычный принтер: печать документа");
    }
}