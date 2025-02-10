public class Person {
    private String surname;
    private String lastname;

    public Person() {
        this("", "");
    }

    public Person(String surname, String lastname) {
        this.surname = surname;
        this.lastname = lastname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
