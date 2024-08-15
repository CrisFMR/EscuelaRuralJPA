package cl.praxis.EscuelaRuralJPA.model.service;

import cl.praxis.EscuelaRuralJPA.model.entities.Course;
import cl.praxis.EscuelaRuralJPA.model.repositories.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repository;

    public CourseServiceImpl(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Course> findAll() {
        return repository.findAll();
    }

    @Override
    public Course findOne(int id) {
        return repository.findById(id).orElse(null);
    }
}
