package cl.praxis.EscuelaRuralJPA.controller;

import cl.praxis.EscuelaRuralJPA.model.entities.Student;
import cl.praxis.EscuelaRuralJPA.model.service.CourseService;
import cl.praxis.EscuelaRuralJPA.model.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {
    private final StudentService service;
    private final CourseService courseService;

    public StudentController(StudentService service, CourseService courseService) {
        this.service = service;
        this.courseService = courseService;
    }

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("students", service.findAll());
        return "studentList";
    }

    @GetMapping("/{id}")
    public String findOne(@PathVariable("id") int id, Model model){
        model.addAttribute("student", service.findOne(id));
        model.addAttribute("courses", courseService.findAll());
        return "studentEdit";
    }

    @PostMapping
    public String Update(@ModelAttribute Student student){
        System.out.println(student.toString());
        //boolean result = service.update(student);
        return "redirect:/students";
    }

    @GetMapping("/new")
    public String toCreate(Model model){
        model.addAttribute("courses", courseService.findAll());
        return "studentNew";
    }

    @PostMapping("/new")
    public String create(@ModelAttribute Student student) {
        boolean result = service.create(student);

        return "redirect:/students";
    }

    @GetMapping("/{id}/del")
    public String delete(@PathVariable("id") int id){
        boolean result = service.delete(id);

        return "redirect:/students";
    }
}
