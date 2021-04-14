package pl.kmiecik.reaktywne;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootTest
class ReaktywneApplicationTests {

    @Test
    void contextLoads() {
        Flux.just("Jan","Karol","Basia")
                .filter(element->element.startsWith("B"))
                .map(String::toUpperCase)
                .subscribe(s-> System.out.println(s));

        Mono.just("Jan");
    }

}
