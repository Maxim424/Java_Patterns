public class SpacePrinter extends Printer {
    @Override
    void print(String[] text) {
        for (String s : text) System.out.print(s + " ");
    }
}
