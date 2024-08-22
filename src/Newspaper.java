import java.util.List;

// Класс для газеты
public class Newspaper implements Publication {
    private String title;
    private String releaseDate;
    private List<String> headlines;

    public Newspaper(String title, String releaseDate, List<String> headlines) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.headlines = headlines;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public List<String> getHeadlines() {
        return headlines;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", headlines=" + headlines +
                '}';
    }
}

