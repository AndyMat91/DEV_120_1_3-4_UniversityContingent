package org.example;

public class GraduateStudent extends Person {
    private String dissertationTopic;

    public GraduateStudent(String name, Gender sex, String faculty, String dissertation) {
        super(name, sex, faculty);
        setDissertationTopic(dissertation);
    }

    public String getDissertationTopic() {
        return dissertationTopic;
    }

    public void setDissertationTopic(String dissertationTopic) {
        this.dissertationTopic = dissertationTopic;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getSex().getTitle() + " thesis title is " + getDissertationTopic());
    }
}
