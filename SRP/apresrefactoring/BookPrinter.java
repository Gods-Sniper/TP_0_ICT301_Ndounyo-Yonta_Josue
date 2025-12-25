public class BookPrinter {
    public void printToScreen(BookSRP book) {
        System.out.println("=== Affichage à l'écran ===");
        System.out.println("Titre: " + book.getTitle());
        System.out.println("Auteur: " + book.getAuthor());
        System.out.println("Contenu: " + book.getContent());
    }

    public void printToHTML(BookSRP book) {
        System.out.println("<h1>" + book.getTitle() + "</h1>");
        System.out.println("<p>" + book.getContent() + "</p>");
    }
}