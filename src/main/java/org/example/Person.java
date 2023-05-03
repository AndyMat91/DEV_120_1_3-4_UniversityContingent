package org.example;

import java.util.Collection;

public class Person{
    private String name;
    private Gender sex;
    private String faculty;

    public enum Gender {
        M("He"),
        F("She");

        private String title;

        Gender(String title) {
            setTitle(title);
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public Person(String name, Gender sex, String faculty) {
        setName(name);
        this.sex = sex;
        setFaculty(faculty);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Gender getSex() {
        return sex;
    }

    public void print() {
        System.out.print("This is " + getName() + ". " + sex.getTitle() +
                " " + (getClass().getSimpleName().equals("Teacher") ? "teaches" : "studies") +
                " at " + getFaculty() + "\n");
    }

   public static void printAll(Person[] ar) {
        if (ar != null) {
            for (Person p : ar) {
                p.print();
            }
        }
    }
public static  void printAll(Collection<? extends Person> collection) {
    if (collection != null) collection.forEach(Person::print);
}

}
