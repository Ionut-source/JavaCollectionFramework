package ro.ctrln.java.collections.model;

import java.util.Objects;

public class PersonComparable implements Comparable<PersonComparable> {

    private String firstName;
    private String lastName;
    private Integer age;
    private String job;

    public PersonComparable(String firstName, String lastName, Integer age, String job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.job = job;
    }

    @Override
    public int compareTo(PersonComparable otherPerson) {
        if (this.equals(otherPerson) || this.hashCode() == otherPerson.hashCode())
        return 0;
        return this.getAge().compareTo(otherPerson.getAge());
        //return this.getAge() < otherPerson.getAge() ? -1 : this.getAge() > otherPerson.getAge() ? 1 : 0;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonComparable person = (PersonComparable) o;
        return firstName.equals(person.firstName) && lastName.equals(person.lastName) && age.equals(person.age) && job.equals(person.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, job);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
