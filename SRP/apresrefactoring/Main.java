public class Main {
    public static void main(String[] args) {
        BookSRP book = new BookSRP("Les principes SOLID", "Étudiants M1-GL", "Contenu...");
        
        BookPrinter printer = new BookPrinter();
        printer.printToScreen(book);
        
        BookSaver saver = new BookSaver();
        saver.saveToDatabase(book);
        
        BookBusinessLogic logic = new BookBusinessLogic();
        logic.emprunter(book, "Marcial");
    }
}