package json.parser001_json.entity;

import java.util.List;

public class Person {
    private  Work work;
    private String firstName;
    private String lastName;

    // Класс под отдельные перменные
    private Work Work;

    //Ссылки (массив)
    private List<String> personalContacts;

    // Конструкторы


    public Person() { }

    public Person(String firstName, String lastName, Work work, List<String> personalContacts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.work = work;
        this.personalContacts = personalContacts;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Work getWork() {
        return Work;
    }

    public void setWork(Work work) {
        Work = work;
    }

    public List<String> getPersonalContacts() {
        return personalContacts;
    }

    public void setPersonalContacts(List<String> personalContacts) {
        this.personalContacts = personalContacts;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", work=" + work +
                ", personalContacts=" + personalContacts +
                '}';
    }
}
