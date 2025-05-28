import java.util.Objects;

class Author {
    private String firstName;
    private String lastName;

    // Конструктор
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Геттеры
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // isAdult
    @Override
    public String toString() {
        return "Имя : " + firstName + " Фамилия: " + lastName;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Author)) return false;
        Author other = (Author) object;
        return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
