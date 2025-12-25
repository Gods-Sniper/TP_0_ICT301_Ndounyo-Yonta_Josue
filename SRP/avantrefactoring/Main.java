public class Main {
    public static void main(String[] args) {
        Book book = new Book("Les principes SOLID", "Étudiants M1-GL", "Contenu du livre...");
        book.printToScreen();
        book.saveToDatabase();
        book.emprunter("Marcial");
    }
}