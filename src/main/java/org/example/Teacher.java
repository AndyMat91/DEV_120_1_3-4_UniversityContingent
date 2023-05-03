package org.example;

public class Teacher extends Person {

    public enum AcademicDegree {
        CANDIDATE_OF_SCIENCES("Candidate"),
        DOCTOR_OF_SCIENCES("Doctor"),
        PHD("PhD");

        private String degree;

        AcademicDegree(String degree) {
            this.degree = degree;
        }

        public String getDegree() {
            return degree;
        }

        public void setDegree(String degree) {
            this.degree = degree;
        }
    }

    private String specialization;
    private AcademicDegree degree;

    public Teacher(String name, Gender sex, String faculty, AcademicDegree degree, String specialization) {
        super(name, sex, faculty);
        setSpecialization(specialization);
        this.degree = degree;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getSex().getTitle() + " has " + degree.getDegree() +
                " degree in " + getSpecialization() + ".\n");
    }
}

