public class NewLinesPrinter extends Printer {
    @Override
    void print(String[] text) {
        for (String s : text) System.out.println(s);
    }
}
