package cl.praxis.EscuelaRuralJPA.model.repositories;

import cl.praxis.EscuelaRuralJPA.model.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
