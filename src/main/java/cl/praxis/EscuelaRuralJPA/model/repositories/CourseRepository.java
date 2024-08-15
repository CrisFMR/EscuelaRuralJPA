package cl.praxis.EscuelaRuralJPA.model.repositories;


import cl.praxis.EscuelaRuralJPA.model.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
