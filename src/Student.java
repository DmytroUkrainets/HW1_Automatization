import java.util.Objects;

/**
 * The Student class represents a student with certain characteristics,
 * in which the comparison and hashing methods are written correctly.
 */
public class Student {
    private String surname;
    private String name;
    private String patronymic;
    private int age;
    private int year;
    private double averageMark;

    /**
     * The constructor creates a new Student object with the specified parameters.
     *
     * @param surname surname of the student, cannot be null.
     * @param name student name, cannot be null.
     * @param patronymic patronymic of the student, cannot be null.
     * @param age age of the student.
     * @param year the student's year of study.
     * @param averageMark the average mark of the student.
     * @throws NullPointerException if any of the string parameters is null.
     */
    public Student(String surname, String name, String patronymic, int age, int year, double averageMark) throws NullPointerException {
        this.surname = Objects.requireNonNull(surname, "Surname cannot be null");
        this.name = Objects.requireNonNull(name, "Name cannot be null");
        this.patronymic = Objects.requireNonNull(patronymic, "Patronymic cannot be null");
        this.age = age;
        this.year = year;
        this.averageMark = averageMark;
    }

    /**
     * The default constructor creates a new Student object with standard parameters.
     */
    public Student() {
        this.surname = "Petrenko";
        this.name = "Petro";
        this.patronymic = "Petrovych";
        this.age = 18;
        this.year = 1;
        this.averageMark = 95.5;
    }

    /**
     * Returns the student's last name.
     *
     * @return student's last name.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the student's last name.
     *
     * @param surname new surname of the student, cannot be null.
     * @throws NullPointerException if surname is null.
     */
    public void setSurname(String surname) {
        this.surname = Objects.requireNonNull(surname, "Surname cannot be null");
    }

    /**
     * Returns the name of the student.
     *
     * @return the name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     *
     * @param name new student name, cannot be null.
     * @throws NullPointerException if name is null.
     */
    public void setName(String name) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
    }

    /**
     * Returns the student's middle name.
     *
     * @return the student's middle name.
     */
    public String getPatronymic() {
        return patronymic;
    }

    /**
     * Sets the student's patronymic.
     *
     * @param patronymic new patronymic of the student, cannot be null.
     * @throws NullPointerException if patronymic is null.
     */
    public void setPatronymic(String patronymic) {
        this.patronymic = Objects.requireNonNull(patronymic, "Patronymic cannot be null");
    }

    /**
     * Returns the age of the student.
     *
     * @return the age of the student.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the student.
     *
     * @param age the new age of the student.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns the student's year of study.
     *
     * @return year of study of the student.
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the student's year of study.
     *
     * @param year the student's new year of study.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Returns the average score of the student.
     *
     * @return the GPA of the student.
     */
    public double getAverageMark() {
        return averageMark;
    }

    /**
     * Sets the average score of the student.
     *
     * @param averageMark the student's new grade point average.
     */
    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    /**
     * Compares this Student object with another object to determine equality.
     *
     * @param o object to compare.
     * @return true if the objects are equal, otherwise false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getAge() == student.getAge() && getYear() == student.getYear() && Double.compare(student.getAverageMark(), getAverageMark()) == 0 && getSurname().equals(student.getSurname()) && getName().equals(student.getName()) && getPatronymic().equals(student.getPatronymic());
    }

    /**
     * Returns the hash code for the Student object.
     *
     * @return the hash code of the object.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(getSurname());
        result = prime * result + Objects.hashCode(getName());
        result = prime * result + Objects.hashCode(getPatronymic());
        result = prime * result + getAge();
        result = prime * result + getYear();
        long temp = Double.doubleToLongBits(getAverageMark());
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /**
     * Returns a string representation of the Student object.
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return getSurname() + " "
                + getName() + " "
                + getPatronymic() + ", "
                + getAge() + " y.o., "
                + getYear() + " e.y., "
                + getAverageMark() + " avg.";
    }
}