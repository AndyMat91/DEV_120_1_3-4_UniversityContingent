package org.example;

import java.util.Collection;

public class Student extends Person {

    public enum TrainingStage {
        BACHELOR("Bachelor"),
        MASTER("Master");
        private String stage;

        TrainingStage(String stage) {
            setStage(stage);
        }

        public String getStage() {
            return stage;
        }

        public void setStage(String stage) {
            this.stage = stage;
        }
    }

    private String courseNumber;
    private TrainingStage stage;

    public Student(String name, Gender sex, String faculty, TrainingStage stage, String courseNumber) {
        super(name, sex, faculty);
        setCourseNumber(courseNumber);
        this.stage = stage;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public static void completion (Collection<? super Student> collection){
        collection.add(new Student("Leo Wilkinson", Gender.M, "Computer science", TrainingStage.BACHELOR, "III"));
        collection.add(new Student("Anna Cunningham", Person.Gender.F, "World economy", Student.TrainingStage.BACHELOR, "I"));
        collection.add(new Student("Jill Lundqvist", Person.Gender.F, "Jurisprudence", Student.TrainingStage.MASTER, "I"));
    }
    @Override
    public void print() {
        super.print();
        System.out.println(getSex().getTitle() + " is " + getCourseNumber() +
                "'th year " + stage.getStage() + " student.\n");
    }
}
