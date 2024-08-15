package cl.praxis.EscuelaRuralJPA.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name= "estudiantes")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private int studentId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private int years;
    private String gender;

    @ManyToOne
    @JoinColumn(name="course_id", insertable = true, updatable = true)
    private Course course;

    public Student() {
    }

    public Student(int studentId, String firstName, String lastName, int years, String gender, Course course) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.years = years;
        this.gender = gender;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", years=" + years +
                ", gender='" + gender + '\'' +
                ", course=" + course +
                '}';
    }
}
