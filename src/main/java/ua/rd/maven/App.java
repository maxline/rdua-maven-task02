package ua.rd.maven;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Printer printer = new Printer();

        for (String arg : args) {
            System.out.println(printer.print(Integer.valueOf(arg)));
        }
    }
}
