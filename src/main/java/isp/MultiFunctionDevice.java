package isp;

public class MultiFunctionDevice implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("[ISP] МФУ: печать документа");
    }

    @Override
    public void scan() {
        System.out.println("[ISP] МФУ: сканирование документа");
    }
}