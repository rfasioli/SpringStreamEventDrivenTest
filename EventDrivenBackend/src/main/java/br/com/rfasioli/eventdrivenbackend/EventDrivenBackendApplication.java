package br.com.rfasioli.eventdrivenbackend;

import br.com.rfasioli.eventdrivenbackend.interfaces.Processor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(Processor.class)
public class EventDrivenBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventDrivenBackendApplication.class, args);
    }

}