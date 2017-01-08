package com.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
    private Date takeInDate;
    private Faculty faculty;

    @ManyToOne
    @JoinColumn(name = "faculty_id", referencedColumnName = "id")
    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "takeInDate")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTakeInDate() {
        return takeInDate;
    }

    public void setTakeInDate(Date takeInDate) {
        this.takeInDate = takeInDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (age != student.age) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (email != null ? !email.equals(student.email) : student.email != null) return false;
        if (takeInDate != null ? !takeInDate.equals(student.takeInDate) : student.takeInDate != null) return false;
        return faculty != null ? faculty.equals(student.faculty) : student.faculty == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (takeInDate != null ? takeInDate.hashCode() : 0);
        result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", takeInDate=" + takeInDate +
                ", faculty=" + faculty +
                '}';
    }
}
