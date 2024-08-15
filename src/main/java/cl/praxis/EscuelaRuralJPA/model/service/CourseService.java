package cl.praxis.EscuelaRuralJPA.model.service;

import cl.praxis.EscuelaRuralJPA.model.entities.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAll();
    Course findOne(int id);
}
