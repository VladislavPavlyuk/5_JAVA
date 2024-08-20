/*
Практика на наследование и полиморфизм.
Разработать приложение «Каталог библиотеки».
В библиотеке могут храниться
- книги, газеты и альманахи (сборники произведений нескольких авторов).
Для книги у нас должен быть
- автор книги,
- название книги,
- жанр,
- количество страниц.
Для газеты должно быть
- название газеты,
- дата выхода номера газеты,
- перечень основных заголовков газеты.
Для альманаха должно быть
- название альманаха и
- перечень произведений (книг), которые в нем напечатаны.
Разработать интерфейсный класс с необходимым перечнем виртуальных абстрактных методов.
Для каталога предусмотреть
- возможность тестовой инициализации,
- вывода всего каталога на экран,
- поиск по названию книги или газеты,
- поиск по автору.
*/

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        // Тестовая инициализация

        catalog.addPublication(new Book("Leo Tolstoy", "Anna Karenina", "Drama", 300));
        catalog.addPublication(new Book("Feodor Dostoevsky","Crime and punishment","Drama", 200));
        catalog.addPublication(new Newspaper("The Times", "2024-08-20", List.of("Economics", "Environment")));
        catalog.addPublication(new Newspaper("Independent", "2024-08-19", List.of("Economics", "Environment")));
        catalog.addPublication(new Almanac("NewAlmanac", List.of(new Book("Chekhov", "Stories", "Drama", 150))));
        catalog.addPublication(new Almanac("NewAlmanac", List.of(new Book("Vladimir Nabokov", "Lolita", "Drama", 250))));

        // Вывод всего каталога на экран
        catalog.displayCatalog();
        System.out.println();

        // Поиск по названию
        System.out.println("Search by title 'Anna Karenina': " + catalog.searchByTitle("Anna Karenina"));

        System.out.println("Search by title 'The Times': " + catalog.searchByTitle("The Times"));

        System.out.println("Search by title 'NewAlmanac': " + catalog.searchByTitle("NewAlmanac"));

        // Поиск по автору
        System.out.println("Search by author 'Feodor Dostoevsky': " + catalog.searchByAuthor("Feodor Dostoevsky"));


    }
}
