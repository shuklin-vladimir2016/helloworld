import java.util.Objects;

class Book {
    private String title;
    private Author author;
    private int publicationYear;
    // Конструктор
    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    // Геттеры
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    // Сеттер года публикации
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Книга: " + title + " Автор: " + author + " Год: " + publicationYear;

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Book book)) return false;
        Book other = (Book) object;
        return this.title.equals(other.title) && this.author.equals(other.author) && this.publicationYear == other.publicationYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}
