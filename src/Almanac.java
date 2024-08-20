import java.util.List;

// Класс для альманаха
public class Almanac implements Publication {
    private String title;
    private List<Book> books;

    public Almanac(String title, List<Book> books) {
        this.title = title;
        this.books = books;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Almanac{" +
                "title='" + title + '\'' +
                ", books=" + books +
                '}';
    }
}

