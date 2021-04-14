package pl.kmiecik.reaktywne;

import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class StudentApi {

    private Flux<Student> studentFlux;

    public StudentApi(){
        new Student("Jan","Nowak");
        new Student("Jan","Nowak");

    }


    public Flux<Student> getStudent(){
        return studentFlux.delayElements(Duration.ofSeconds(2));
    }
}
