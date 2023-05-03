package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person[] array = new Person[]{
                new Teacher("Serge Johansson", Person.Gender.M, "Computer science", Teacher.AcademicDegree.PHD, "Programming paradigms"),
                new Teacher("Sandra Turner", Person.Gender.F, "Jurisprudence", Teacher.AcademicDegree.DOCTOR_OF_SCIENCES, "Domestic arbitration"),
                new Student("Leo Wilkinson", Person.Gender.M, "Computer science", Student.TrainingStage.BACHELOR, "III"),
                new Student("Anna Cunningham", Person.Gender.F, "World economy", Student.TrainingStage.BACHELOR, "I"),
                new Student("Jill Lundqvist", Person.Gender.F, "Jurisprudence", Student.TrainingStage.MASTER, "I"),
                new GraduateStudent("Ronald Correa", Person.Gender.M, "Computer science", "Design of a functional programming language.")
        };
        //Person.printAll(array);
        System.out.println();
        List<Person> collectionP = new ArrayList<>(Arrays.asList(array));
        System.out.println("Выведем на печать данные обо всех персонах коллекции типа <Person>:");
        Person.printAll(collectionP);
        System.out.println("_________________________________________________________________________________________");

        List<Teacher> collectionT = new ArrayList<>();
        collectionT.add(0, new Teacher("Andrey Matveev", Person.Gender.M, "Computer science", Teacher.AcademicDegree.CANDIDATE_OF_SCIENCES, "Programming paradigms"));
        collectionT.add(1, new Teacher("Olga Buzova", Person.Gender.F, "Jurisprudence", Teacher.AcademicDegree.DOCTOR_OF_SCIENCES, "Domestic arbitration"));
        System.out.println("Выведем на печать данные обо всех персонах коллекции типа <Teacher>:");
        Person.printAll(collectionT);
        System.out.println("_________________________________________________________________________________________");

        System.out.println("Демонстрация метода заполнения параметризированной коллекции типа <Student>:");
        List <Student> collectionS = new ArrayList<>();
        Student.completion(collectionS);
        Person.printAll(collectionS);
        System.out.println("_________________________________________________________________________________________");

        System.out.println("Демонстрация метода заполнения параметризированной коллекции типа <Person>:");
        List <Person> collectionP2 = new ArrayList<>();
        Student.completion(collectionP2);
        Person.printAll(collectionP2);


    }
}