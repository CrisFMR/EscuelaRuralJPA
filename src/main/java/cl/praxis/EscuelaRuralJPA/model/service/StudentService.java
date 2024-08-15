package cl.praxis.EscuelaRuralJPA.model.service;

import cl.praxis.EscuelaRuralJPA.model.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findOne(int id);
    boolean create(Student s);
    boolean update(Student s);
    boolean delete(int id);
}
