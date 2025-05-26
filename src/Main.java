public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Richard", "Bachman");
        Author author2 = new Author("Ernest", "Hemingway");

        Book book1 = new Book("Rage", author1, 1977);
        Book book2 = new Book("The old Man and the sea", author2, 1952);

        System.out.println("Title: " + book1.getTitle() + ", Author: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Year: " + book1.getPublicationYear());
        System.out.println("Title: " + book2.getTitle() + ", Author: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", Year: " + book2.getPublicationYear());

        book1.setPublicationYear(1997);
        System.out.println("Updated Year of Publication for " + book1.getTitle() + ": " + book1.getPublicationYear());
    }
}