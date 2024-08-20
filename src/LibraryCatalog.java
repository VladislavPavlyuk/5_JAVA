import java.util.ArrayList;
import java.util.List;

// Класс каталога
public class LibraryCatalog {
    private List<Publication> catalog;

    public LibraryCatalog() {
        this.catalog = new ArrayList<>();
    }

    public void addPublication(Publication publication) {
        catalog.add(publication);
    }

    public void displayCatalog() {
        for (Publication publication : catalog) {
            System.out.println(publication);
        }
    }

    public Publication searchByTitle(String title) {
        for (Publication publication : catalog) {
            if (publication.getTitle().equalsIgnoreCase(title)) {
                return publication;
            }
        }
        return null;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Publication publication : catalog) {
            if (publication instanceof Book) {
                Book book = (Book) publication;
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    booksByAuthor.add(book);
                }
            }
        }
        return booksByAuthor;
    }
}
