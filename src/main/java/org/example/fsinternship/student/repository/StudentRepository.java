package org.example.fsinternship.student.repository;

import org.example.fsinternship.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}