package oop.lab02.constructors;

public class Student {

    private final String name;
    private final String surname;
    private final int id;
    private final int matriculationYear;

    public Student(final String name, final String surname, final int id, final int matriculationYear) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.matriculationYear = matriculationYear;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getId() {
        return this.id;
    }

    public int getMatriculationYear() {
        return this.matriculationYear;
    }

    void printStudentInfo() {
        System.out.println("Student id: " + this.id);
        System.out.println("Student name: " + this.name);
        System.out.println("Student surname: " + this.surname);
        System.out.println("Student matriculationYear: " + this.matriculationYear + "\n");
    }
}
