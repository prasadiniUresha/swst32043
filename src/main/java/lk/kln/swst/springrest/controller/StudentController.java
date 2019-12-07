package lk.kln.swst.springrest.controller;

import lk.kln.swst.springrest.model.Student;
import lk.kln.swst.springrest.repository.StudentRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    StudentRepository studentRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Student get() throws IllegalArgumentException{
        Student student = new Student();
        student.setName("Prasadini");
        student.setAge(23);
        return student;
    }

    @RequestMapping(method = RequestMethod.POST)
    public  Student save(@RequestBody Student student){
        return studentRepository.save(student);
    }
}
