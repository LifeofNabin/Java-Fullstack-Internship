package org.example.fsinternship.student.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String course;
    private String dept;

    public Student() {}

    public Student(String name, String course, String dept) {
        this.name = name;
        this.course = course;
        this.dept = dept;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }
    public String getDept() { return dept; }

    public void setName(String name) { this.name = name; }
    public void setCourse(String course) { this.course = course; }
    public void setDept(String dept) { this.dept = dept; }
}