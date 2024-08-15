package cl.praxis.EscuelaRuralJPA.model.service;

import cl.praxis.EscuelaRuralJPA.model.entities.Student;
import cl.praxis.EscuelaRuralJPA.model.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public Student findOne(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean create(Student s) {
        Student result = repository.save(s);
        return result != null;
    }

    @Override
    public boolean update(Student s) {

        Student student = repository.save(s);

        return student != null;
    }

    @Override
    public boolean delete(int id) {
        boolean exist = repository.existsById(id);
        if(exist) {
        repository.deleteById(id);
        }
        return exist;
    }
}
