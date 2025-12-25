public class BookBusinessLogic {
    public void emprunter(BookSRP book, String lecteur) {
        System.out.println("Emprunt du livre " + book.getTitle() + " par " + lecteur);
    }
}