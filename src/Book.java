// Класс для книги
public class Book implements Publication {
    private String author;
    private String title;
    private String genre;
    private int pageCount;

    public Book(String author, String title, String genre, int pageCount) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}
