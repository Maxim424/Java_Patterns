public class Main {
    public static void main(String[] args) {
        String[] text = {"Hello", "world"};
        Printer printer = new NewLinesPrinter();
        printer.print(text);

        printer = new SpacePrinter();
        printer.print(text);
    }
}